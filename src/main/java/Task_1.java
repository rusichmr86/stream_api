class Task_1 {

    static void task_1() {
        for (int i = 0; i < Consts.NUMBER_OF_THREADS; i++) {
            new Task1_Thread("Thread №" + i).start();
        }
    }
}

