import java.util.Scanner;

public class AddingUpIntegers {
    public static void main(String[] args){
        int numbersAdded, count = 0;
        float inputNum, sum = 0.0f;
        Scanner scan = new Scanner(System.in);

        System.out.print("How many integers will be added: ");
        numbersAdded = scan.nextInt();

        while (count < numbersAdded){
            System.out.println("Enter an integer: ");
            inputNum = scan.nextFloat(); 
            sum += inputNum; 
            count++;
        }
        System.out.println("The sum of the integers you input is " + sum);
        scan.close();
    }
}
