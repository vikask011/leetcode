class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int minlen=Math.min(str1.length(),str2.length());
        for(int len=minlen;len>=1;len--){
            if(str1.length()%len==0 && str2.length()%len==0 ){
                return str1.substring(0,len);
            }
        }
        return "";
    }
}