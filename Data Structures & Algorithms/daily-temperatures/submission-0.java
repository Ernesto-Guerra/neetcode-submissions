class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int dias;

        for(int i = 0; i<temperatures.length; i++){
            int t = temperatures[i];
            dias = 0;
            for(int j = i; j<temperatures.length; j++){
                if(temperatures[j]>t){
                    break;
                } else{
                    dias++;
                    if(j==temperatures.length-1){
                        dias = 0;
                    }
                }
            }

            temperatures[i] = dias;
        }

        return temperatures;
    }
}
