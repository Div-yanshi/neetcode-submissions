class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre[]=new int[nums.length];
        int suf[]=new int[nums.length];
        int res[]=new int[nums.length];
        pre[0]=nums[0];
        suf[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++)
        pre[i]=nums[i]*pre[i-1];
        for(int j=nums.length-2;j>=0;j--)
        suf[j]=nums[j]*suf[j+1];
        res[0]=suf[1];
        res[nums.length-1]=pre[nums.length-2];
        for(int i=1;i<nums.length-1;i++)
        res[i]=pre[i-1]*suf[i+1];
        return res;



        
    }
}  
