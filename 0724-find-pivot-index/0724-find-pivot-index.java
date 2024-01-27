class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int rightSum = sum - leftSum - nums[i];
            if(rightSum == leftSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}