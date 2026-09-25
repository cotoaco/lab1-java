import java.util.Arrays;
import java.util.Scanner;

public class Tasks1{
    public int charToNum(char x){
        return x - '0';
    }
    public boolean isPositive(int x){
        return x > 0;
    }
    public boolean isUpperCase(char x){
        return x >= 'A' && x <= 'Z';
    }
    public boolean isDivisor(int a, int b){
        if (a == 0 || b == 0){
            return false;
        }
        return a % b == 0 || b % a == 0;
    }
    public int lastNumSum(int a, int b){
        return Math.abs(a % 10) + Math.abs(b % 10);
    }
    public int abs(int x){
        if (x < 0){
            return -x;
        }
        return x;
    }
    public String makeDecision(int x, int y){
        if (x < y) {
            return x + " < " + y;
        }
        if (x > y) {
            return x + " >" + y;
        }
        return x + " == " + y;
    }
    public int max3(int x, int y, int z){
        int max = x;
        if ( y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }
    public int sum2(int x, int y){
        if (10 <= (x + y) || (x + y) <= 19){
            return 20;
        }
        return x + y;
    }
    public String day(int x){
        switch (x){
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }
    public String reserveListNums(int x){
        StringBuilder result = new StringBuilder();
        if (x >= 0) {
            for (int i = x; i >= 0; i--){
                result.append(i);
                if (i != 0) {
                    result.append(" ");
                }
            }
        }
        else{
            for (int i = x; i <= 0; i++) {
                result.append(i);
                if (i != 0) {
                    result.append(" ");
                }
            }
        }
        return result.toString();
    }
    public String chet(int x) {
        if (x < 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i += 2){
            result.append(i);
            if (i + 2 <= x) {
                result.append(" ");
            }
        }
        return result.toString();
    }
    public boolean equalNum(int x){
        x = Math.abs(x);
        int lastDigit = x % 10;
        x /= 10;
        while (x > 0) {
            if (x % 10 != lastDigit) {
                return false;
            }
            x /= 10;
        }
        return true;
    }
    public void leftTriangle(int x){
        for (int i = 1; i <= x; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void rightTriangle(int x){
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public int findFirst(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public int findLast(int[] arr, int x){
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public int[] add (int[] arr, int x, int pos) {
        if (pos < 0 || pos > arr.length){
            return arr;
        }
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < pos; i++){
            result[i] = arr[i];
        }
        result[pos] = x;
        for (int i = pos; i < arr.length; i++){
            result[i + 1] = arr[i];
        }
        return result;
    }
    public int[] reverseBack(int[] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }
    public int[] deleteNegative (int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (value >= 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int value : arr) {
            if (value >= 0) {
                result[index] = value;
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Tasks1 lab = new Tasks1();
        while (true) {
            System.out.println();
            System.out.println("Задания ");
            System.out.println("1 1.1 (3) Букву в число");
            System.out.println("2 1.2 (4) Есть ли позитив");
            System.out.println("3 1.3 (6) Большая буква");
            System.out.println("4 1.4 (8) Делитель");
            System.out.println("5 1.5 (10) Многократный вызов");
            System.out.println("6 2.1 (1) Модуль числа");
            System.out.println("7 2.2 (4) Строка сравнения");
            System.out.println("8 2.3 (5) Тройной максимум");
            System.out.println("9 2.4 (7) Двойная сумма");
            System.out.println("10 2.5 (9) День недели");
            System.out.println("11 3.1 (2) Числа наоборот");
            System.out.println("12 3.2 (3) Четные числа");
            System.out.println("13 3.3 (6) Одинаковость");
            System.out.println("14 3.4 (8) Левый треугольник");
            System.out.println("15 3.5 (9) Правый треугольник");
            System.out.println("16 4.1 (1) Поиск первого значения");
            System.out.println("17 4.2 (2) Поиск последнего значения");
            System.out.println("18 4.3 (4) Добавление в массив");
            System.out.println("19 4.4 (7) Возвратный реверс");
            System.out.println("20 4.5 (10) Удалить негатив");
            System.out.println("0 Выход ");
            int choice = readInt(scan, "Выберите задание ");
            switch (choice) {
                case 1: {
                    char x = readChar(scan, "Введите цифру от 0 до 9 ");
                    while(x < '0' || x > '9') {
                        System.out.println("Ошибка. Нужно ввести цифру от 0 до 9.");
                        x = readChar(scan, "Введите цифру от 0 до 9 ");
                    }
                    System.out.println("Результат: " + lab.charToNum(x));
                    break;
                }
                case 2: {
                    int x = readInt(scan, "Введите число ");
                    System.out.println("Результат: " + lab.isPositive(x));
                    break;
                }
                case 3: {
                    char x = readChar(scan, "Введите символ ");
                    System.out.println("Результат: " + lab.isUpperCase(x));
                    break;
                }
                case 4: {
                    int a = readInt(scan, "Введите первое число ");
                    int b = readInt(scan, "Введите второе число ");
                    System.out.println("Результат: " + lab.isDivisor(a, b));
                    break;
                }
                case 5: {
                    int a = readInt(scan, "Введите первое число ");
                    int b = readInt(scan, "Введите второе число ");
                    System.out.println("Результат: " + lab.lastNumSum(a, b));
                    break;
                }
                case 6: {
                    int x = readInt(scan, "Введите число ");
                    System.out.println("Модуль: " + lab.abs(x));
                    break;
                }
                case 7: {
                    int a = readInt(scan, "Введите первое число ");
                    int b = readInt(scan, "Введите второе число ");
                    System.out.println("Результат: " + lab.makeDecision(a, b));
                    break;
                }
                case 8: {
                    int a = readInt(scan, "Введите первое число ");
                    int b = readInt(scan, "Введите второе число ");
                    int c = readInt(scan, "Введите третье число ");
                    System.out.println("Результат: " + lab.max3(a, b, c));
                    break;
                }
                case 9: {
                    int a = readInt(scan, "Введите первое число ");
                    int b = readInt(scan, "Введите второе число ");
                    System.out.println("Результат: " + lab.sum2(a, b));
                    break;
                }
                case 10: {
                    int x = readInt(scan, "Введите день недели ");
                    while (x < 1 || x > 7) {
                        System.out.println("Ошибка. Число должно быть от 1 до 7.");
                        x = readInt(scan, "Введите день недели ");
                    }
                    System.out.println("Результат: " + lab.day(x));
                    break;
                }
                case 11: {
                    int x = readInt(scan, "Введите число ");
                    System.out.println("Результат: " + lab.reserveListNums(x));
                    break;
                }
                case 12: {
                    int x = readInt(scan, "Введите число ");
                    if (x < 0) {
                        System.out.println("Ошибка. Число должно быть положительным.");
                        break;
                    }
                    System.out.println("Результат: " + lab.chet(x));
                    break;
                }
                case 13: {
                    int x = readInt(scan, "Введите число ");
                    System.out.println("Результат: " + lab.equalNum(x));
                    break;
                }
                case 14: {
                    int x = readPositiveInt(scan, "Введите высоту треугольника ");
                    System.out.println("Результат: ");
                    lab.leftTriangle(x);
                    break;
                }
                case 15: {
                    int x = readPositiveInt(scan, "Введите высоту треугольника ");
                    System.out.println("Результат: ");
                    lab.rightTriangle(x);
                    break;
                }
                case 16: {
                    int[] arr = readArray(scan);
                    int x = readInt(scan, "Введите искомое число ");
                    int result = lab.findFirst(arr, x);
                    if (result == -1) {
                        System.out.println( -1 );
                    }
                    else {
                        System.out.println("Позиция " + result);
                    }
                    break;
                }
                case 17: {
                    int[] arr = readArray(scan);
                    int x = readInt(scan, "Введите искомое число ");
                    int result = lab.findLast(arr, x);
                    if (result == -1) {
                        System.out.println( -1 );
                    }
                    else {
                        System.out.println("Позиция " + result);
                    }
                    break;
                }
                case 18: {
                    int[] arr = readArray(scan);
                    int x = readInt(scan, "Введите число для вставки ");
                    int pos;
                    while (true) {
                        pos = readInt(scan, "Введите позицию ");
                        if (pos >= 0 && pos <= arr.length) {
                            break;
                        }
                        System.out.println("Ошибка. Неправильная позиция. ");
                    }
                    int[] result = lab.add(arr, x, pos);
                    System.out.println("Результат: " + Arrays.toString(result));
                    break;
                }
                case 19: {
                    int[] arr = readArray(scan);
                    int[] result = lab.reverseBack(arr);
                    System.out.println("Исходный массив " + Arrays.toString(arr));
                    System.out.println("Развернутый массив " + Arrays.toString(result));
                    break;
                }
                case 20: {
                    int[] arr = readArray(scan);
                    int[] result = lab.deleteNegative(arr);
                    System.out.println("Исходный массив " + Arrays.toString(arr));
                    System.out.println("Итоговый массив " + Arrays.toString(result));
                    break;
                }
                case 0: {
                    System.out.println("Выход. ");
                    scan.close();
                    return;
                }
                default:
                    System.out.println("Ошибка. Неверный номер задания.");
            }
        }
    }
    private static int readInt(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.println("Ошибка. Введите целое число.");
            scanner.next();
        }
    }
    private static int readPositiveInt(Scanner scanner, String message) {
        while (true) {
            int number = readInt(scanner, message);
            if (number > 0) {
                return number;
            }
            System.out.println("Ошибка. Число должно быть положительным.");
        }
    }
    private static char readChar(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.next();
            if (input.length() == 1) {
                return input.charAt(0);
            }
            System.out.println("Ошибка. Должен быть только один символ.");
        }
    }
    private static int[] readArray(Scanner scanner) {
        int size;
        while (true) {
            size = readInt(scanner, "Введите размер массива ");
            if (size >= 0) {
                break;
            }
            System.out.println("Ошибка. Размер массива не может быть отрицательным.");
        }
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = readInt(scanner, "Введите элемент ");
        }
        return arr;
    }

}
