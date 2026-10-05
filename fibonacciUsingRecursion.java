import java.util.Scanner;
public class fibonacciUsingRecursion {
    public static void fibonacci(int a,int b,int num){
        if (num==0){
            return ;    
        }
        else{
            int c = a+b;
            System.out.println(c);
            fibonacci(b, c, num-1);
        }
    }
    public static void main(){
        Scanner scan = new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("Enter the number up to which you want the Fibonacci :");
        int num=scan.nextInt();
        System.out.println("\nHere it is :");
        System.out.println("\n"+a);
        System.out.println(b);
        fibonacci(a, b, num-2);
        scan.close();

    }

}
