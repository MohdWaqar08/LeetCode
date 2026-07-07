import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArray {


    public static int[][] merge(int[][] intervals){
        int n = intervals.length;
        
        //Edge CAse 1:
        if(n <= 1) return intervals;

        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0], b[0]));
        //Array is now sorted 

        List<int[]> result = new ArrayList<>();

        int[] newInterval = intervals[0];
        result.add(newInterval);

        for(int[] interval: intervals){
            if(interval[0] <= newInterval[1]){//Comparing to merge or not!!
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            } else{
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{4,7},{1,4}};
        int[][] result = merge(intervals);

        for(int[] i: result){
            for(int j: i){
                System.out.println(j);
            }
        }

    }
}
