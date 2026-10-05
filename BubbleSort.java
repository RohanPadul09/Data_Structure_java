public class BubbleSort {
     static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){

        System.out.print(" "+arr[i]);
        }
               
       }
    public static void main(String[]args){
        int temp=0;
        int innerLoopiteration=0;
        int outerLoopIteration=0;
        
         int arr[]={7,8,3,1,2,0,5,4,12,32,45,67,1,11,32,54,27,91};
        for(int i=arr.length-1;i>0;i--){
            for (int j=0; j<i;j++){
                
                if (arr[j]>arr[j+1]){
                   temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
                innerLoopiteration++;
                

            }
            outerLoopIteration++;
            
        }
        PrintArr(arr);
      
        System.out.println();
        System.out.println("Outer loop Executed : "+outerLoopIteration);
        System.out.println("inner loop Executed : "+innerLoopiteration);

       
    }
    
}
