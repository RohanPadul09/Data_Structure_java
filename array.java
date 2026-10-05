import java.util.Scanner;
public class array {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array :");
        int size = sc.nextInt();
        int arr []=new int[size];
        boolean found=false;


        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter numer to find :");
        int num=sc.nextInt();
        for (int i =0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("found the "+ num+" at index "+i);
                found=true;
                
            }
            
                
            
        }
        if(!found){
            System.out.println(num+" Not Found !!");
        }
        sc.close();

    }
    
}
