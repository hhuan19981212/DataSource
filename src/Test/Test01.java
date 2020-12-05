package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * @author hhuan_YY
 * @create 2020-11-24-14:27
 */
public class Test01 {
    public static void main(String[] args) {


        int x6 = 1;
        int y6 = 4;
        String str6 = y6 + "";
        System.err.println(str6);
        System.err.println(x6 + str6);

        ArrayList<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        System.err.println(list);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(null);
        linkedHashSet.add("hhuan");
        System.err.println("linedHas:"+linkedHashSet);

        Map<String, Integer> map = new HashMap<>();
        map.put(null, null);
        map.put(null, null);
        map.put("age", null);
        System.err.println(map);

        int x = 10;
        if (x > 100) {
            System.err.println();
            System.err.println();
            System.err.println();
            System.err.println();
            System.err.println();
            System.err.println();
        }
        x = 500;

    }
}
