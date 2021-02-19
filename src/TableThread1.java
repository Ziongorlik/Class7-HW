public class TableThread1 extends Thread{
    Table t;

    public TableThread1(Table t){
        this.t = t;
    }

    public void run(){
        t.printTable(5);
    }
}
