package 集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> array = new ArrayList<>();
        Collection<String> array1 = new ArrayList<>();
        array.add("a");
        array.add("b");
        array1.add("a");
        array1.add("b");
        //在集合末尾添加元素 conlog:a,b
        array.remove("a");
        //清楚在集合中与a相同的元素。
        System.out.println(array.contains("b"));
        //判断集合中是否有和b相同的元素 conlog：true
        System.out.println(array.isEmpty());
        //判断本类集合是否为空
        System.out.println(array.size());
        //返回集合元素个数
        array.addAll(array1);
        //吧array1集合中所有元素添加到array集合中
        System.out.println(Arrays.toString(array.toArray()));
        System.out.println("------------------------------");
        //吧本类集合所有元素返回为数组

        //集合专用迭代器
        Iterator<String>iterator = array.iterator();
        //hasNext()判断是否有下一个元素 next指针下移
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("------------------------------");
//        array.clear();
        //清楚本类所有元素
        for (String s : array) {
            System.out.println(s);
        }

    }
}
