package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram <T> {

    //Atributos
    private final T[] data;
    public Histogram(T[] data) {
        this.data = data;
    }
    public T[] getData() {
        return data;
    }
    
    public Map<T, Integer> getHistogram() {
        Map<T, Integer> histogram = new HashMap<>();
        for (T key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return histogram;
    }
    
}
