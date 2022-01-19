package kis.agh.edu.pl;

import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        // teoria LiftOFF
        /*
        for(int i=0; i<5;++i)
            new Thread(new LiftOff()).start(); // chyba
        System.out.println("Oczekiwanie na start przez 5 watkow");
        */

        // cwiczenie 1 concurrency
        for( int i=0; i<5; ++i)
            new Thread(new Cwiczenie1()).start();
    }
    }


