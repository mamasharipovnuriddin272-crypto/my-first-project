import java.util.Scanner;

public class Depend {

    static Scanner sc = new Scanner(System.in);

    static String[] names = {"Non", "Sut", "Tuxum"};
    static int[] prices = {4000, 12000, 18000, };
    static int[] stock = {30, 15, 10};
    static int[] cart = new int[names.length];

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1. Mahsulotlar");
            System.out.println("2. Savatga qo'shish");
            System.out.println("3. Savatni ko'rish");
            System.out.println("4. To'lov");
            System.out.println("0. Chiqish");
            System.out.print("Tanlang: ");

            int choice = sc.nextInt();

            if (choice == 0) break;
            switch (choice) {

                case 1:
                    for (int i = 0; i < names.length; i++) {
                        System.out.println((i + 1) + ". "
                                + names[i] + " - "
                                + prices[i] + " so'm"
                                + " (Qoldiq: " + stock[i] + ")");
                    }
                    break;

                case 2:
                    System.out.print("Mahsulot raqami: ");
                    int number = sc.nextInt() - 1;

                    if (number >= 0 && number < names.length
                            && cart[number] < stock[number]) {
                        cart[number]++;
                        System.out.println("Savatga qo'shildi!");
                    } else {
                        System.out.println("Tanlov noto'g'ri yoki mahsulot qolmagan!");
                    }
                    break;

                case 3:
                    int total = 0;

                    for (int i = 0; i < names.length; i++) {
                        if (cart[i] > 0) {
                            int sum = cart[i] * prices[i];
                            System.out.println(names[i] + " x "
                                    + cart[i] + " = " + sum + " so'm");
                            total += sum;
                        }
                    }

                    System.out.println("Jami: " + total + " so'm");
                    break;

                case 4:
                    int jami = 0;

                    for (int i = 0; i < names.length; i++) {
                        jami += cart[i] * prices[i];
                    }

                    if (jami == 0) {
                        System.out.println("Savat bo'sh!");
                        break;
                    }

                    System.out.println("To'lov: " + jami + " so'm");
                    System.out.println("1. Naqd");
                    System.out.println("2. Karta");
                    System.out.print("Tanlang: ");
                    int payment = sc.nextInt();

                    if (payment == 1 || payment == 2) {
                        for (int i = 0; i < names.length; i++) {
                            stock[i] -= cart[i];
                            cart[i] = 0;
                        }
                        System.out.println("Xaridingiz uchun rahmat!");
                    } else {
                        System.out.println("Noto'g'ri to'lov turi!");
                    }
                    break;

                default:
                    System.out.println("Noto'g'ri tanlov!");
            }
        }
        while (true) {
            System.out.println("\n1. Mahsulotlar");
            System.out.println("2. Savatga qo'shish");
            System.out.println("3. Savatni ko'rish");
            System.out.println("4. To'lov");
            System.out.println("0. Chiqish");
            System.out.print("Tanlang: ");

            int choice = sc.nextInt();

            if (choice == 0) break;

            switch (choice) {

                case 1:
                    for (int i = 0; i < names.length; i++) {
                        System.out.println((i + 1) + ". "
                                + names[i] + " - "
                                + prices[i] + " so'm"
                                + " (Qoldiq: " + stock[i] + ")");
                    }
                    break;

                case 2:
                    System.out.print("Mahsulot raqami: ");
                    int number = sc.nextInt() - 1;

                    if (number >= 0 && number < names.length
                            && cart[number] < stock[number]) {
                        cart[number]++;
                        System.out.println("Savatga qo'shildi!");
                    } else {
                        System.out.println("Tanlov noto'g'ri yoki mahsulot qolmagan!");
                    }
                    break;

                case 3:
                    int total = 0;

                    for (int i = 0; i < names.length; i++) {
                        if (cart[i] > 0) {
                            int sum = cart[i] * prices[i];
                            System.out.println(names[i] + " x "
                                    + cart[i] + " = " + sum + " so'm");
                            total += sum;
                        }
                    }

                    System.out.println("Jami: " + total + " so'm");
                    break;

                case 4:
                    int jami = 0;

                    for (int i = 0; i < names.length; i++) {
                        jami += cart[i] * prices[i];
                    }

                    if (jami == 0) {
                        System.out.println("Savat bo'sh!");
                        break;
                    }

                    System.out.println("To'lov: " + jami + " so'm");
                    System.out.println("1. Naqd");
                    System.out.println("2. Karta");
                    System.out.print("Tanlang: ");
                    int payment = sc.nextInt();

                    if (payment == 1 || payment == 2) {
                        for (int i = 0; i < names.length; i++) {
                            stock[i] -= cart[i];
                            cart[i] = 0;
                        }
                        System.out.println("Xaridingiz uchun rahmat!");
                    } else {
                        System.out.println("Noto'g'ri to'lov turi!");
                    }
                    break;

                default:
                    System.out.println("Noto'g'ri tanlov!");


            }
        }
    }
}