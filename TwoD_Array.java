import java.util.Scanner;
public class TwoD_Array {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row and column:");
        int row= sc.nextInt();
        int colmn=sc.nextInt();
        int Arr[][]= new int[row][colmn];
        
        System.out.println("Enter "+colmn*row+" elements :");
        for(int i=0;i<row;i++){
            for(int j=0;j<colmn;j++){
                Arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter The Element you want to find :");
        int x= sc.nextInt();
        boolean found=false;
         for(int i=0;i<row;i++){
            for(int j=0;j<colmn;j++){
                // System.out.print(Arr[i][j]+" ");
                if (Arr[i][j]==x){
                        System.out.println("Element "+x+" Found at Row:"+ (i+1)+" And Column : "+(j+1));
                        found=true;
                        break;
                }
               
             }
             if (found){
                break;
             }
            
             }
          
            if(!found){
                System.out.println("Element "+x+" Not Available in System !!");}
            for(int i=0;i<row;i++){
            for(int j=0;j<colmn;j++){
                System.out.print(Arr[i][j]+" ");
        }
           System.out.println();
        
    }
       
       sc.close();

     
}
    
}
