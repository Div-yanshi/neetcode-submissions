class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[]=new int[k];int c=0;
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int n:nums)
        mp.put(n,mp.getOrDefault(n,0)+1);
        while(k>0){
            int max=Integer.MIN_VALUE,maxKey=0;
            for(int n:mp.keySet())
            {
                if(mp.get(n)>max){
                max=mp.get(n);
                maxKey=n;}
            }
            res[c]=maxKey;
            c++;
            mp.remove(maxKey);
            k--;


        } return res;
        
    }
}
