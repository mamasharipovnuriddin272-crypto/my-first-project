import java.util.Scanner;

public class CopyIdea {

    static String[] names = {
            "Non", "Sut 1L", "Tuxum 10 dona", "Shakar 1kg",
            "Choy 100g", "Guruch 1kg", "Olma 1kg", "Suv 1.5L"
    };

    static int[] prices = {
            4000, 12000, 18000, 14000,
            9500, 22000, 15000, 3500
    };

    static int[] stock = {
            30, 15, 10, 12, 20, 8, 25, 40
    };

    static int[] cart = new int[names.length];
    static int[] sold = new int[names.length];

    static int dailyRevenue = 0;
    static int receiptNumber = 0;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isRunning = true;

        System.out.println("BIZNING BIRINCHI DO'KON MINI LOYIHAMIZ!");

        while (isRunning) {

            showMenu();

            int choice = readNumber(
                    "Operatsiyani tanlang: ",
                    0,
                    7
            );

            switch (choice) {

                case 1:
                    showProductList();
                    break;

                case 2:
                    addCart();
                    break;

                case 3:
                    removeFromCart();
                    break;

                case 4:
                    showCart();
                    break;

                case 5:
                    searchProduct();
                    break;

                case 6:
                    checkout();
                    break;

                case 7:
                    dailyReport();
                    break;

                case 0:
                    isRunning = false;
                    System.out.println("Dastur tugadi.");
                    break;
            }
        }
    }


    // ================= KUNLIK HISOBOT =================

    private static void dailyReport() {

        System.out.println();
        System.out.println("==================== Kunlik hisobot ==================");

        System.out.println("Cheklar soni: " + receiptNumber);
        System.out.println("Tushumlar: " + dailyRevenue + " so'm");

        int baseIndex = 0;

        for (int i = 1; i < sold.length; i++) {

            if (sold[i] > sold[baseIndex]) {
                baseIndex = i;
            }
        }

        if (sold[baseIndex] > 0) {

            System.out.println(
                    "Eng ko'p sotilgan: "
                            + names[baseIndex]
                            + " ("
                            + sold[baseIndex]
                            + ") ta"
            );
        } else {
            System.out.println("Hali mahsulot sotilmagan.");
        }


        System.out.println("Kam qolgan mahsulotlar:");

        boolean lowFound = false;

        for (int i = 0; i < stock.length; i++) {

            if (stock[i] < 5) {

                System.out.println(
                        "! "
                                + names[i]
                                + " - "
                                + stock[i]
                                + " ta"
                );

                lowFound = true;
            }
        }

        if (!lowFound) {
            System.out.println("Hamma mahsulot yetarli.");
        }
    }


    // ================= CHECKOUT =================

    private static void checkout() {

        // Savat bo'sh bo'lsa
        if (isEmptyCart()) {

            System.out.println("Savat bo'sh.");

            return;
        }

        int total = cartTotal();

        System.out.println(
                "To'lanadigan summa: "
                        + total
                        + " so'm"
        );

        int paymentMethod = readNumber(
                "To'lov usulini tanlang: (1-naqd, 2-karta)",
                1,
                2
        );

        int paid = total;

        if (paymentMethod == 1) {

            paid = readNumber(
                    "Xaridor kiritishi kerak bo'lgan summa: ",
                    1,
                    100_000_000
            );

            while (paid < total) {

                System.out.println(
                        "Mablag' yetarli emas!!! "
                                + (total - paid)
                                + " so'm yetmayapti."
                );

                paid = readNumber(
                        "Qaytadan summa kiriting: ",
                        1,
                        100_000_000
                );
            }
        }


        receiptNumber++;

        printReceipt(
                total,
                paymentMethod,
                paid
        );


        // Mahsulotlarni sotilgan deb hisoblaymiz
        for (int i = 0; i < cart.length; i++) {

            stock[i] -= cart[i];

            sold[i] += cart[i];

            cart[i] = 0;
        }

        dailyRevenue += total;
    }


    // ================= CHEK =================

    private static void printReceipt(
            int total,
            int paymentMethod,
            int paid
    ) {

        System.out.println();

        printLine('-', 43);

        System.out.println("               Maktab do'koni");

        System.out.println(
                "                  Chek #"
                        + receiptNumber
        );

        printLine('-', 43);


        for (int i = 0; i < cart.length; i++) {

            if (cart[i] > 0) {

                System.out.printf(
                        "%-15s %3d x %8s = %12s%n",
                        names[i],
                        cart[i],
                        prices[i],
                        cart[i] * prices[i]
                );
            }
        }


        printLine('-', 43);

        printReceiptLine(
                "To'landi:",
                total
        );


        if (paymentMethod == 1) {

            printReceiptLine(
                    "Naqd:",
                    paid
            );

            printReceiptLine(
                    "Qaytim:",
                    paid - total
            );
        }

        printLine('=', 43);

        System.out.println(
                "Xaridingiz uchun rahmat! :)"
        );
    }


    private static void printReceiptLine(
            String prompt,
            int paid
    ) {

        String text;

        if (paid < 0) {

            text = "-" + paid;

        } else {

            text = String.valueOf(paid);
        }

        System.out.printf(
                "%-20s %15s so'm%n",
                prompt,
                text
        );
    }


    // ================= SEARCH =================

    private static void searchProduct() {

        System.out.println();

        System.out.print(
                "Qaysi mahsulotni izlayapsiz? "
                        + "(0-bekor qilish): "
        );

        String keyword = sc.next().toLowerCase();


        // 0 bosilsa asosiy menyuga qaytadi
        if (keyword.equals("0")) {

            return;
        }


        boolean ifFound = false;


        for (int i = 0; i < names.length; i++) {

            if (names[i]
                    .toLowerCase()
                    .contains(keyword)) {

                System.out.printf(
                        "%-3d %-15s %12s so'm, qoldiq: %d%n",
                        i + 1,
                        names[i],
                        prices[i],
                        stock[i]
                );

                ifFound = true;
            }
        }


        if (!ifFound) {

            System.out.println(
                    "Bunday mahsulot topilmadi!!!"
            );
        }
    }


    // ================= SHOW CART =================

    private static void showCart() {

        if (isEmptyCart()) {

            System.out.println("Savat bo'sh.");

            return;
        }


        System.out.println();

        System.out.println(
                "--------------- SAVAT ----------------"
        );


        for (int i = 0; i < cart.length; i++) {

            if (cart[i] > 0) {

                System.out.printf(
                        "%-3d %-15s %3d x %9s = %10s%n",
                        i + 1,
                        names[i],
                        cart[i],
                        prices[i],
                        cart[i] * prices[i]
                );
            }
        }


        printLine('-', 43);

        System.out.println(
                "Jami: "
                        + cartTotal()
                        + " so'm"
        );
    }


    // ================= CART TOTAL =================

    private static int cartTotal() {

        int total = 0;

        for (int i = 0; i < cart.length; i++) {

            total += prices[i] * cart[i];
        }

        return total;
    }


    // ================= EMPTY CART =================

    static boolean isEmptyCart() {

        for (int quantity : cart) {

            if (quantity > 0) {

                return false;
            }
        }

        return true;
    }


    // ================= REMOVE FROM CART =================

    private static void removeFromCart() {

        if (isEmptyCart()) {

            System.out.println("Savat bo'sh.");

            return;
        }


        showCart();


        int number = readNumber(
                "Qaysi mahsulotni olmoqchisiz? (0-bekor)",
                0,
                names.length
        );


        if (number == 0) {

            return;
        }


        number = number - 1;


        if (cart[number] == 0) {

            System.out.println(
                    "Bu mahsulot savatda yo'q."
            );

            return;
        }


        int quantity = readNumber(
                "Nechta olib tashlamoqchisiz?",
                1,
                cart[number]
        );


        cart[number] -= quantity;


        System.out.println(
                "Savatdan "
                        + quantity
                        + " ta "
                        + names[number]
                        + " olindi."
        );
    }


    // ================= ADD TO CART =================

    private static void addCart() {

        showProductList();


        int number = readNumber(
                "Qaysi mahsulotni kiritmoqchisiz? (0-bekor)",
                0,
                names.length
        );


        if (number == 0) {

            return;
        }


        number = number - 1;


        int available = stock[number] - cart[number];


        // Mahsulot qolmagan
        if (available <= 0) {

            System.out.println(
                    names[number]
                            + " mahsulot qolmagan."
            );

            return;
        }


        int quantity = readNumber(
                "Nechta? ",
                1,
                available
        );


        cart[number] += quantity;


        System.out.println(
                "Savatga "
                        + quantity
                        + " ta "
                        + names[number]
                        + " qo'shildi!"
        );
    }


    // ================= PRODUCT LIST =================

    private static void showProductList() {

        System.out.printf(
                "%-3s %-18s %10s %8s%n",
                "#",
                "Mahsulot",
                "Narx",
                "Qoldiq"
        );


        printLine('-', 43);


        for (int i = 0; i < names.length; i++) {

            System.out.printf(
                    "%-3d %-18s %,10d %8d%n",
                    i + 1,
                    names[i],
                    prices[i],
                    stock[i]
            );
        }


        System.out.printf(
                "%-3s %-18s %,10d %8d%n",
                "0",
                "Chiqish",
                0,
                0
        );
    }


    // ================= MENU =================

    static void showMenu() {

        printLine('=', 43);

        System.out.println(
                "1. Mahsulotlar ro'yxati"
        );

        System.out.println(
                "2. Savatga qo'shish"
        );

        System.out.println(
                "3. Savatdan olib tashlash"
        );

        System.out.println(
                "4. Savatni ko'rish"
        );

        System.out.println(
                "5. Mahsulotni qidirish"
        );

        System.out.println(
                "6. To'lov va chek"
        );

        System.out.println(
                "7. Kun hisoboti"
        );

        System.out.println(
                "0. Chiqish"
        );

        printLine('=', 43);
    }


    // ================= READ NUMBER =================

    static int readNumber(
            String prompt,
            int min,
            int max
    ) {

        while (true) {

            System.out.println(prompt);


            if (sc.hasNextInt()) {

                int number = sc.nextInt();


                if (number >= min && number <= max) {

                    return number;
                }


                System.out.println(
                        "Siz kiritgan son oraliqda emas!!!!"
                );

            } else {

                System.out.println(
                        "Siz kiritgan belgi son emas!!!!"
                );

                // Noto'g'ri belgini Scanner'dan olib tashlaymiz
                sc.next();
            }
        }
    }


    // ================= PRINT LINE =================

    static void printLine(
            char symbol,
            int count
    ) {

        for (int i = 0; i < count; i++) {

            System.out.print(symbol);
        }

        System.out.println();
    }
}