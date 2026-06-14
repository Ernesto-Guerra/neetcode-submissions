class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s.length()).append(",");
        }

        sb.append("A");

        for(String s: strs){
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        System.out.println(str);
        if (str.length() == 0) {
            return new ArrayList<>();
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList words = new ArrayList<String>();
        int i = 0;
        
        while(str.charAt(i) != 'A'){
            while(str.charAt(i) != ','){
                sb.append(str.charAt(i));
                i++;
            }
            i++;
            nums.add(Integer.parseInt(sb.toString()));
            sb = new StringBuilder();
        
        }

        i++;
        for(int num:nums){
            words.add(str.substring(i, i+num));
            i=i+num;
        }

        return words;
    }
}
