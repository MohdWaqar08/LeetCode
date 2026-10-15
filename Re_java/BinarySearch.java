package Re_java;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target){
        //We need a sorted array
        int left = 0;
        int right = arr.length-1;

        while (left <= right) {
            int mid = left + (right-left)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid]>target){
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }

        return -1;

    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Moves to the next line after printing
    }

    
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 12, 16, 25};
        String s = "hello";

        //Frequency counting
        int[] freq = new int[26];

        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
        }
       
        //Binary Search
        //System.out.println(binarySearch(arr, 0));

        printArray(freq);
        

    }

}
