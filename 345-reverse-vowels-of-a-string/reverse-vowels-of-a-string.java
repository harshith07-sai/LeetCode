class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        char [] arr=s.toCharArray();
        while(l<r){
            if(isVowel(s.charAt(l)) &&isVowel(s.charAt(r))){
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
            else if(isVowel(arr[l])){
                r--;
            }
            else{
                l++;
            }
        }
        return new String(arr);
    }
    public boolean isVowel(char g){
            return g=='a'||g=='e'||g=='i'||g=='o'||g=='u'||g=='A'||g=='E'||g=='I'||g=='O'||g=='U';
    }
}