package GOOGLE;

public class AwardBudgetCut {
    public int findGrantsCap(int[] grantsArray, int newBudget) {
        // 1. Find average number
        int length = grantsArray.length;
        System.out.println("length is "+length);
        int average = newBudget / length;
        System.out.println("average is "+ average);
        // 2. check how many index > average
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (grantsArray[i] > average) {
                count++;
            }

        }
        System.out.println("count is " + count);
        //3. find sum of index which has value < average
        int sum =0;
        for (int i=0; i<length;i++){
            if (grantsArray[i]<=average){
                sum=sum+grantsArray[i];
            }

        }
        System.out.println("sum is "+ sum);

        //3. find cap
        int cap= (newBudget-sum)/count;
        System.out.println("cap is "+ cap);
        return cap;

    }

    public static void main(String[] args) {
        int[] grantsArray={100, 300, 200, 400};
        int[] grantsArray1={2, 100, 50, 120,1000};
        int newBudget = 800;
        int newBudget1=190;
        AwardBudgetCut a= new AwardBudgetCut();
        a.findGrantsCap(grantsArray,newBudget);

    }
}
