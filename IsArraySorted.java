import java.util.Scanner;

public class IsArraySorted{
    static boolean checkArray(int arr[],int curr,int next){
        if (next==arr.length){
            return true;
        }
        else if(arr[curr]>arr[next]){
            return false;

        }
        return checkArray(arr, curr+1, next+1);
        

        
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The length Of Array :");
        int length=sc.nextInt();
        int arr[]= new int[length];
        System.out.println("Enter Array Elements :");
        for(int i=0;i<=length-1;i++){
                arr[i]=sc.nextInt();
        }
        boolean isSorted = checkArray(arr, 0, 1);
        if (isSorted){
            System.out.println("it is a sorted array ");
        
        }
        else{
            System.out.println("not a sorted array !!");
        }
        sc.close();
    }
    
}
