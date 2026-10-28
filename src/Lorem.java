import java.util.Scanner;

void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.println(
                   "---------------------------------\n" +
                    "           🛒STORE🛒\n" +
                    "        RO'YXAT TANLANG!\n" +
                    "--------------------------------\n" +
                    " 1--> Mahsulotlarimizni ko'rish\n" +
                    "2 --> QILGAN HARIDLARINGIZNI KO`RISH\n" +
                    " 3 --> To'lov qilish\n  "
    );

    System.out.print("Tanlang: ");
    int choice = scanner.nextInt();

    if (choice == 1)
        System.out.println("Mahsulotlar ro'yxati:");
        System.out.println("1. Kiyimlar");
        System.out.println("2. Oziq-Ovqatlar ");
        System.out.println("3. BUYUMLAR");
        System.out.println("4. Yana qanday mahsulot izlayapsiz: ");


    System.out.print("Tanlang: ");
    int kyim = scanner.nextInt();




    if ( kyim == 1)
        System.out.println("KYIMLAR 🧥🥼:");
    System.out.println("1. look lar 👔");
    System.out.println("2. Oyoq-kiyim 👟");
    System.out.println("3. bosh-kiyim 🧢");
    System.out.println("4. Fasl va Brend uchun kiyim 🏇");
    System.out.println("0- BOSH MEYU");



    System.out.print("Tanlang: ");
    int kiyim= scanner.nextInt();
    if ( kiyim == 2)
        System.out.println("Mahsulotingiz xarid qilindi");



//    int menyu = scanner.nextInt();
//    if (menyu == 0)
    System.out.println("Mahsulotlar ro'yxati:");
    System.out.println("1. Kiyimlar");
    System.out.println("2. Oziq-Ovqatlar ");
    System.out.println("3. BUYUMLAR");
    System.out.println("4. Yana qanday mahsulot izlayapsiz: ");




    System.out.print("Tanlang: ");
    int ovqat = scanner.nextInt();
    if ( ovqat == 2)
        System.out.println("Ovqatlar:🍔");
    System.out.println("1. Fast-Food lar🍕");
    System.out.println("2. Go`sht va yengil ovqat🍗🥗");
    System.out.println("3. Desertlar 🍩🧁");
    System.out.println("4. Mevalar 🍎");

    System.out.print("Tanlang: ");
    int food = scanner.nextInt();
    if ( food == 2)
        System.out.println("Mahsulotingiz xarid qilindi");

    System.out.println("Mahsulotlar ro'yxati:");
    System.out.println("1. Kiyimlar");
    System.out.println("2. Oziq-Ovqatlar ");
    System.out.println("3. BUYUMLAR");


    System.out.print("Tanlang: ");
    int tool = scanner.nextInt();




    if ( tool == 3)
        System.out.println("BUYUMLAR📚:");
    System.out.println("1. ASBOBLAR 🪛");
    System.out.println("2. O`YINCHOQLAR 🧸");
    System.out.println("3. MATERIALLAR 🎗️🧶");
    System.out.println("4. Smartphone va noutbuk uchun Buyumlar ️📱💻");





    System.out.print("Yana qanday narsa?: ");
            String turli = scanner.nextLine();

    System.out.println("mahsulotingiz xarid qilindi");

            System.out.println("Bizda " + turli + " bor! Xarid qilmoqchimisiz?");
            System.out.println("1 -> Ha");
            System.out.println("2 -> Yo'q");

            System.out.print(" ha yoki yo`q son bilan kriting : ");
            int buyurtma = scanner.nextInt(); // Bu yerda faqat 1 yoki 2 soni kiritiladi
            System.out.println("mahsulotingiz xarid qilindi");


            System.out.println(
                        "---------------------------------\n" +
                                "        BOSH MENYU !\n" +
                                "--------------------------------\n" +
                                " 1--> Mahsulotlarimizni ko'rish\n" +
                                "2 --> QILGAN HARIDLARINGIZNI KO`RISH\n" +
                                " 3 --> To'lov qilish\n  "
                );

                System.out.print("Tanlang: ");
                int choose = scanner.nextInt();

                if (choose == 2);
                System.out.println("|-------------------------------------- |\n" +
                                   "|------SIZNING QILGAN XARIDLARINGZ!-----|\n" +
                                   "|---------------------------------------|\n" +
                                   "|                                       |\n" +
                                   "|---------------------------------------|\n" +
                                   "| 1) Oyoq kiym                     +👟  |\n" +
                                   "| 2) Go`sht va yengil ovqatlar     +🍗🥗|\n" +
                                   "| 3)                                    |\n" +
                                   "|---------------------------------------|\n" +
                                   "|                                       |\n" +
                                   "|---------------------------------------|\n"


                );

            System.out.println(
            "---------------------------------\n" +
                    "        BOSH MENYU !\n" +
                    "--------------------------------\n" +
                    " 1--> Mahsulotlarimizni ko'rish\n" +
                    "2 --> QILGAN HARIDLARINGIZNI KO`RISH\n" +
                    " 3 --> To'lov qilish\n  "
    );

    System.out.print("Tanlang: ");
    int pay = scanner.nextInt();




    if ( pay == 3)
        System.out.println("TO`LOV=📃💵");
        System.out.println("TO`LOV USULINI TANLANG:");
    System.out.println("1-Carta orqali 💳🎉");
    System.out.println("2-NAQD to`lash💵");

    System.out.print("Tanlang: ");
    int yakun = scanner.nextInt();

    System.out.println("--XARIDLARINGIZ UCHUN RAHMAT!️--");
    System.out.println(">>>>>>>>>>>>🛒STORE🛒<<<<<<<<<<");








        System.out.println(
                "---------------------------------\n" +
                        "           🛒STORE🛒\n" +
                        "        RO'YXAT TANLANG!\n" +
                        "--------------------------------\n" +
                        " 1--> Mahsulotlarimizni ko'rish\n" +
                        "2 --> QILGAN HARIDLARINGIZNI KO`RISH\n" +
                        " 3 --> To'lov qilish\n  "
        );

        System.out.print("Tanlang: ");
        int choicec = scanner.nextInt();

        if (choicec == 1)
            System.out.println("Mahsulotlar ro'yxati:");
        System.out.println("1. Kiyimlar");
        System.out.println("2. Oziq-Ovqatlar ");
        System.out.println("3. BUYUMLAR");
        System.out.println("4. Yana qanday mahsulot izlayapsiz: ");


        System.out.print("Tanlang: ");
        int kyimlar = scanner.nextInt();




        if ( kyimlar == 1)
            System.out.println("KYIMLAR 🧥🥼:");
        System.out.println("1. look lar 👔");
        System.out.println("2. Oyoq-kiyim 👟");
        System.out.println("3. bosh-kiyim 🧢");
        System.out.println("4. Fasl va Brend uchun kiyim 🏇");
        System.out.println("0- BOSH MEYU");



        System.out.print("Tanlang: ");
        int kiyimm= scanner.nextInt();
        if ( kiyimm == 2)
            System.out.println("Mahsulotingiz xarid qilindi");



