package Test;

public class Worker {
    String name;
    boolean isAtWork;
    boolean isSober;

    void atWork() {
        isAtWork = true;
    }

    void sober() {
        isSober = true;
    }

    void work() throws WorkerException {
        if (isAtWork && isSober) {
            System.out.println("Можно работать !");
        } else {
            throw new WorkerException("Работник не готов");
        }
    }

    public Worker(String name) {
        this.name = name;
        System.out.println(name);
    }
}
