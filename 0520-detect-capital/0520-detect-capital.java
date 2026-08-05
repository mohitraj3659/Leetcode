class Solution {
    public boolean detectCapitalUse(String word) {
        int count1=0;
        int count2=0;
        boolean isCaptial=false;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)){
                count1++;
                if(i!=0) isCaptial=true;
            }
            else count2++;
        }
        if((count1>0&&count2==0)||(count1==1&&count2>=0&&!isCaptial)||(count1==0&&count2>0)) return true;
        else return false;
    }
}