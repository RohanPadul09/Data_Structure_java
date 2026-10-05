public class SelectionSort {
   static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){

        System.out.print(" "+arr[i]);
    }}
    public static void main(String[]args){
        int innerLoopiteration=0;
        int outerLoopIteration=0;
         int arr[]={7,8,3,1,2,0,5,4,12,32,45,67,1,11,32,54,27,91};

        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
                innerLoopiteration++;
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
            outerLoopIteration++;
        }
        PrintArr(arr);
         System.out.println();
        System.out.println("Outer loop Executed : "+outerLoopIteration);
        System.out.println("inner loop Executed : "+innerLoopiteration);

    }
    
}
