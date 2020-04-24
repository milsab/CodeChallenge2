package Design;

import java.util.LinkedHashMap;

public class LRU {
    int capacity;
    LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

    public LRU(int c){
        capacity = c;
    }

    void put(int key, int val){
        if(map.get(key) != null)
            map.remove(key);
        if(map.size() >= capacity)
            map.remove(map.keySet().iterator().next());

        map.put(key, val);

    }

    int get(int key){
        if(map.get(key) == null)
            return -1;
        int val = map.get(key);
        map.remove(key);
        map.put(key, val);
        return val;
    }
}
