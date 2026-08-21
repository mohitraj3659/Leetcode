class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry=0;
        int n=num.length-1;
        List<Integer> l=new ArrayList<>();
        while(n>=0||k>0){
            int sum=carry;
            if(n>=0){
                sum+=num[n];
            }
            if(k>0){
                sum+=k%10;
            }
            l.add(sum%10);
            carry=sum/10;
            n--;
            k/=10;
        }
        if(carry!=0) l.add(carry);
        Collections.reverse(l);
        return l;
    }
}