class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashMap<Integer,HashSet<Character>> r = new HashMap<>();
        HashMap<Integer,HashSet<Character>> c = new HashMap<>();
        HashMap<String,HashSet<Character>> q = new HashMap<>();

        //fila
        for(int i=0; i<9; i++){
            //columna
            for(int j=0; j<9; j++){
                char letra = board[i][j];

                if (letra == '.') continue;
                
                String square = (i/3) + "," + (j/3);

                if(r.computeIfAbsent(i,k -> new HashSet<>()).contains(letra) ||
                c.computeIfAbsent(j,k -> new HashSet<>()).contains(letra) ||
                q.computeIfAbsent(square,k -> new HashSet<>()).contains(letra)){
                    return false;
                }

                r.get(i).add(letra);
                c.get(j).add(letra);
                q.get(square).add(letra);
            }
        }

        return true;
    }
}
