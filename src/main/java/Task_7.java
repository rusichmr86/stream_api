import java.util.Scanner;

class Task_7 {


    static void task_7() {
        Methods.taskStart(7);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String letters = sc.nextLine();
        int[] count = new int[26];
        int let;
        if (Methods.isLatters(letters)) {
            for (int i = 0; i < letters.length(); i++) {
                let = (int) letters.charAt(i) - 97;        //первая ячейка массива == букве а. Использовал -97 т.к. в ASCII 'a' стоит на 97 позиции
                count[let]++;
            }
        } else {
            System.out.println("Введена строка неверного фармата");
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {   // если буква не попалась, то в ячейке значение 0, а если 0, то не выводим её количество
                System.out.print(count[i] + Character.toString((char) (97 + i)));
            }
        }
        System.out.println();
        Methods.taskEnd( 7);
    }
}
