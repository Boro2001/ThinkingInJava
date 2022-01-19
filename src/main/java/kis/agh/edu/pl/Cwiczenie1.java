package kis.agh.edu.pl;

public class Cwiczenie1 implements Runnable{
    private static int taskCount; // na poczatku to i tak bedzie 0
    private final int id = taskCount++;
    @Override
    public void run(){
        System.out.println(id + "Jakiś glupi komunikat");
        Thread.yield();
        System.out.println(id + "kolejny glupi komunikat");
        Thread.yield();
        System.out.println(id + " Komunikat ");
        Thread.yield();
    }
}
