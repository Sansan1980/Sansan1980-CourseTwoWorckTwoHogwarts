public class StudentSlytherin extends StudentHogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstPower;

    public StudentSlytherin(int cunning, int determination, int ambition, int resourcefulness, int thirstPower, String name, int powerMagic, int transgression) {
        super(name, powerMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this. determination = determination;
    }
    public int getAmbition() {
        return ambition;
    }

    public void setAmbition() {
        this.ambition = ambition;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    public void setThirstPower() {
        this.thirstPower = thirstPower;
    }

    public String toString() {
        return "StudentSlytherin : cunning = " + cunning +", determination = "+ determination+", ambition = "+ ambition+", resourcefulness = "+", resourcefulness = "+ resourcefulness+", thirstPower = "+ thirstPower +super.toString();

    }









   /*Драко Малфой,
     Грэхэм Монтегю,
      Грегори Гойл  */


    /*Студентам каждого из этих факультетов присущи свои свойства характера.
        Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100. */;

    /*Всем ученикам Слизерина присущи хитрость, решительность,
    амбициозность, находчивость и жажда власти.*/

    /*Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью
    в сколько-то баллов и могут трансгрессировать на какое-то расстояние.
     Сила магии и расстояние трансгрессии у каждого ученика своё и выражается
     в целочисленном эквиваленте. */
}
