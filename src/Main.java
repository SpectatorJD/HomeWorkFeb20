public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 15;
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");

        } else {
            System.out.println("Если возраст человка равен " + age + ", то он совершеннолетний");
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        int temp = 5;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 59;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорсть " + speed + ", то можно ездить спокойно");

        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 20;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в детский сад.");
       } else
        if (age >= 7 && age <=18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else
        if (age >= 19 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        } else
        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }


    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 6;
        if (age<=5) {
            System.out.println("Если возраст ребенка " + age + " лет, то он не может кататься на аттракционе.");
        }else
            if (age>5 && age <=14) {
                System.out.println("Если возраст ребенка " + age + " лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
            }else
                if (age >14) {
                    System.out.println("Если возраст человека " +age + " лет, то он может кататься без сопровождения взрослого.");
                }

    }
    public static void task6() {
        System.out.println("Задача 6");
        int place = 59;

        boolean placeSeating = place <60;
        boolean placeStanding =place >= 60 && place <102;
        if (placeSeating) {
            System.out.println("Есть седячее мест в вагоне");
        } else

            if (placeStanding) {
                System.out.println("Есть только стоячее место в вагоне");
            } else
                if (place >=102) {
                    System.out.println("Мест нет, вагон забит полностью");
                }

    }



    public static void task7() {
        System.out.println("Задача 7");
        int one = 61;
        int two = 60;
        int three = 50;
        boolean maxThree = (one < two && one < three);
        boolean maxTwo = (one < two && three < two);
        boolean maxOne = (one > two && one > three);

        if (maxThree) {
            System.out.println("Самое большое число " + three);
        } else
            if (maxTwo) {
            System.out.println("Самое большое число " + two);
    } else
        if (maxOne) {
            System.out.println("Самое большое число " + one);
        }

    }
}