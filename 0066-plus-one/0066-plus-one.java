class Solution {
    public int[] plusOne(int[] digits) {
        // int temp=digits[digit.length-1]+1;
        // int carry=temp/10;
        // if(carry==0){
        //     digits[digit.length-1]=temp;
        //     return digits;
        // }
        int carry1=1;
        for(int i=digits.length-1;i>=0;i--){
            int temp1=digits[i]+carry1;
            digits[i]=temp1%10;
            carry1=temp1/10;
            if(carry1==0) break;
        }
        if(carry1==0) return digits;
        int arr[]=new int[digits.length+1];
        arr[0]=1;
        for(int i=1;i<arr.length;i++){
            arr[i]=digits[i-1];
        }
        return arr;
    }
}