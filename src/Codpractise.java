//import java.util.Scanner;
//
//public class Codpractise {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
/// /
/// /        // 1. PALINDROME SONNI TEKSHIRISH
/// /        int number = 121;
/// /        int originalNumber = number;
/// /        int reversedNumber = 0;
/// /
/// /        while (number > 0) {
/// /            int remainder = number % 10;
/// /            reversedNumber = reversedNumber * 10 + remainder;
/// /            number = number / 10;
/// /        }
/// /
/// /
/// /
/// /        if (originalNumber == reversedNumber) {
/// /            System.out.println(originalNumber + " - Palindrome son.");
/// /        } else {
/// /            System.out.println(originalNumber + " - Palindrome son emas.");
/// /        }
//
//
//
//        // 2. FIBONACCI
//        int n = 7;
//        int a = 0;
//        int b = 1;
//
//        System.out.print("Dastlabki " + n + " ta Fibonacci soni: ");
//        System.out.print(a + " " + b + " ");
//
//        for (int i = 2; i <= n; i++) {
//            int next = a + b;
//            System.out.print(next + " ");
//            a = b;
//            b = next;
//        }
//        System.out.println();
//
//
//
////        // 3. CALCULATOR
////        System.out.print("Birinchi sonni kiriting: ");
////        double num1 = input.nextDouble();
////
////        System.out.print("Amalni kiriting (+, -, *, /): ");
////        char operator = input.next().charAt(0);
////
////        System.out.print("2 sonni kiriting: ");
////        double num2 = input.nextDouble();
////
////        double result = 0;
////
////        switch (operator) {
////            case '+':
////                result = num1 + num2;
////                break;
////            case '-':
////                result = num1 - num2;
////                break;
////            case '*':
////                result = num1 * num2;
////                break;
////            case '/':
////                if (num2 != 0) {
////                    result = num1 / num2;
////                } else {
////                    System.out.println("0 bo'lib bo'lmaydi!");
////                    return;
////                }
////                break;
////            default:
////                System.out.println("Noto'g'ri amal kiritildi!");
////                return;
////        }
////
////        System.out.println("Natija: " + result);
//    }
//}

