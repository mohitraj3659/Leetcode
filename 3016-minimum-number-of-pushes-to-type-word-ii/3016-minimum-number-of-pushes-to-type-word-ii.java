class Solution {
    public int minimumPushes(String word) {
        int arr[]=new int[26];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            arr[ch-'a']++;
        }
        Arrays.sort(arr);
        int j=0;
        int click=0;
        int i=arr.length-1;
        while(i>=0&&arr[i]>0){
            click+=((j/8+1)*arr[i]);
            i--;
            j++;
        }
        return click;
    }
}