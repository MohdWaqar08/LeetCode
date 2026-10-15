package Re_java;

public class Ssort {

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Moves to the next line after printing
    }
    
    public static void main(String[] args) {
        int arr[] = {2,5,7,1,6,3,4};

        //Selection sort
        for(int i = 0; i<arr.length; i++){
            int smallest = i;
            for(int j = i+1; j<arr.length; j++){
                //check
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }

            //Swap
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        
        printArray(arr);
    }
}
