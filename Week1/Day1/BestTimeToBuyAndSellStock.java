package Week_1.Day1;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] arr) {
    
    int maxPro = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        minPrice = Math.min(minPrice, arr[i]);
        maxPro = Math.max(maxPro, arr[i] - minPrice);
    }
    return maxPro;   
    }
}
