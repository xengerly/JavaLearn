package Test;

public class Class  {
    public static void main(String[] args) throws Exception {
        Worker worker = new Worker("John");
        worker.atWork();

        try {
            worker.work();
        } catch (WorkerException e) {
            throw new Exception(e);
        }




    }
}
