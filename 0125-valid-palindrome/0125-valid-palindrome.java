class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int start = 0, end = str.length()-1;
        while(start<end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}