//    int menyu = scanner.nextInt();
//    if (menyu == 0)
        System.out.println("Mahsulotlar ro'yxati:");
        System.out.println("1. Kiyimlar");
        System.out.println("2. Oziq-Ovqatlar ");
        System.out.println("3. BUYUMLAR");
        System.out.println("4. Yana qanday mahsulot izlayapsiz: ");




        System.out.print("Tanlang: ");
        int meal = scanner.nextInt();
        if ( meal == 2)
            System.out.println("Ovqatlar:🍔");
        System.out.println("1. Fast-Food lar🍕");
        System.out.println("2. Go`sht va yengil ovqat🍗🥗");
        System.out.println("3. Desertlar 🍩🧁");
        System.out.println("4. Mevalar 🍎");

        System.out.print("Tanlang: ");
        int ovqatlar = scanner.nextInt();
        if ( ovqatlar == 2)
            System.out.println("Mahsulotingiz xarid qilindi");

        System.out.println("Mahsulotlar ro'yxati:");
        System.out.println("1. Kiyimlar");
        System.out.println("2. Oziq-Ovqatlar ");
        System.out.println("3. BUYUMLAR");


        System.out.print("Tanlang: ");
        int asbob = scanner.nextInt();




        if ( tool == 3)
            System.out.println("BUYUMLAR📚:");
        System.out.println("1. ASBOBLAR 🪛");
        System.out.println("2. O`YINCHOQLAR 🧸");
        System.out.println("3. MATERIALLAR 🎗️🧶");
        System.out.println("4. Smartphone va noutbuk uchun Buyumlar ️📱💻");





        System.out.print("Yana qanday narsa?: ");
        String all = scanner.nextLine();

        System.out.println("mahsulotingiz xarid qilindi");

        System.out.println("Bizda " + turli + " bor! Xarid qilmoqchimisiz?");
        System.out.println("1 -> Ha");
        System.out.println("2 -> Yo'q");

        System.out.print(" ha yoki yo`q son bilan kriting : ");
        int zakaz = scanner.nextInt(); // Bu yerda faqat 1 yoki 2 soni kiritiladi
        System.out.println("mahsulotingiz xarid qilindi");


        System.out.println(
                "---------------------------------\n" +
                        "        BOSH MENYU !\n" +
                        "--------------------------------\n" +
                        " 1--> Mahsulotlarimizni ko'rish\n" +
                        "2 --> QILGAN HARIDLARINGIZNI KO`RISH\n" +
                        " 3 --> To'lov qilish\n  "
        );

        System.out.print("Tanlang: ");
        int tanlovlar = scanner.nextInt();

        if (tanlovlar == 2);
        System.out.println("|-------------------------------------- |\n" +
                "|------SIZNING QILGAN XARIDLARINGZ!-----|\n" +
                "|---------------------------------------|\n" +
                "|                                       |\n" +
                "|---------------------------------------|\n" +
                "| 1) Oyoq kiym                     +👟  |\n" +
                "| 2) Go`sht va yengil ovqatlar     +🍗🥗|\n" +
                "| 3)                                    |\n" +
                "|---------------------------------------|\n" +
                "|                                       |\n" +
                "|---------------------------------------|\n"


        );

        System.out.println(
                "---------------------------------\n" +
                        "        BOSH MENYU !\n" +
                        "--------------------------------\n" +
                        " 1--> Mahsulotlarimizni ko'rish\n" +
                        "2 --> QILGAN HARIDLARINGIZNI KO`RISH\n" +
                        " 3 --> To'lov qilish\n  "
        );

        System.out.print("Tanlang: ");
        int cash = scanner.nextInt();




        if ( pay == 3)
            System.out.println("TO`LOV=📃💵");
        System.out.println("TO`LOV USULINI TANLANG:");
        System.out.println("1-Carta orqali 💳🎉");
        System.out.println("2-NAQD to`lash💵");

        System.out.print("Tanlang: ");
        int fiish = scanner.nextInt();

        System.out.println("--XARIDLARINGIZ UCHUN RAHMAT!️--");
        System.out.println(">>>>>>>>>>>>🛒STORE🛒<<<<<<<<<<");




    }








