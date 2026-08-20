package DAY4.SESSION3;

import java.util.HashMap;
import java.util.Map;

public class WordFreaquencyAnalysis {
    public static void main(){

        String[] words={"apple","banana","Cherry","apple","banana","apple"};

        Map<String,Integer> freq = new HashMap<>();

        for(String word:words){
            freq.put(word,freq.getOrDefault(word,0)+1);
        }

        System.out.println(freq);
        int maxCount =0;
        String mostFreq=null;
        String unique = null;
        for(Map.Entry<String,Integer> entry:freq.entrySet()){

            if(entry.getValue() > maxCount){
                maxCount=entry.getValue();
                mostFreq = entry.getKey();
            }
            if(entry.getValue()==1){
                unique = entry.getKey();
            }
        }
        System.out.println(maxCount);
        System.out.println(mostFreq);
        System.out.println(unique);






    }
}
