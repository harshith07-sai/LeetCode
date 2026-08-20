class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int l=0;
        int r=1;
        while(l<nums.length && r<nums.length){
            if(nums[l]%2!=0){
                while(r<nums.length && nums[r]%2!=0){
                    r+=2;
                }
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
            }
            l+=2;
        }
        return nums;
    }
}