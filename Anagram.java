class Solution {
    public boolean isAnagram(String s, String t) {
        char str[]=s.toCharArray();
        char tstr[]=t.toCharArray();
        Arrays.sort(str);
        Arrays.sort(tstr);
        return Arrays.equals(str,tstr);
        
    }
}