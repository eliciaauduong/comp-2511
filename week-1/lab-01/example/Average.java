package example;

public class Average {

    /**
     * Returns the average of an array of numbers
     * 
     * @param the array of integer numbers
     * @return the average of the numbers
     */
    public float average(int[] nums) {
        float result = 0;
        int sum = 0;
        // int elem_count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        result = sum / nums.length;
        return result;
    }

    public static void main(String[] args) {
        int[] myNum = { 10, 20, 30, 40 };
        Average avg = new Average();
        float calc_avg = avg.average(myNum);
        System.out.println(calc_avg);
    }
}
