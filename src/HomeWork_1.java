public class HomeWork_1 {

    // Task 1
    static void task1() {
        System.out.println(74 + 36);
    }

    //Task 2
    static void task2() {
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + -3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }


    //Task 3
    static int a = 125;
    static int b = 24;

    static void task3Sum() {
        System.out.println(a + b);
    }

    static void task3Multuply() {
        System.out.println(a * b);
    }

    static void task3Substract() {
        System.out.println(a - b);
    }

    static void task3Divide() {
        System.out.println(a / b);
    }

    static void task3Remainder() {
        System.out.println(a % b);
    }

    //Task 4
    static int task4ArraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


    static void task5DuplicateVar1(int[] array) {
        int a = 0;
        int startValue = array[a];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == startValue) {
                System.out.println(array[i]);
                a += 1;
                startValue = array[a];
                i = a;
            } else if (i + 1 == array.length && a + 1 < array.length) {
                a += 1;
                startValue = array[a];
                i = a;
            }
        }
    }

    static void task5DuplicateVar2(int[] array) {
        int[] helpArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    System.out.println(array[j]);
                    helpArray[i] = array[j];

                }
            }
        }
    }

    //Task 6

    static void task6ConcatLogic(String sentence1, String sentence2) {
        String stringConcat = sentence1.concat(sentence2).replace("p", "").replace("P", "");
        System.out.println(stringConcat);
    }

    //Taks 7
    Computer comp1 = new Computer("HP", 15.6F);
    Computer comp2 = new Computer("Dell", 13F);

}
