class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        HashMap<String, ArrayList<String>> f = new HashMap<>();

        for(String s: strs){
            
            char[] letras = s.toCharArray();
            Arrays.sort(letras);

            String sorted = new String(letras);

            ArrayList<String> lista = f.getOrDefault(sorted, new ArrayList<>());
        
            lista.add(s);
            f.put(sorted, lista);
        }

        return new ArrayList<>(f.values());
    }
}
