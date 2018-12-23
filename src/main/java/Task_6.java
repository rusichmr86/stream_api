import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Task_6 {
    static void task_6() throws FileNotFoundException {
        Methods.taskStart(6);
        Scanner inFile = new Scanner(new File(Consts.PATHS_TASK_6));

        List<String> reference = Collections.singletonList(inFile.nextLine());
        List<String> bd = Collections.singletonList(inFile.nextLine());
        List<String> splitLine1 = Arrays.asList(reference.get(0).split(" "));
        List<String> splitLine2 = Arrays.asList(bd.get(0).split(" "));
        Methods.task6a(splitLine1, splitLine2);
        Methods.task6b(splitLine1, splitLine2);
        Methods.taskEnd(6);

    }
}
