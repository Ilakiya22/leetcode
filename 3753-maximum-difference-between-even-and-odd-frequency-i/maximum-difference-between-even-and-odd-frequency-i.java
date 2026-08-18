class Solution {
    public int maxDifference(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        int odd=0;
        int even=s.length();
        for(int i=0;i<freq.length;i++){
            if(freq[i]%2==0 && freq[i]>0){
                even=Math.min(even,freq[i]);
            }
            else{
                odd=Math.max(odd,freq[i]);
            }
        }
        int diff=odd-even;
        return diff;

        
    }
}