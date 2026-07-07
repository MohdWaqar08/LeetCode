public class MissingNumber {
     public static int missingNumber(int[] nums) {
        int n= nums.length;
        int nSum = (n*(n+1))/2;
        int aSum = 0;
        for(int i =0; i<=nums.length-1;i++){
            aSum += nums[i];
        }
        System.out.println(nSum+"nSum");
        System.out.println(aSum+"aSum");

        int ans = nSum - aSum;
        return ans;

    }
    public static void main(String[] args) {
        int[] nums = {3,0,1};

        
        int ans = missingNumber(nums);
        System.out.println(ans);
    }
}
