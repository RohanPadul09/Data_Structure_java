import java.util.*;


public class String_Builder {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // StringBuilder sb = new StringBuilder("Hello Java Programming");

        // sb.append(" Language"); 
        // System.out.println(sb);
        // sb.insert(0,"Oop ");
        // System.out.println(sb);
        // sb.replace(15,26,"Development");
        // System.out.println(sb);
        // sb.delete(4, 9);
        // System.out.println(sb);
        // sb.reverse();
        // System.out.println(sb);

        StringBuilder sb = new StringBuilder(" rohan padul ");
        System.out.println(sb);

        sb.delete(0, 1);
        sb.delete(sb.length()-1, sb.length());
        System.out.println(sb);
        sb.setCharAt(0, 'R');
        System.out.println(sb);
        sb.setCharAt(6,'P');
        System.out.println(sb);
        sb.setCharAt(5, '@');
        System.out.println(sb);
        sb.append(".Com");
        System.out.println(sb);
        sb.delete(sb.indexOf("@"),sb.indexOf("@")+1);
        System.out.println(sb);
        


        
        sc.close();

        
        

    }
    
}
