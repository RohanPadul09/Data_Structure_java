class first{
    
   // Java program to show the use of
// substring(int begIndex, int endIndex)
 


    public static void main(String[] args)

    {
       int arr[]={1,2,3,4};
       float mid=0;
       int last = arr.length-1;
       for(int i=0;i<=(arr.length-1)/2;i++){
            if(i==(arr.length-1)/2){
                mid=(arr[i]+arr[last])/2.0f;
                break;
            }
            last--;

       }
       System.out.println(mid);

        
    }
}