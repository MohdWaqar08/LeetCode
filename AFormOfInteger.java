
import java.util.LinkedList;
import java.util.List;

public class AFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
    LinkedList<Integer> result = new LinkedList<>();
        int i = num.length - 1;

        // Process from least significant digit
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            result.addFirst(k % 10);
            k /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] num  = {1,3,2,1};
        AFormOfInteger obj1 = new AFormOfInteger();
        System.out.println(obj1.addToArrayForm(num, 62));
    }
}

class AFOI {

    public List<Integer> addToArrayForm(int[] num, int k){
        LinkedList <Integer> result  = new LinkedList<>();
        int i = num.length-1;

        while(i>=0||k>0){
            if(i>=0){
                k += num[i];
                i--;
            }
            result.addFirst(k%10);
            k /= 10;
        }
        return result;
    }

    
}



