public class FibonacciNumber {
    //This code is to find out the number on the nth term of fibonacci series.
    public static int fib(int n){
        //This code is to find out the number on the nth term of fibonacci series.
        if(n==0) return 0;
        if(n==1) return 1;
        
        int firstTerm = 0;
        int secondTerm = 1;
        //int thirdTerm=0;

        for(int i = 1 ; i<=n; i++){
            int thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }

        return firstTerm;

    }
    public static void main(String[] args) {
        //System.out.println(fib(3));

       
        
    }
}


