class Solution {
    public boolean backspaceCompare(String s, String t) {
        ArrayList<Character> a = new ArrayList<>();
        ArrayList<Character> b = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(a.size()>0){
                    a.remove(a.size()-1);
                }
            }
                else{
                    a.add(s.charAt(i));
                }

            
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(b.size()>0){
                    b.remove(b.size()-1);
                }
            }
                else{
                    b.add(t.charAt(i));
                }
            
        }
        return b.equals(a);
        }     
    }
