import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
Scanner console = new Scanner(System.in);
System.out.println("Choose a small number");
int y = console.nextInt();

System.out.println("Choose a larger number");
int x = console.nextInt();

int total = x + y;

System.out.println("Your Numbers total to " + total);


    
}
}