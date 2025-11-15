class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int res=0;
        while(left <right){
       int capacity=Math.min(height[left],height[right])*(right-left);
       res=Math.max(res,capacity);
       if(height[left]<height[right]){
        left++;
       }
       else {
        right--;
       }
        }
        return res;
    }
}