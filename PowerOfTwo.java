public class PowerOfTwo {

    public boolean isPowerOfTwo(int n){
        if(n==1) return true;
        if(n<=0) return false;
        int po2=0;
        int x = n;
        while(x>1){
            po2 = x/2;
            x = x/2; 
            if(x%2!=0){
                return false;
            }

        }
        if(po2 == 1){
            return true;
        } else {
            return false;
        }
        
    }
    public static void main(String[] args) {
        PowerOfTwo obj = new PowerOfTwo();
        System.out.println(obj.isPowerOfTwo(144));
    }
}
