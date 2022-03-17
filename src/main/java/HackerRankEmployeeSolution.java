import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class HackerRankEmployeeSolution {

    public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int X) {
           Map<String, List<String>> map= new TreeMap<>();
           List<String> names = new ArrayList<>();
           if (sortOrder == 1) {
               map= new TreeMap<>(Collections.reverseOrder());
           }
           for(int i =0; i < items.size(); i++) {
               List<String> listItem = items.get(i);
               map.put(listItem.get(sortParameter), listItem);
           }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            names.add(entry.getValue().get(0));
            if (names.size() == X) {
                break;
            }
        }
        return names;
    }
}
