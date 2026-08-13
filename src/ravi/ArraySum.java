package ravi;

public class ArraySum {
    public static void main(String st[]){
        int arr[] = {12,23,21,23,32,3,4,4,5,533};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
    }
    System.out.println("Sum of the arrays are: " + sum);
    
}
}