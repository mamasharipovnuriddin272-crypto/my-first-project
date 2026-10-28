//package oop;
//
//public class ClassExample {
//    // String[] text = {"Olma", "Anor", "Nok"};
//    // int[] number = {1, 2, 3};
//    // double[] grade = {1.1, 2.2};
//
//
//
//    //OOP - class, object
//    public static void main(String[] args) {
//
////        Car spark = new Car();
////        spark.year = 2012;
////        spark.name = "Spark";
////        spark.model = "Chevrolet";
////
////        Car matiz = new Car();
////        matiz.year = 2005;
////        matiz.name = "Matiz";
////        matiz.model = "Chevrolet";
////
////        Car toyota = new Car();
////        toyota.year = 2020;
////        toyota.name = "Land Cruiser";
////        toyota.model = "Toyota";
////
////        spark.introduce();
////        matiz.introduce();
////        toyota.introduce();
////
////        Car car = new Car();
////        System.out.println(car.model);
//
////        Car spark = new Car("Spark", 2012);
////        spark.introduce();
////
////        Car matiz = new Car("Matiz", 2005);
////        matiz.introduce();
////
////        Car toyota = new Car("Land Cruiser", 2020);
////        toyota.introduce();
//
////        int count = 5;
////        Student studentOne = new Student("Ali", 20); // null
////        //Student studentTwo = new Student("Vali", 21);
////        Student studentTwo = studentOne;
////        studentTwo.age = 30;
////        System.out.println(studentOne.age);
//
//        //==============================
//
//        Student studentOne = new Student("Ali", 20); //8A
//        Student studentTwo = new Student("Ali", 20); //8B
//        Student studentThree = studentOne;
//
////        int age = 20;
////        int ageTwo = 20;
////        int number = 30;
////        System.out.println(age == number); //false
////        System.out.println(age == ageTwo); //true
//
//        //equals      == - reference solishtirish
//        // System.out.println(studentOne.name.equals(studentTwo.name));
////
////        //primitive type .equals
////
////        System.out.println(studentOne == studentTwo); //false
////        System.out.println(studentOne == studentThree); //true
//
//        //STATIC - keyword
//        Student student = new Student("Ali");
//        //student.notebook = "NNNNNNNNN";
//        new Student("Ali");
//        new Student("Ali");
//        new Student("Ali");
//        System.out.println(Student.getCount());
//        System.out.println(Student.PI);
//
//        //FINAL
//    }
//
//    static void birthday(Student student) {
//        student.age++;
//    }
//
//    static void replace(Student student) {
//        student = new Student("Yangi", 1);
//    }
//}
//
//
//
//package oop;
//
//public class Car {
//    int year; //0
//    String name; //null
//    String model; // null
//
//    public Car() { //Default Constructor
//    }
//
//    public Car(String model, String name, int year) { //Parameterized Constructor
//        this.model = model;
//        this.name = name;
//        this.year = year;
//    }
//
//    public Car(String name, int year) {
//        this("Chevrolet", name, year);
//    }
//
//
//    public void introduce() {
//        System.out.println("Model:\t" + model + "\t\tName:\t" + name + "\t\tYear: " + year);
//    }
//    //double price;
//
//}
//
//package oop;
//
//public class Student {
//
//    static final double PI = 3.14; // PI
//    static int count;
//    final String notebook = "Notebook";
//    String name;
//    int age;
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Student(String name) {
//        this.name = name;
//        count++;
//    }
//
//    public static int getCount() {
//        return count;
//    }
//}
//
