public class StudentPuffenduy extends StudentHogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public StudentPuffenduy(int hardworking, int loyal, int honest, String name, int powerMagic, int transgression) {
        super(name, powerMagic, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;

    }

    @Override
    public String toString() {
        return "StudentPuffenduy : " + "hardworking=" + hardworking + ", loyal " + loyal + ", honest " + honest + super.toString();
    }

    /*Захария Смит,
    Седрик Диггори,
     Джастин Финч-Флетчли. */

    /*Студентам каждого из этих факультетов присущи свои свойства характера.
        Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100. */;


    /*Студенты Пуффендуя трудолюбивы, верны, честны.*/
      /*Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью
    в сколько-то баллов и могут трансгрессировать на какое-то расстояние.
     Сила магии и расстояние трансгрессии у каждого ученика своё и выражается
     в целочисленном эквиваленте. */
}
