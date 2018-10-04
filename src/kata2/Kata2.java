package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer []  data = {1,2,5,4,6,2,1,3,4,5,6,7,8,3,4};
        
        Histogram histo = new Histogram (data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }          
    }   
}
