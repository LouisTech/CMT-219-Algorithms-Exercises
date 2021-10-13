public class SumArray {
    public static void main(String[] args) {
        int[] nums = {3,5,7,9,10};
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }

        System.out.println(sum);
    }  
}