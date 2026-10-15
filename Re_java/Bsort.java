package Re_java;

public class Bsort {

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Moves to the next line after printing
    }

    
    public static void main(String[] args) {
        int arr[] = {2,5,7,1,6,3,4};

        //Bubble Sort
        for(int i = 0; i<arr.length; i++){
            for(int j = 0 ; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        System.out.println("Bubble sort");
        printArray(arr);
    }

}
