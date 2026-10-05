// move all "x" to the end of string "axbcxxd"
//using recursion
public class PracticeQuestion {
    public static int count=0;
    static void moveAllX(String str, int idx, int count,String newString){
        if(idx==str.length()){
            for(int i =0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return ;
        }
        char currChar = str.charAt(idx);

        if(currChar=='x'){
            count++;   
            moveAllX(str, idx+1, count, newString);
        }
        else{
            newString+=currChar;
            moveAllX(str, idx+1, count, newString);
        }
    
    
       
       
    }

    public static void main(String[]args){
        String str="axbvvxerxxcxxd";
        
        moveAllX(str, 0,0,"");
    }

    
}
