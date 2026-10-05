import java.util.Scanner;
public class inverted_pyramid {
    public static void main(String[]args){
      Scanner scan = new Scanner(System.in);
         System.out.println("Enter Number of Row :");
        int n = scan.nextInt();

        //loop for row
        for (int i=1;i<=n;i++){
            
            //loop for space
         for(int j=1;j<=n-i;j++){
            System.out.print(" ");

         }

         //loop for *
         for(int j =1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println();
    }
   
   for (int i=1; i<=n; i++){
      for(int j = 1;j<=i;j++){
         if ((i+j)%2==0){
         System.out.print( " 1 ");
         }
         else{
            System.out.print(" 0 ");
         }
         
        
      }
      
      System.out.println();

   }
   scan.close();




}


}
