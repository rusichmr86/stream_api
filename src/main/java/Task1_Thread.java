public class Task1_Thread extends Thread {

    private static boolean[] numbers = new boolean[10];
    private static int counter = 0;

    Task1_Thread(String name) {
        super(name);
    }


    public void run() {
        synchronized (this) {
        System.out.printf("%s started... \n", Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
                if (!numbers[i]) {
                    numbers[i] = true;     // число занято
                    System.out.println(i);
                    counter++;
                    if (counter > 9) {
                        numbers[i] = false; // 9-тый поток освобождает свою цифру, чтобы его забрали другие потоки
                    }
                    break;
                }
            }
        }
    }
}





/*
public void run(boolean[] numbers) {
        System.out.printf("%s started... \n", Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            if (numbers[i]) {
                System.out.printf("Поток %s забрал цифру %d", Thread.currentThread().getName(), i);
            }
        }
    }
 */
