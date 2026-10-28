////public class ToDo {
////    String name;
////    Double price;
////    int stock;
////
////    ToDo( String name, double price, int Stock){
////        Object Throw = null;
////        if (price <=0) null new IllegalArgumentException("Narax Musbat Bo`lishi kerak");
////        this.name = name;
////        this.price = price;
////        this.stock = stock;
////
////
////    }
////}
//
////dataType
//public class ToDo {
//    String name = "nuridin";
//    String city = "Samarqand";
//
//}
////codition if\else
//
//
//void main() {
//    int age = 15;
//
//    if (age >= 18) {
//        System.out.println("Katta");
//    } else {
//        System.out.println("Yosh");
//    }
//
//}
////loop for
//void loop() {
//    for (int i = 1; i <= 3; i++) {
//        System.out.println(i);
//    }
//}
////himoya  inkapulyatsiya
//void defend() {
//    class Bank {
//        private int money = 1000;
//    }
//}
//void getter() {
//    class Setter {
//        private String name = "Ali";
//
//        public String getName() {
//            return name;
//        }
////setter
//        class Student {
//            private String name;
//
//            public void setName(String name) {
//                this.name = name;
//            }
//        }
//    }
// string 1
//    1. helloName

    public String helloName(String name) {
        return "Hello " + name + "!";
    }
//    2. makeAbba
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
//    3. makeTags
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
//    4. makeOutWord
    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }
//    5. extraEnd

    public String extraEnd(String str) {
        String end = str.substring(str.length() - 2);
        return end + end + end;
    }
//    6. firstTwo

    public String firstTwo(String str) {
        return str.substring(0, Math.min(2, str.length()));
    }
//    7. firstHalf
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }
//    8. withoutEnd
    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }
//    9. comboString
    public String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        }
        return b + a + b;
    }
//    10. nonStart
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
//    11. left2

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }
//    12. right2
//
    public String right2(String str) {
        return str.substring(str.length() - 2) +
                str.substring(0, str.length() - 2);
    }
//    13. theEnd

    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        }
        return str.substring(str.length() - 1);
    }
//    14. withoutEnd2

    public String withoutEnd2(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'a') {
            result += "a";
        }
        if (str.length() >= 2 && str.charAt(1) == 'b') {
            result += "b";
        }
        if (str.length() > 2) {
            result += str.substring(2);
        }

        return result;
    }
//    15. middleTwo
    public String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 1);
    }
//    16. endsLy
    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }
//    17. nTwice

    public String nTwice(String str, int n) {
        return str.substring(0, n) +
                str.substring(str.length() - n);
    }
//    18. twoChar

    public String twoChar(String str, int index) {
        if (index < 0 || index + 2 > str.length()) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }
//    19. middleThree

    public String middleThree(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 2);
    }
//    20. hasBad
    public boolean hasBad(String str) {
        return str.startsWith("bad") ||
                str.length() >= 4 && str.substring(1, 4).equals("bad");
    }
//    21. atFirst

    public String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        if (str.length() == 1) {
            return str + "@";
        }
        return "@@";
    }
//    22. lastChars

    public String lastChars(String a, String b) {
        String first = a.length() > 0 ? a.substring(0, 1) : "@";
        String last = b.length() > 0
                ? b.substring(b.length() - 1) : "@";

        return first + last;
    }
//    23. conCat

    public String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 &&
                a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }
        return a + b;
    }
//    24. lastTwo
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }

        int n = str.length();
        return str.substring(0, n - 2)
                + str.charAt(n - 1)
                + str.charAt(n - 2);
    }

void main() {
}
//    25. seeColor