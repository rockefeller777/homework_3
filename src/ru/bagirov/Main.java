package ru.bagirov;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        int dog = 7;
        byte cat = 1;
        short muose = 3;
        long elefant = 110L;
        double sugarWeight = 4.5;
        float saltWeight = 1.5f;
        boolean dogIsAdult = dog > 10;
        char bar = 35;
        System.out.println(dogIsAdult);

        // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + weightOfAllBoxers);
        System.out.println("Разница в весе боксеров " + weightDifference);

        // Задание 3
        int bananas = 5 * 80;
        int milk = 105 * 2;
        int icecream = 100 * 2;
        int eggs = 70 * 4;
        int weightOfAllProducts = bananas + milk + icecream + eggs;
        System.out.println("Общий вес бананов " + bananas + " грамм");
        System.out.println("Общий вес молока " + milk + " грамм");
        System.out.println("Общий вес мороженого " + icecream + " грамм");
        System.out.println("Общий вес яиц " + eggs + " грамм");
        System.out.println("Общий вес продуктов " + weightOfAllProducts + " грамм");

        double weight1 = 1090;
        double weight2 = 1000;
        double d = weight1 / weight2;
        System.out.println("Общий вес продуктов " + d + " кг");

        // Задание 4
        double boxerBeforeWeight = 78.2;
        int weightOne = 7000;
        int weightTwo = 250;
        int allWeight = weightOne / weightTwo;
        System.out.println("Потребовалось " + allWeight + " дней");

        int weightFirst = 7000;
        int weightSecond = 500;
        int FinalWeight = 7000/500;
        System.out.println("Потребовалось " + FinalWeight + " дней");

        int averageWeight = FinalWeight + allWeight;
        int averageWeightTwo = averageWeight/2;
        System.out.println("В среднем потребуется " + averageWeightTwo + " день");

        //Задание 5
        int MashasSalary = 67760;
        int DenisSalary = 83690;
        int CristinasSalary = 76230;
        int MashasSalaryX = 67760/10;
        int DenisSalaryX = 83690/10;
        int CristinasSalaryX = 76230/10;
        int MashasSalaryY = MashasSalary + MashasSalaryX;
        int CristinasSalaryY = CristinasSalary + CristinasSalaryX;
        int DenisSalaryY = DenisSalary + DenisSalaryX;
        System.out.println("Маша теперь получает " + MashasSalaryY + " рублей в месяц");
        System.out.println("Кристина теперь получает " + CristinasSalaryY + " рублей в месяц");
        System.out.println("Денис теперь получает " + DenisSalaryY + " рублей в месяц");

        int salaryDifference = MashasSalaryY * 12;
        int salaryDifferenceX = MashasSalary * 12;
        int salaryMashaDifference = salaryDifference - salaryDifferenceX;
        System.out.println("Маша получает на " + salaryMashaDifference + " рублей в год больше");
        int salaryDifferenceA = DenisSalaryY * 12;
        int salaryDifferenceB = DenisSalary * 12;
        int salaryDenisDifference = salaryDifferenceA - salaryDifferenceB;
        System.out.println("Денис получает на " + salaryDenisDifference + " рублей в год больше");
        int salaryDifferenceW = CristinasSalaryY * 12;
        int salaryDifferenceS = CristinasSalary * 12;
        int salaryCristinaDifference = salaryDifferenceW - salaryDifferenceS;
        System.out.println("Кристина получает на " + salaryCristinaDifference + " рублей в год больше");











    }
}
