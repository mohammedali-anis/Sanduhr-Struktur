package klausur;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*****************************************************************************************

In der Main-Klasse müssen Sie nichts ändern!!!!!!!!!!!!!!

****************************************************************************************/
public class Main {

   public static void main(String[] args) {
       //Testarray deklarieren und initialisieren
       int[][] arr0 = new int[][]{  {1, 1, 1, 0, 0, 0},
    	   							{0, 1, 0, 0, 0, 0},
    	   							{1, 1, 1, 0, 0, 0},
    	   							{0, 0, 0, 0, 0, 0},
    	   							{0, 0, 0, 0, 0, 0},
    	   							{0, 0, 0, 0, 0, 0}
 				   				};

       int retValue=0;

       //Hier wird ein Objekt Ihrer Lösungsklasse deklariert!!
       YourClock yc = new YourClock();


	    System.out.println("Testfall: Zu erwartende Ausgabe ist 7!! Ihre Ausgabe: "+yc.getMaxValue(arr0));
       	
   }
}
