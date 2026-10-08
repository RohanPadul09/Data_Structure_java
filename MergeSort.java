import java.util.Arrays;

public class MergeSort {
    public static void merge(int arr[],int st_idx, int mid_idx, int end_index){
        int sorted_arr[]= new int[end_index-st_idx+1];
        int i = st_idx;
        int j = mid_idx+1;
        int idx=0;

        while(i<=mid_idx && j<=end_index ){
            if (arr[i]<arr[j]){
                sorted_arr[idx++]=arr[i++];
               
                
            }
            else{
                sorted_arr[idx++]=arr[j++];
              
            }

        }
        // for remaining element in left half
        while(i<=mid_idx){
             sorted_arr[idx++]=arr[i++];
              
        }
        // for remainign element in right half
        while(j<=end_index){
             sorted_arr[idx++]=arr[j++];
              
        }

        // insert in main array
        for (int k =0,l=st_idx; k<sorted_arr.length;k++,l++){
            arr[l]=sorted_arr[k];
        }

    }
    public static  void divide(int arr[],int st_idx, int end_index){
        int mid_idx = st_idx+(end_index-st_idx)/2;
        
        if(end_index<=st_idx){
            return ;
        }
        divide(arr, st_idx, mid_idx);
        divide(arr, mid_idx+1, end_index);
        merge(arr,st_idx,mid_idx,end_index);
    }
    public static void main(String[]args){
        int arr []={12,34,45,23,12,33,11,11,1,12,13,0};
     
        divide(arr, 0, arr.length-1);
        
        System.out.println(Arrays.toString(arr));
        

    }
}
