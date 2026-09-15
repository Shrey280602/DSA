class Solution {
    public boolean isHappy(int n) {
        for(int i=0;i<100;i++){
            n=getN(n);

            if(n==1){
                return true;
            }
        }
        return false;
    }

    private int getN(int n){
        int ans = 0;

        while(n>0){
            int ld = n%10;
            ans+= ld*ld;
            n=n/10;
        }
        return ans;
    }
}