public class Main {

    public static void main(String[] args) {
        // 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        System.out.println(sum(3));
        System.out.println(multy(5));

        // 2. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
        // от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        System.out.println(numbersTrueFalse(5, 10));

        // 3. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
        // в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
        positiveOrNegativeNumberConsole(55);

        // 4. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
        // если число отрицательное, и вернуть false если положительное.
        System.out.println(positiveOrNegativeNumberTrue(10));

        // 5. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
        // в консоль указанную строку, указанное количество раз;
        printStrMultyNum("Hello", 3);

        // 6. Написать метод, который определяет, является ли год високосным, и возвращает boolean
        // (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
        // при этом каждый 400-й – високосный.
        System.out.println(VisokosniiYearProof(1890));

        // 7. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeArray0To1(array);

        // 8. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
        // значениями 1 2 3 4 5 6 7 8 … 100;
        int[] array2 = new int[100];
        fillNumbersArray(array2);

        // 9. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;
        int[] array3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        arrayMultipl(array3);
    }

    private static int sum(int n) {
        int i = 1;
        int res = 0;
        while (i <= n) {
            res += i;
            i++;
        }
        return res;
    }

    private static int multy(int n) {
        int i = 1;
        int res = 1;
        while (i <= n) {
            res *= i;
            i++;
        }
        return res;
    }

    private static boolean numbersTrueFalse(int num1, int num2) {
        int res = num1 + num2;
        if (res >= 10 & res <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    private static void positiveOrNegativeNumberConsole(int num) {
        if (num >= 0) {
            System.out.println(num + " : число положительное");
        } else {
            System.out.println(num + " : число отрицательное");
        }
    }

    private static boolean positiveOrNegativeNumberTrue(int num) {
        if (num >= 0) return false;
        else return true;
    }

    private static void printStrMultyNum(String str, int num) {
        int i = 0;
        while (i < num) {
            System.out.println(str);
            i++;
        }
    }

    private static boolean VisokosniiYearProof(int year) {
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
        }
        return false;
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    private static void changeArray0To1(int[] array) {
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        printArray(array);
    }

    private static void fillNumbersArray(int[] array){
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        printArray(array);
    }
    private static void arrayMultipl(int[] array){
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6){
                array[i] = array[i]*2;
            }
        }
        printArray(array);
    }
}