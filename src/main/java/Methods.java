import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Methods {

    static boolean isLatters(String letters) {
        Pattern pattern = Pattern.compile("[a-z]+");  // регулярка на првоерку хотя бы одного символа латинской раскладки
        Matcher matcher = pattern.matcher(letters);
        return matcher.matches();
    }

    static String removeDuplicates(String string) {
        char stash = 0;
        char[] stringChars = string.toCharArray();
        while (checkString(string)) {
            for (char stringChar : stringChars) {
                if (stash == 0 || stash != stringChar) {
                    stash = stringChar;
                    string = string.replace(String.copyValueOf(new char[]{stash, stash}), "");
                }
            }
        }
        return string;
    }

    private static boolean checkString(String str) {
        char[] chars = str.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                return true;
            }
        }
        return false;
    }


    static List<String> swapValue(List<String> str1, List<String> str2, String columnName, String newValue) {
        try {
            int indexColumn = str1.indexOf(columnName);
            str2.set(indexColumn, newValue);
        } catch (Exception e) {
            System.out.println("Неверынй формат входных данных"); // Если название колонки не найдено, или если во второй строке значений меньше, чем в первой
        }
        return str2;
    }

    static void task6a(List<String> splitLine1, List<String> splitLine2) {
        for (String bd : splitLine2) {
            if (!isContains(splitLine1, bd))
                System.out.printf("В бд присутствует лишний ключ: %s \n", bd);
        }
    }

    static void task6b(List<String> splitLine1, List<String> splitLine2) {
        for (String reference : splitLine1) {
            if (isContains(reference, splitLine2))
                System.out.printf("Эталонный ключ %s содержится в БД \n", reference);
            else System.out.printf("Эталонный ключ %s отсутствует в БД \n", reference);
        }
    }

    private static boolean isContains(String reference, List<String> bd) {
        return bd.contains(reference);
    }

    private static boolean isContains(List<String> splitLine1, String bd) {
        return splitLine1.contains(bd);
    }

    static void out(List<String> splitLine1, List<String> newLine) throws FileNotFoundException {  // Вывод в файл решил вынести отдельным методом
        Scanner inFile = new Scanner(new File(Consts.PATHS_TASK_3));
        PrintWriter out = new PrintWriter(new File(Consts.PATHS_TASK_3));
        for (String s : splitLine1) {
            out.print(s + " ");
        }
        out.println();

        for (String s : newLine) {
            out.print(s + " ");
        }
        inFile.close();
        out.close();
    }

    static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 != 0))
                System.out.println("Fizz");

            else if ((i % 3 != 0) && (i % 5 == 0))
                System.out.println("Buzz");

            else if (i % 15 == 0)
                System.out.println("FizzBuzz");
            else System.out.println(i);
        }
    }

    static void taskEnd(int numberTask) {
        System.out.printf("============================= Task %d end =====================================\n", numberTask);
    }

    static void taskStart(int numberTask) {
        System.out.printf("============================= Task %d is runned =====================================\n", numberTask);
    }


}
