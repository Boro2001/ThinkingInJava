package kis.agh.edu.pl;



public class Outer{
    private String outerString;
    public Outer(String outerString){this.outerString = outerString;}
    public class Inner{
        int i = 12; 
        public void printI(){System.out.println("I to jest : " + i);}
        public String toString(){
            return outerString;
        }
    }
    public Inner getInner(){
        Inner in = new Inner();
        return in;
    }
    public static void main(String[] args) {
        System.out.println("siemano ");
        Outer out = new Outer("Testowy string do stingowania");
        Outer.Inner in = out.getInner();
        System.out.printf(in.toString());
    }
}
