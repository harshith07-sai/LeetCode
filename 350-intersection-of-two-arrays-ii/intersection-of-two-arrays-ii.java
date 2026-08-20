class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                if(map.get(nums2[i])==1){
                    ans.add(nums2[i]);
                    map.remove(nums2[i]);
                }
                else{
                    ans.add(nums2[i]);
                    map.put(nums2[i],map.get(nums2[i])-1);
                }
            }
        }
        int a[]=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            a[k]=ans.get(k);
        }
        return a;
    }
}