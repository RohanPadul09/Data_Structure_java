import java.util.Scanner;
public class hollow_rect{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of column and row ");
        int colmn=sc.nextInt();
        int row = sc.nextInt();

        for (int i=1;i<=colmn;i++){
            for (int j=1; j<=row;j++){
                if(i==1||j==1 ||i==colmn||j==row){
                    System.out.print("*");
                
                }
                else{
                    System.out.print(" ");
                }
                
            }
             System.out.println();
             sc.close();
        }
    }
}