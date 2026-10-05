// Write a program to find if a number is a power of 2 or not.
// Write a program to toggle a bit a position = “pos” in a number “n”.
// Write a program to count the number of 1’s in a binary representation of the number.
// Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [BONUS]
import java.util.*;


public class bitManipulation {
    int BinaryToDecimal(int binary){
        int pow=0;
        int decimal=0;
        while (binary>0){
            int last_digit=binary%10;
            decimal=decimal+last_digit*((int)Math.pow(2, pow));
            pow++;
            binary/=10;
        }
        return decimal;

    }

    int CountNumberOfOneBit(int num){
        int count=0;
        int num_copy=num;
        
        while (num_copy!=0) {
                num_copy=num_copy & (num_copy-1);
                count++;

        }
        return count ;
        
       
    }

 
 
    void IsPowerOfTwoOrNot(int num){
        if(num>0 && (num&(num-1))==0){
            System.out.println(num+" Is Power of 2 ");
            
        }else{
            System.out.println(num+" Is NOT Power of 2 ");
        }
    }


    int toggle(int num, int position){
        int bitMask = 1<<position;
        int newNumber= num ^ bitMask;
        return newNumber;

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number :");
        int num = sc.nextInt();

        System.out.println("Enter The Position :");
        int position = sc.nextInt();

        bitManipulation bm = new bitManipulation();

        System.out.println("we chenged the number " + num +"To new number"+bm.toggle(num, position));
        System.out.println("Number of 1s in :"+num+" is "+ bm.CountNumberOfOneBit(num));
        bm.IsPowerOfTwoOrNot(num);
        System.out.println("Enter the binary u want to convert in decimal ");
        int binary=sc.nextInt();
        System.out.println("the conversion of binary "+binary+" is : "+bm.BinaryToDecimal(binary));


        
        sc.close();

        
    }
    
    
}
