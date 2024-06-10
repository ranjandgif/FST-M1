package Activity4;

import java.util.Arrays;

public class Activity4 {          

    public static void main(String[] args) {
       
      int arr[] = {12, 11, -13, 5, 6};
         int n = arr.length;
 
         for(int i=1; i<n; i++){
             int temp = arr[i];
             //2nd value
             int j = i-1;
             //1sta value 
 
             while(j>=0 && arr[j]>temp){
                 arr[j+1] = arr[j];
                 j--;
             }
 
             arr[j+1] = temp;
         }
 
         for(int i=0; i<n; i++){
             System.out.print(arr[i]+" ");
         }
     }

        

        

       

       
        
        
    }




