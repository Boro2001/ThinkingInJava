package kis.agh.edu.pl;

public class LiftOff implements Runnable{
    protected int countDown = 10;
    private static int taskCounter = 0;
    private final int id = taskCounter++;
    public LiftOff(){}
    public LiftOff(int countDown){this.countDown = countDown;}
    public String status(){
        return "#" + id + " " + countDown+"____";
    }
    @Override
    public void run(){
        while (countDown-->0){
            System.out.println(status());
            Thread.yield(); //ustempowanie innym wątkom, w przypadku gdy nie ma żadnego wątku to runnable nic nie zmienia
        }
    }
}
