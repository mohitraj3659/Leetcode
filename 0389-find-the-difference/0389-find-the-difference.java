class Solution {
    public char findTheDifference(String s, String t) {
        int arr[]=new int[26];
        for(int i=0;i<t.length();i++){
            if(i!=s.length()){
                arr[s.charAt(i)-'a']++;
            }
            arr[t.charAt(i)-'a']++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0) return (char)(i+'a');
        }
        return ' ';
    }
}