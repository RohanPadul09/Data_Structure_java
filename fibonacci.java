import java.util.Scanner;
public class fibonacci {
    public static void calculateFibonacci(int num){
        int a=0;
        int b=1;
        for(int i=0;i<num;i++){
            System.out.print(a+" ");
            int c= a+b;
            a=b;
            b=c;
        
        }
        return ;

    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of fibonacci:");
        int num=sc.nextInt();
        sc.close();
        calculateFibonacci(num);

    }
    
}
