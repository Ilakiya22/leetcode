class Solution {
    public int subtractProductAndSum(int n) {
        int productDigit=1;
        int sumDigit=0;
        while(n>0){
            int digit=n%10;
            productDigit*=digit;
            sumDigit+=digit;
            n=n/10;
        }

        return productDigit-sumDigit;
    }
}