public class Main {

    public static void main(String[] args) {

        StudentGryffindor harryPotter = new StudentGryffindor(1, 2, 3, "Гарри Потер", 5, 6);
        StudentGryffindor hermioneGranger = new StudentGryffindor(7, 8, 9, "Гермиона Грейнджер", 10, 11);
        StudentGryffindor ronWeasley = new StudentGryffindor(12, 13, 14, "Рон Уизли", 15, 16);
        System.out.println(harryPotter);
        System.out.println(hermioneGranger);
        System.out.println(ronWeasley);
        System.out.println();

        StudentPuffenduy zachariahSmith = new StudentPuffenduy(17, 18, 19, " Захария Смит", 20, 21);
        StudentPuffenduy cedricDiggory = new StudentPuffenduy(22, 23, 24, "Седрик Диггори ", 25, 26);
        StudentPuffenduy justinFinchFletchley = new StudentPuffenduy(27, 28, 29, " Джастин Финч-Флетчли", 30, 31);
        System.out.println(zachariahSmith);
        System.out.println(cedricDiggory);
        System.out.println(justinFinchFletchley);
        System.out.println();


        StudentKogtevran zhouChang = new StudentKogtevran(32, 33, 34, 35, "Чжоу Чанг ", 36, 37);
        StudentKogtevran zadmPatil = new StudentKogtevran(38, 39, 40, 41, " Падма Патил", 43, 44);
        StudentKogtevran marcusBelby = new StudentKogtevran(45, 46, 47, 48, "Маркус Белби ", 49, 50);
        System.out.println(zhouChang);
        System.out.println(zadmPatil);
        System.out.println(marcusBelby);
        System.out.println();

        StudentSlytherin dracoMalfoy = new StudentSlytherin(51, 52, 53, 54, 55, "Драко Малфой", 56, 57);
        StudentSlytherin grahamMontagu = new StudentSlytherin(58, 59, 60, 61, 62, "Грэхэм Монтегю", 63, 64);
        StudentSlytherin gregoryGoyle = new StudentSlytherin(65, 66, 67, 68, 69, "Грегори Гойл", 70, 71);
        System.out.println(dracoMalfoy);
        System.out.println(grahamMontagu);
        System.out.println(gregoryGoyle);
        System.out.println();

        StudentHogwartsServise hogvarts = new StudentHogwartsServise();
        hogvarts.printStudent(gregoryGoyle);
        gregoryGoyle.print();//можно ли так?
        zachariahSmith.print();//можно ли так?
        System.out.println();

        hogvarts.compareStudent(dracoMalfoy, harryPotter);
        zadmPatil.compareStudent(dracoMalfoy, harryPotter);//Что это такое получилось??? причем когда перед методом ставлю StudentHogwarts (как я поланировал) . IDEA просит сделать метод статичным иначе нехочет работать!
        System.out.println();
        hogvarts.compareStudentGryffindor(harryPotter, hermioneGranger);
        hogvarts.compareStudentPuffenduy(zachariahSmith, cedricDiggory);
        hogvarts.compareStudentKogtevran(zadmPatil, zhouChang);
        hogvarts.compareStudentSlytherin(dracoMalfoy, grahamMontagu);


     /*Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью
    в сколько-то баллов и могут трансгрессировать на какое-то расстояние.
     Сила магии и расстояние трансгрессии у каждого ученика своё и выражается
     в целочисленном эквиваленте. */
    }
}