class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int arr[]=new int[26];
        int arr1[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch1=t.charAt(i);
            arr[ch-'a']++;
            arr1[ch1-'a']++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr1[i]) return false;
        }
        return true;
    }
}