public class StudentGryffindor extends StudentHogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public StudentGryffindor(int nobility, int honor, int bravery, String name, int powerMagic, int transgression) {
        super(name, powerMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "StudentGryffindor :  " + "nobility=" +
                nobility + ", honor=" + honor + ", bravery=" + bravery + " " + super.toString()+ ", Факультет = "+getClass();
    }


    /*Гарри Поттер,
     Гермиона Грейнджер
     и Рон Уизли учатся   */
    /*nobility,
 honor
  bravery.*/

    /*Студентам каждого из этих факультетов присущи свои свойства характера.
        Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100. */;


    /*Всем Гриффиндорцам присущи благородство, честь и храбрость. */

      /*Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью
    в сколько-то баллов и могут трансгрессировать на какое-то расстояние.
     Сила магии и расстояние трансгрессии у каждого ученика своё и выражается
     в целочисленном эквиваленте. */
}
