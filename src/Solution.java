public class Solution {
    public int[] twoSum(int[] nums, int target){

        int[] out=new int[2];
        for(int i = 0; i<=nums.length; i++){
            out[0] = i;
            for(int j = i+1; j < nums.length; j++){
                int sum = nums[i]+nums[j];
                if(sum == target){
                    System.out.println(nums[i] + nums[j]);
                    out[1] = j;
                    break;
                }

            }
        }

        return out;
    }
}
