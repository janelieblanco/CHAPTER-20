import java.util.Scanner;

public class AverageAndStandardDeviation {
    public static void main (String[] args){
        int totalNumbers, count = 0;
        double inputNum, sumOfN = 0.0, avg, avgSquare, standardDev, sumSquared = 0.0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of values to follow: ");
        totalNumbers = scan.nextInt();

        while (count < totalNumbers){
            System.out.println("Enter the following value: ");
            inputNum = scan.nextDouble(); 
            sumOfN += inputNum; 
            sumSquared += inputNum * inputNum;
            count++;
        }
        avg = sumOfN / totalNumbers;
        avgSquare = sumSquared / totalNumbers;
        standardDev = Math.sqrt(avgSquare - avg * avg);

        System.out.println("Average is " + avg);
        System.out.println("Average Square is " + avgSquare);
        System.out.println("Standard Deviation is " + standardDev);

        scan.close();
    }
}
