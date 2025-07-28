import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");

        String str = scanner.nextLine();
        if(str.equals("Hello")){
            System.out.println("Matched!");
        }
        else {
            System.out.println("Not Matched!");
        }

        scanner.close();
    }
}
