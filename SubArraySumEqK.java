import java.util.HashMap;

public class SubArraySumEqK {
    
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        
        int[] pref = new int[n];
        pref[0] = nums[0];
        for(int i = 1; i<n; i++){
            pref[i] = pref[i-1] + nums[i];
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        

        for(int i = 0; i<n; i++){
            int sum = pref[i];
            int x = sum-k;

            if(map.containsKey(x)){
                count += map.get(x);
            } 

            map.put(sum, map.getOrDefault(sum, 0) + 1);
            
        }

        return count;
        
    }


    public static void main(String[] args) {
        
    }
}
