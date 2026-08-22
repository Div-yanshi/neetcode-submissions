class Solution {
    public int maxArea(int[] heights) {
        int s=0;
        int e=heights.length-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;int con=0;
        while(s<e){
            min=Math.min(heights[s],heights[e]);
            con=min * (e-s);
            max=Math.max(max,con);
            if(heights[s]<heights[e])
            s++;
            else
            e--;

        }
        return max;
    }
}
