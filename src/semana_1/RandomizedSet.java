package semana_1;

import java.util.*;

public class RandomizedSet {

    List<Integer> lista;
    Map<Integer, Integer> map;
    Random random;

    public RandomizedSet() {
        lista = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, lista.size());
        lista.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.remove(val);
        int ultimo = lista.getLast();
        lista.set(index, ultimo);
        map.put(ultimo, index);
        lista.removeLast();
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return lista.get(random.nextInt(lista.size()));
    }
}
