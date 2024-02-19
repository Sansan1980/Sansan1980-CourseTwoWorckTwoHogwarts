public class StudentKogtevran extends StudentHogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creation;

    public StudentKogtevran(int smart, int wise, int witty, int creation, String name, int powerMagic, int transgression) {
        super(name, powerMagic, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creation = creation;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise = wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public String toString() {
        return "StudentKogtevran :" + " smart = " + smart + ", wise = " + wise + ", witty = " + witty +
                ", creation = " + creation + super.toString();
    }




    /*Чжоу Чанг,
     Падма Патил
     и Маркус Белби*/

    /*Студентам каждого из этих факультетов присущи свои свойства характера.
        Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100. */;

    /*Когтевранцы умны, мудры, остроумны и полны творчества. */

      /*Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью
    в сколько-то баллов и могут трансгрессировать на какое-то расстояние.
     Сила магии и расстояние трансгрессии у каждого ученика своё и выражается
     в целочисленном эквиваленте. */
}
