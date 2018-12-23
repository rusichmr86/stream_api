import java.util.Scanner;

class Task_4 {
    static void task_4() {
        Methods.taskStart(4);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String string = scanner.nextLine();

        if (Methods.isLatters(string)) {  // можно убрать проверку на строку a-z, тогда будет работать с разными раскладками и цифрами
            System.out.println(Methods.removeDuplicates(string));
        } else {
            System.out.println("Неверный формат строки");
        }
        Methods.taskEnd(4);
    }





}
