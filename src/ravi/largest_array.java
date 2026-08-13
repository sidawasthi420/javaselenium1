package ravi;

public class largest_array {
    public static void main(String st[]){
        int[] arr = {12,32,43,5,45,32,2,322,23,32232,223,323};
        int largest = arr[0];

        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];

            }

        }
        System.out.println("Largest array is : " + largest);
    }
}