public class Table {

    private static Table instance = null;

    private Table() {
    }

    public static Table getInstance(){
        if (instance == null){
            instance = new Table();
        }
        return instance;
    }

    // synchronized method to prevent thread interference and consistency problem.
    synchronized void printTable(int n){
        for (int i = 1; i < 5; i++) {
            System.out.println(n * i);
        }
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
