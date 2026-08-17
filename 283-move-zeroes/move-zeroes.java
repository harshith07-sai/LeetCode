class Solution {
    public void moveZeroes(int[] nums) {
      ArrayList<Integer> list=new ArrayList<>();
      for(int num:nums){
        if(num!=0){
            list.add(num);
        } 
      }
      for(int i=0;i<list.size();i++){
        nums[i]=list.get(i);
      }      
      for(int i=list.size();i<nums.length;i++){
        nums[i]=0;
      }

    }
}