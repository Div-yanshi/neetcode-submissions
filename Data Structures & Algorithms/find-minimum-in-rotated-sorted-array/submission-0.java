class Solution {
    public int findMin(int[] nums) {

        if(nums.length==1)
        return nums[0];
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>prev)
            prev=nums[i];
            else
            return nums[i];
        }
        return nums[0];
    }
}
