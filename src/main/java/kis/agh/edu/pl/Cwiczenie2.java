package kis.agh.edu.pl;



public class Cwiczenie2 implements Runnable  {
    private static int taskCounter;
    private final int n;
    public Cwiczenie2(int n) {
        this.n = n;
    }
    public Integer next(){}
    private int fib(int n){
        if(n<2) return 1;
        else return fib(n-2) + fib(n-1);
    }
    @Override
    public void run(){
        Integer[] sequence = new Integer[n];
    }
}
