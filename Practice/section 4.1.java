
import java.util.Random;

public class ComputeMethods {
    
    public double fToC(double degreesF) {
        return 5.0 / 9 * (degreesF - 32);
    }

    /
    public double hypotenuse(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }

    
    public int roll() {
        Random random = new Random();
        int die1 = random.nextInt(6) + 1; 
        int die2 = random.nextInt(6) + 1; 
        return die1 + die2; 
    }
}


public class TestClass {
    public static void main(String[] args) {
        ComputeMethods cm = new ComputeMethods();
        
        
        double fahrenheit = 100; 
        double celsius = cm.fToC(fahrenheit);
        System.out.println("Temp in Celsius is " + celsius);
        
        
        int sideA = 5; 
        int sideB = 7; 
        double hypotenuse = cm.hypotenuse(sideA, sideB);
        System.out.println("Hypotenuse is " + hypotenuse);
        
       
        int diceSum = cm.roll();
        System.out.println("The sum of the dice values is " + diceSum);
    }
