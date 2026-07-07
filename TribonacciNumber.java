public class TribonacciNumber {

    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;

        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm = 1;

        for(int i=1; i<=n; i++){
            int fourthTerm = firstTerm + secondTerm + thirdTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            thirdTerm = fourthTerm;
            

        }
        return firstTerm;
    }

    public static void main(String[] args) {
        TribonacciNumber obj = new TribonacciNumber();
        System.out.println(obj.tribonacci(8));

        System.out.println();

        TBRepractice obj1 = new TBRepractice();
        System.out.println(obj1.tribonacci(8));
    }
}

class TBRepractice{
    public int tribonacci(int n){

        if(n==1) return 0;
        if(n==2) return 1;
        if(n==3) return 1;

        int term1 = 0;
        int term2 = 1;
        int term3 = 1;

        for(int i = 1; i<=n; i++){
            int term4 = term1 + term2 + term3;
            term1 = term2; //We lose the previous value of term 1 forever.
            term2 = term3;
            term3 = term4;
        }
        return term1;
    }
}