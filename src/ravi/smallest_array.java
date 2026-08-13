package ravi;

public class smallest_array {   //printing the smallest Array
    public static void main(String st[]){
        int[] arr = {12,31,123,312,312,132,132,31211,2,1,12,2,1221,1,1,12,};
        int smallest = arr[0];
        for(int i =0;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest = arr[i];

            }

        }
        System.out.println("Smallest Array is: " + smallest);
    }   
}