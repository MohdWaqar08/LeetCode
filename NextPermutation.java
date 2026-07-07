public class NextPermutation {
    
    public static void nextPermutation(int[] nums){
        int n = nums.length;
        int pivot = -1;

        for(int i = n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i; //Found the pivot
                break;
            }
        }

        if(pivot != -1){//If pivot exists

            for(int i = n-1; i>0; i--){
                if(nums[i]>pivot){
                    swap(nums,i,pivot);
                    break;
                }
            }
        }

        reverse(nums, pivot+1,n-1);
        printArray(nums);
        
    }

    public static void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int st, int end){
        while (st < end) {
            swap(nums, st, end);
            st++;
            end--;
            
        }
    }

    public static void printArray(int[] nums){
        int n = nums.length;
        System.out.print("[");
        for(int i = 0; i<n; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.print("]");
    }

    public static void print2DArray(int[][] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1};
        nextPermutation(nums);
    }
}
