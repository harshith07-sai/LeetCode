class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int i=nums.length-1;
        int ans[]=new int[nums.length];
        while(left<=right){
        int r=nums[right]*nums[right];
        int l=nums[left]*nums[left];
        if(r>l){
            ans[i]=r;
            right--;
        }
        else{
            ans[i]=l;
            left++;
        }
        i--;
        }
        return ans;
    }
}