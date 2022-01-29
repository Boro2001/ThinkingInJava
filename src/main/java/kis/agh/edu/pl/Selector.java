package kis.agh.edu.pl;

public interface Selector {
    boolean end();
    Object current();
    void next(); // oczywiście to jest package-private
}