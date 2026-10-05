public class PermutationUsingRecursion_Backtracking {
        static void permutation(String str,String perm, int idx){
            if(str.length()==0){
                System.out.println(perm);
                return ;
            }
            for(int i=0;i<str.length();i++){
                char currChar = str.charAt(i);
                String newString = str.substring(0,i)+str.substring(i+1);
                permutation(newString, perm+currChar, idx+1);

            }
        }
        public static void main(String[]args){
            String str= "ABCD";
            permutation(str, "", 0);
        }
}
