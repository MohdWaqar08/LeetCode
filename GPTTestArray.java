import java.util.HashMap;
import java.util.HashSet;

public class GPTTestArray {
    
    public static int firstRepeatingElement(int[] arr) {
    // write your code here
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                return arr[i];
            } else {
                set.add(arr[i]);
            }
        }
        return -1;


    }

    public static int countSubarraysWithSumK(int[] arr, int k) {
    // write your code here
        int n = arr.length;
        int[] pref = new int[n];
        int count = 0;

        pref[0] = arr[0];

        for(int i = 1; i<n; i++){
            pref[i] = pref[i-1] + arr[i];
        }

        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                int sum;
                if(i==0){
                    sum = pref[j];
                } else {
                    sum = pref[j] - pref[i-1];
                }

                if (sum == k){
                    count++;
                }
            }
        }

        return count;
        

    }

    public static boolean hasPairWithSum(int[] arr, int target) {
    // write your code here

        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left != right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                return true;
            } else if(sum>target){
                right--;
            } else {
                left++;
            }    
        }
        return false;

    }

    public static int removeDuplicates(int[] arr) {
    // write your code here
        int i = 0;
        int j = 1;

        while(j<arr.length){
            if(arr[i] == arr[j]){
                j++;
            } else {
                i++;
                arr[i] = arr[j];
            }
        }

        return i+1;
        
    }




    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10, 12};
        boolean num = hasPairWithSum(arr, 16);
        System.out.println(num);
    }

}
