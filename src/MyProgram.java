import java.util.*;

public class MyProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input a number.");
        double num1 = input.nextDouble();

        System.out.println("Please input a 2nd number.");
        double num2 = input.nextDouble();

        System.out.println("Please input a 3rd number.");
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }
 
    public static void displaySortedNumbers (double num1, double num2, double num3){

        double[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);

        System.out.println("Numbers in increasing order: " + Arrays.toString(numbers));
    }
}
