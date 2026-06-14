class Solution {
    public boolean isPalindrome(String s) {
        s = s.toUpperCase();
        int l = 0;
        int r = s.length()-1;

        while(l<r){

            // si l no es alfanumerico
            while(!alphaNum(s.charAt(l)) && l<r){
                l++;
            }

            // si l no es alfanumerico
            while(!alphaNum(s.charAt(r)) && l<r){
                r--;
            }

            System.out.println(s.charAt(l) + " " + s.charAt(r));
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }

            l++;
            r--;
        }
        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= '0' && c <= '9');
    }
}
