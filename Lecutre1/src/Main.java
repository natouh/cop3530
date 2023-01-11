//problem #2
import java.util.Random;
public class Main {
    public static void main(String args[]) {
        Random rand = new Random();
        int min = 1;
        int max = 100;
        int result= rand.nextInt(max-min) + min;

        if(result < 10) {
            System.out.println(result);
        }
         else if (result < 50) {
            System.out.println(result + 100);
        }
        else {
            System.out.println(result - 100);
        }
        System.out.print("Your results is" + result);
    
   
    }
}