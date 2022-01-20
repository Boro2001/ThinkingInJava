package kis.agh.edu.pl;

interface Selector {
    boolean end();
    Object current();
    void next(); // oczywiście to jest package-private
}
public class Sequence{
    private Object[] items;
    private int next;

    public Sequence( int size){items = new Object[size];}
    public void add(Object x){
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end(){return i==items.length;} // tutaj selector ma dostęp do zew klasy outer
        public Object current(){return items[i];}
        public void next(){if(i<items.length)++i;}
    }
    public Selector selector(){
        return new SequenceSelector();
    }

}