package shixun.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ¼¯ºÏ {
    public static void main(String[] args) {
        Collection<String> movelist = new ArrayList<>();
        movelist.add("1");
        movelist.add("2");
        movelist.add("3");
        Iterator<String> iterator = movelist.iterator();
        while (iterator.hasNext()){
            String ele = iterator.next();
            System.out.println(ele);
        }
    }
}
