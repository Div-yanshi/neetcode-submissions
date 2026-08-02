class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> set=new HashSet<>();
      for(int i=0;i<nums.length;i++)
      set.add(nums[i]);int cnt=0, lon=Integer.MIN_VALUE;
      for(int i:set){
        if(!set.contains(i-1)){
          int cur=i+1;
          cnt=1;
          while(set.contains(cur)){
            cnt++;
            cur=cur+1;

          } lon=Math.max(lon,cnt);
          cnt=0;
        }
      }
      if(lon<=0)
      return 0;
      else
        return lon;
    }
}
