import java.util.Scanner;
public class sumOfOddNumber {
    public static int sumOfOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.print(i +" ");
                sum +=i;
                
                
            } 

            

        }
        System.out.println();
        return sum;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int n= sc.nextInt();
        System.out.println("The sum of 1 to "+ n + " Numbers is : "+sumOfOdd(n));
        sc.close();
        }

    
}
