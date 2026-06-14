class Solution {
    public boolean isPalindrome(String s) {
        s = s.toUpperCase();
        int l = 0;
        int r = s.length()-1;

        while(l<r){
            char i = s.charAt(l);
            // si l no es alfanumerico
            if(!alphaNum(i)){
                l++;
                continue;
            }

            char d = s.charAt(r);
            // si l no es alfanumerico
            if(!alphaNum(d)){
                r--;
                continue;
            }

            System.out.println(i + " " + d);
            if(i != d){
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
