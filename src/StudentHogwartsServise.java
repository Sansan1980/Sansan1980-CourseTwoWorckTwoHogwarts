public class StudentHogwartsServise {
    public void printStudent(StudentHogwarts student) {
        System.out.println(student);
        System.out.println();

    }

    public void compareStudent(StudentHogwarts first, StudentHogwarts second) {
        int delta = first.getPowerMagic() - second.getPowerMagic();
        if (first.getPowerMagic() > second.getPowerMagic()) {
            System.out.println(first.getName() + " сила магии = " + first.getPowerMagic() + " больше чем у " + second.getName() + " = " + second.getPowerMagic() + " на " + delta + " едениц");
        } else if (first.getPowerMagic() == second.getPowerMagic()) {
            System.out.println(first.getName() + " сила магии = " + first.getPowerMagic() + " одинакова с  " + second.getName() + " = " + first.getPowerMagic() + " едениц");
        } else {
            System.out.println(second.getName() + " сила магии = " + second.getPowerMagic() + " больше чем у " + first.getName() + " = " + first.getPowerMagic() + " на " + delta + " едениц");
        }
        delta = first.getTransgression() - second.getTransgression();
        if (first.getTransgression() > second.getTransgression()) {
            System.out.println(first.getName() + " сила Transgression = " + first.getTransgression() + " больше чем у " + second.getName() + " = " + second.getTransgression() + " на " + delta + " едениц");
        } else if (first.getTransgression() == second.getTransgression()) {
            System.out.println(first.getName() + " сила Transgression = " + first.getTransgression() + " одинакова с  " + second.getName() + " = " + first.getTransgression() + " едениц");
        } else {
            System.out.println(second.getName() + " сила Transgression = " + second.getTransgression() + " больше чем у " + first.getName() + " = " + first.getTransgression() + " на " + delta + " едениц");
        }
        System.out.println();

    }


    public void compareStudentGryffindor(StudentGryffindor first, StudentGryffindor second) {
        int firstSumm = first.getNobility() + first.getHonor() + first.getBravery();
        int secondSumm = second.getNobility() + second.getHonor() + second.getBravery();

        if (firstSumm > secondSumm) {
            int delta = firstSumm - secondSumm;
            System.out.println(first.getName() + " Сумма силы магии = " + firstSumm + " больше чем у " + second.getName() + " = " + secondSumm + " на " + delta + " едениц");
        } else if (firstSumm == secondSumm) {
            System.out.println(first.getName() + " Сумма силы магии = " + firstSumm + " одинакова с  " + second.getName() + " = " + secondSumm + " едениц");
        } else {
            int delta = secondSumm - firstSumm;
            System.out.println(second.getName() + " Сумма силы магии = " + secondSumm + " больше чем у " + first.getName() + " = " + firstSumm + " на " + delta + " едениц");
        }
    }

    public void compareStudentPuffenduy(StudentPuffenduy first, StudentPuffenduy second) {
        int firstSumm = first.getHardworking() + first.getLoyal() + first.getHonest();
        int secondSumm = second.getHardworking() + second.getLoyal() + second.getHonest();

        if (firstSumm > secondSumm) {
            int delta = firstSumm - secondSumm;
            System.out.println(first.getName() + " Сумма силы магии = " + firstSumm + " больше чем у " + second.getName() + " = " + secondSumm + " на " + delta + " едениц");
        } else if (firstSumm == secondSumm) {
            System.out.println(first.getName() + " Сумма силы магии = " + firstSumm + " одинакова с  " + second.getName() + " = " + secondSumm + " едениц");
        } else {
            int delta = secondSumm - firstSumm;
            System.out.println(second.getName() + " Сумма силы магии = " + secondSumm + " больше чем у " + first.getName() + " = " + firstSumm + " на " + delta + " едениц");
        }
    }

    public void compareStudentKogtevran(StudentKogtevran first, StudentKogtevran second) {
        int firstSumm = first.getSmart() + first.getWise() + first.getWitty() + first.getCreation();
        int secondSumm = second.getSmart() + second.getWise() + second.getWitty() + second.getCreation();

        if (firstSumm > secondSumm) {
            int delta = firstSumm - secondSumm;
            System.out.println(first.getName() + " Сумма силы магии = " + firstSumm + " больше чем у " + second.getName() + " = " + secondSumm + " на " + delta + " едениц");
        } else if (firstSumm == secondSumm) {
            System.out.println(first.getName() + " Сумма силы магии = " + firstSumm + " одинакова с  " + second.getName() + " = " + secondSumm + " едениц");
        } else {
            int delta = secondSumm - firstSumm;
            System.out.println(second.getName() + " Сумма силы магии = " + secondSumm + " больше чем у " + first.getName() + " = " + firstSumm + " на " + delta + " едениц");
        }
    }



    //-//-//-//-
}
