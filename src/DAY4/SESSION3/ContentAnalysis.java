package DAY4.SESSION3;

import java.util.HashMap;
import java.util.Map;

public class ContentAnalysis {
    public static void main(){

        String words="this is a test. this test is only a test";

        Map<String,Integer> freq = new HashMap<>();

        for(String word:words.split("\s+")){
            freq.put(word,freq.getOrDefault(word,0)+1);
        }

        System.out.println(freq);

    }
}
