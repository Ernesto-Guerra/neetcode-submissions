class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer> uno = new HashMap<>();
        HashMap<Character,Integer> dos = new HashMap<>();

        for(int i = 0; i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            uno.put(a, uno.getOrDefault(a,0)+1);
            dos.put(b, dos.getOrDefault(b,0)+1);
        }
        
        if(!uno.equals(dos)){
            return false;
        }

        return true;
    }
}
