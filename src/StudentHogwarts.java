public class StudentHogwarts {
    private String name;
    private int powerMagic;
    private int transgression;

    public StudentHogwarts(String name, int powerMagic, int transgression) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.transgression = transgression;

    }

    public String getName() {
        return name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

   /* public void  applyMagic() {
     System.out.println("Я использую магию Java! - Заклинание c  Силой магии"+StudentHogwarts+" - 'Exception' !?!?!?!!");
    }*/

    @Override
    public String toString() {
        return "name = " + name + ", powerMagic = " + powerMagic +
                ", transgression = " + transgression;
    }

    public void print() {
        System.out.println(toString());
    }


  public void compareStudent(StudentHogwarts first, StudentHogwarts second) {
        int delta = first.getPowerMagic() - second.getPowerMagic();
        if (first.getPowerMagic() > second.getPowerMagic()) {
            System.out.println(first.getName() + " сила магии = " + first.getPowerMagic() + " больше чем у " + second.getName() + " на " + delta);
        } else if (first.getPowerMagic() == second.getPowerMagic()) {
            System.out.println(first.getName() + " сила магии = " + first.getPowerMagic() + " одинакова с  " + second.getName() + " = " + first.getPowerMagic());
        } else {
            System.out.println(second.getName() + " сила магии = " + second.getPowerMagic() + " больше чем у " + first.getName() + " на " + delta);
        }
    }

    /*Студентам каждого из этих факультетов присущи свои свойства характера.
        Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100. */


      /*Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью
    в сколько-то баллов и могут трансгрессировать на какое-то расстояние.
     Сила магии и расстояние трансгрессии у каждого ученика своё и выражается
     в целочисленном эквиваленте. */

    /*- Критерии оценки
    //- Реализован класс Hogwarts с описанием свойств, присущих всем ученикам
   // - Классы-факультеты описывают свойства учеников-наследников и являются наследниками класса Hogwarts
   // - Ученики реализованы в качестве объектов и наследуют свойства класса-факультета и класса Hogwarts
   // - Качества учеников можно задавать с помощью конструктора
   // - Реализован метод, который выводит на экран описание студента: качества, присущие всем ученикам школы и присущие определенному факультету.
    - Реализованы методы, которые выводят на экран результат сравнения двух учеников одного факультета по свойствам только это факультета
   // - Реализован метод, который сравнивает двух любых учеников по присущим всем ученикам школы характеристикам.*/

}
