

import java.util.Scanner;

public class MarketScanner {

    static String[] names = {"Non", "Sut 1L", "Tuxum 10 dona", "Shakar 1kg",
            "Choy 100g", "Guruch 1kg", "Olma 1kg", "Suv 1.5L"}; //Nomlari
    static int[] prices = {4000, 12000, 18000, 14000, 9500, 22000, 15000, 3500}; //Narxlar
    static int[] stock = {30, 15, 10, 12, 20, 8, 25, 40};//Mahsulot qoldiqi
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
            int choice = readNumber("Operatsiyani tanglang: ", 0, names.length);
            switch (choice) {
                case 1:
                    showProductList(); //COMPLETED
                    break;
                case 2:
                    addCart(); //COMPLETED
                    break;
                case 3:
                    removeFromCart(); //COMPLETED
                    break;
                case 4:
                    showCart(); //COMPLETED
                    break;
                case 5:
                    searchProduct(); //COMPLETED
                    break;
                case 6:
                    checkout(); //COMPLETED
                    break;
                case 7:
                    dailyReport(); //COMPLETED
                    break;
                case 0:
                    isRunning = false;
                    break;
            }
        }
    }

    private static void dailyReport() {
        System.out.println();
        System.out.println("====================Kunlik hisobot==================");
        System.out.println("Cheklar soni:    " + receiptNumber);
        System.out.println("Tushumlar:    " + dailyRevenue + " so'm");

        int baseIndex = 0;
        for (int i = 1; i < sold.length; i++) {
            if (sold[i] > sold[baseIndex]) {
                baseIndex = i;
            }
        }

        if (sold[baseIndex] > 0) {
            System.out.println("Eng ko'p sotilgan : " + names[baseIndex] + "(" + sold[baseIndex] + ") ta");
        }

        System.out.println("Kam qolgan 5 ta mahsulot");
        boolean lowFound = false;
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] < 5) {
                System.out.println("  ! " + names[i] + " - " + stock[i] + " ta");
                lowFound = true;
            }
        }

        if (!lowFound) {
            System.out.println("Hamma mahsulot yetarli");
        }
    }

    private static void checkout() {
        if (isEmptyCart()) {
            System.out.println("Savat bo'sh");
        }
        int total = cartTotal();
        System.out.println("To'lanadigan summa " + total + " so'm");
        int paymentMethod = readNumber("To'lov usulini tanlagn: (1-naqd, 2-karta)", 1, 2);
        int paid = total;
        // 1 000 60 000 000
        // 60 000
        if (paymentMethod == 1) {
            paid = readNumber("Xaridor kiritilishi kerak bo'lgan summa: ", 1, 100_000_000);
            if (paid < total) {
                System.out.println("Mablag' yetarli emas!!! " + (total - paid) + " so'm");
                paid = readNumber("Xaridor kiritilishi kerak bo'lgan summa: ", 1, 100_000_000);
            }
        }

        // 0 ta chek bor edi
        receiptNumber++;
        printReceipt(total, paymentMethod, paid);

        for (int i = 0; i < cart.length; i++) {
            stock[i] -= cart[i];
            sold[i] += cart[i];
            cart[i] = 0;
        }

        dailyRevenue += total;
    }

    private static void printReceipt(int total, int paymentMethod, int paid) {
        System.out.println();
        printLine('-', 43);
        System.out.println("               Maktab do'koni");
        System.out.println("                  Chek #" + receiptNumber);
        printLine('-', 43);
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] > 0) {
                System.out.printf("%-15s %3d x %8s = %12s%n", names[i], cart[i], prices[i], cart[i] * prices[i]);
            }
        }
        printLine('-', 43);

        printReceiptLine("To'landi:", total);
        if (paymentMethod == 1) {
            printReceiptLine("Naqd: ", paid);
            printReceiptLine("Qaytim: ", paid - total);
        }
        printLine('=', 43);
        System.out.println("Xaridingiz uchun rahmat! :) ");
    }

    private static void printReceiptLine(String prompt, int paid) {
        String text;
        if (paid < 0) {
            text = "-" + paid;
        } else {
            text = String.valueOf(paid);
        }
        System.out.printf("%-20s %15s so'm %n", prompt, text);
    }

    private static void searchProduct() {
        //Shu joyida productlarni qayt sorashi kerak 0 belgilaganda asosiy menuga qaytish kerak==== #TASK
        boolean isRunning=true;
        while(isRunning) {
        }
        System.out.print("Qaysi mahsultoni izlayapsiz? (0-bekor qilish)");
        String keyword = sc.next().toLowerCase();// Olma Non - olma non
        boolean ifFound = false;
        // == //equals
        // olma 1kg, olma


        for (int i = 0; i < names.length; i++) {
            if (names[i].toLowerCase().contains(keyword)) {
                System.out.printf("%-3d %-15s %12s so'm, qoldiq: %d%n", i + 1, names[i], prices[i], stock[i]);
                ifFound = true;
            }
        }

        if (!ifFound) {
            System.out.println("Bunday mahsulot topilmadi!!!");
        }
    }

    private static void showCart() {
        if (isEmptyCart()) {
            System.out.println("Savat bo'sh");
        }
        System.out.println();
        System.out.println("---------------SAVAT----------------");
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] > 0) {
                System.out.printf("%-3d %-15s %3d x %9s = %10s%n", i + 1, names[i], cart[i], prices[i], cart[i] * prices[i]);
            }
        }
        printLine('-', 43);
        System.out.println("Jami: " + cartTotal() + " so'm");
    }

    private static int cartTotal() {
        int total = 0;
        for (int i = 0; i < cart.length; i++) {
            total += prices[i] * cart[i];
        }
        return total;
    }

    static boolean isEmptyCart() {
        for (int quantity : cart) {
            if (quantity > 0) {
                return false;
            }
        }
        return true;
    }

    private static void removeFromCart() {
        //Shu joyida productlarni qayt sorashi kerak 0 belgilaganda asosiy menuga qaytish kerak==== #TASK
        if (isEmptyCart()) {
            System.out.println("Savat bo'sh");
        }
        showCart();
        int number = readNumber("Qaysi mahsulotni olmoqchisz? (0-Bekor)", 0, names.length);
        if (number == 0) return;
        number = number - 1;

        if (cart[number] == 0) {
            System.out.println("Savat mahsulot yoq");
        }
        int quantity = readNumber("Nechta olib tashlamoqchisz? ", 1, cart[number]);
        cart[number] -= quantity;
        System.out.println("Savatdan " + quantity + " ta " + names[number] + " olindi");
    }

    private static void addCart() {
        //Shu joyida productlarni qayt sorashi kerak 0 belgilaganda asosiy menuga qaytish kerak==== #TASK
        showProductList();
        int number = readNumber("Qaysi mahsulotni kiritmoqchisz? (0-Bekor)", 0, names.length);
        if (number == 0) return;
        number = number - 1;
        int available = stock[number] - cart[number];
        if (available < 0) {
            System.out.println(names[number] + " mahsulot qolmagan");
        }
        int quantity = readNumber("Nechta? ", 1, available);
        cart[number] += quantity;
        System.out.println("Savatga " + quantity + " ta mahsulot qoshildi!");
    }

    private static void showProductList() {
        System.out.printf("%-3s %-18s %10s %8s%n",
                "#", "Mahsulot", "Narx", "Qoldiq");

        printLine('-', 43);

        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-3d %-18s %,10d %8d%n",
                    i + 1,
                    names[i],
                    prices[i],
                    stock[i]);
        }
        System.out.printf("%-3s %-18s %,10d %8d%n",
                "0",
                "Chiqish",
                0,
                0);
    }

    static void showMenu() {
        printLine('=', 43);
        System.out.println("1. Mahsulotlar ro'yhati");
        System.out.println("2. Savatga qo'shish");
        System.out.println("3. Savatdan olib tashlash");
        System.out.println("4. Savatni ko'rish");
        System.out.println("5. Mahsulotni qidirish");
        System.out.println("6. To'lov va chek");
        System.out.println("7. Kun hisoboti");
        System.out.println("0. Chiqish");
        printLine('=', 43);
    }

    static int readNumber(String prompt, int min, int max) {
        while (true) {
            System.out.println(prompt);
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number >= min && number <= max) {
                    return number;
                }
                System.out.println("Siz kiritgan son oraliqda emass!!!!");
            } else {
                System.out.println("Siz kiritgan belgi son emas!!!!");
            }
        }
    }

    static void printLine(char symbol, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}
