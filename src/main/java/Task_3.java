import java.io.File;
import java.io.IOException;
import java.util.*;


class Task_3 {

    static void task_3() throws IOException {
        Methods.taskStart(3);
        Scanner inFile = new Scanner(new File(Consts.PATHS_TASK_3));

        Scanner sc = new Scanner(System.in);

        List<String> line1 = Collections.singletonList(inFile.nextLine());
        List<String> line2 = Collections.singletonList(inFile.nextLine());
        List<String> splitLine1 = Arrays.asList(line1.get(0).split(" "));
        List<String> splitLine2 = Arrays.asList(line2.get(0).split(" "));

        System.out.println("Введите название колонки");
        String columnName = sc.nextLine();
        System.out.println("Введите новое значение");
        String newValue = sc.nextLine();
        List<String> newLine = Methods.swapValue(splitLine1, splitLine2, columnName, newValue);
        Methods.out(splitLine1, newLine);
        Methods.taskEnd(3);

    }


}
