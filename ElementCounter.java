import java.util.HashMap;
import java.util.Map;

public class ElementCounter {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> result = countElements(array);
        System.out.println(result);
    }

    public static Map<Integer, Integer> countElements(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int element : array) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }

        return countMap;
    }
}
