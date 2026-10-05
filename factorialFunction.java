import java.math.BigInteger;
import java.util.Scanner;
public class factorialFunction {
    public static BigInteger factorial (int num){
        BigInteger fact = BigInteger.ONE;
        for (int i=num;i>=1;i--){
            fact= fact.multiply(BigInteger.valueOf(i));
            
        }
        return fact;

    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number for calculate Factorial :");
        int num= sc.nextInt();
        sc.close();
        BigInteger factorial = factorial(num);
        System.out.println("The Factorial of "+num+" is "+ factorial);

    }
    
}
