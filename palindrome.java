import java.util.Scanner;
public class palindrome {
  static  boolean isPalindrome(String s){
    int left = 0;
    int right=s.length()-1;
    while (left != right) {
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        left++;
        right--;
    
    }
    return true;
  } 

   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String :");
    String str= sc.next();
    if (isPalindrome(str.toLowerCase())){
        System.out.println(str+" Is a Palindrome ");
    }
    else{
        System.out.println(str+" is not a palindrome!!!");
    }
    sc.close();
   }
}
