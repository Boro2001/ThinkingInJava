package kis.agh.edu.pl;


public class StringContainer{
    String string;
    public StringContainer(String string){this.string = string;}
    public StringContainer(){string = "We re going to you";}
    public String toString(){return string;}
    public static void main(String[] args) {

        Sequence seq = new Sequence(5);
        for(int i=0; i<5; ++i){
            StringContainer cont = new StringContainer(Integer.toString(i));
            seq.add(cont);
        }
        Selector selector = seq.selector();
        while(!selector.end()){
            System.out.println(selector.current().toString());
            selector.next();
        }
    }
}