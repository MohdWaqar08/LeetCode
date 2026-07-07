public class WaterBottles {
    
    public int numWaterBottles(int numBottles, int numExchange) {
    int answer = numBottles;

    while (numBottles >= numExchange) {
        int newBottles = numBottles / numExchange;
        int remBottles = numBottles % numExchange;

        answer += newBottles;
        numBottles = newBottles + remBottles; // Key fix
    }

    return answer;
}

    public static void main(String[] args) {
        WB obj = new WB();
        System.out.println(obj.numWaterBottles(9, 3));
    }


}

class WB{
    public int numWaterBottles(int numBottles, int numExchange){
        int ans = numBottles;
        while(numBottles>=numExchange){
            int newFilledBottles = numBottles / numExchange;
            int remEmptyBottles = numBottles % numExchange;

            ans += newFilledBottles;
            numBottles = newFilledBottles + remEmptyBottles;

        }
        return ans;
    }
}

