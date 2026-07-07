public class MaxProductOFAr {
    public int maxProduct(int[] nums) {
    int result = 0;
    int swaper = 0;

    // Bubble sort (descending order)
    for (int i = 0; i < nums.length - 1; i++) {
        for (int j = 0; j < nums.length - 1 - i; j++) {
            if (nums[j] < nums[j + 1]) {
                swaper = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = swaper;
            }
        }
    }

    // for (int i = 0; i <= nums.length - 1; i++) {
    //     System.out.println(nums[i]);
    // }

    result = (nums[0] - 1) * (nums[1] - 1);
    return result;
}


    public static void main(String[] args) {
        MaxProductOFAr obj = new MaxProductOFAr();
        int[] nums= {3,4,5,2};
        System.out.println(obj.maxProduct(nums));
    }
}
