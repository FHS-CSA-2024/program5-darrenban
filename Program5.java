//import stuff here?
import java.util.Scanner;
//Your code here
public class program5{
    public static void main(String[] args){
        int royaleMile = 286;
        int koopaMile = 412;
        int pipeMile = 361;
        int badwagonMile = 161;
        int royaleGal = 9;
        int koopaGal = 40;
        int pipeGal = 18;
        int badwagonGal = 11;
        
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println("Royale averaged " +  Math.round(10 * (double) royaleMile / royaleGal)/10.0 + " m/g");
        System.out.println("Koopa King averaged " + Math.round(10 * (double) koopaMile / koopaGal)/10.0 + " m/g");
        System.out.println("Pipe Frame averaged " + Math.round(10 * (double) pipeMile / pipeGal)/10.0 + " m/g");
        System.out.println("Badwagon averaged " + Math.round(10 * (double) badwagonMile / badwagonGal)/10.0 + " m/g");
    
        
    }
}


//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:
Royale averaged 31.8 m/g
Koopa King averaged 10.3 m/g
Pipe Frame averaged 20.1 m/g
Badwagon averaged 14.6 m/g

*/
