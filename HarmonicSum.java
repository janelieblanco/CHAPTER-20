import java.util.Scanner; 

public class HarmonicSum {
    public static void main(String[] args){
        int i = 1;
        double inputN, sum = 0.0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter value for N: ");
        inputN = scan.nextDouble();

        while (i <= inputN){
            sum += 1.0/i;
            i++;
        }
        System.out.println("Sum is: " + sum);
        scan.close();
    }
}
