import java.util.Scanner;
public class recursion {
    public static int calculateFactorial(int num){
        if (num<0){
            System.out.println("negative number!!");
            return 0;
        }
        if(num==0||num==1){
            return 1;
        }
        int fact_numM1=calculateFactorial(num-1);
        int fact=num*fact_numM1;
        return fact; 
    
        
    }
    public static void  main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number :");
        int num =sc.nextInt() ;
        int factorial=calculateFactorial(num);
        System.out.println(factorial);

        
        sc.close();


    }
    
}
