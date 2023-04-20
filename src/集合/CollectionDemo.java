package ����;

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
        //�ڼ���ĩβ���Ԫ�� conlog:a,b
        array.remove("a");
        //����ڼ�������a��ͬ��Ԫ�ء�
        System.out.println(array.contains("b"));
        //�жϼ������Ƿ��к�b��ͬ��Ԫ�� conlog��true
        System.out.println(array.isEmpty());
        //�жϱ��༯���Ƿ�Ϊ��
        System.out.println(array.size());
        //���ؼ���Ԫ�ظ���
        array.addAll(array1);
        //��array1����������Ԫ����ӵ�array������
        System.out.println(Arrays.toString(array.toArray()));
        System.out.println("------------------------------");
        //�ɱ��༯������Ԫ�ط���Ϊ����

        //����ר�õ�����
        Iterator<String>iterator = array.iterator();
        //hasNext()�ж��Ƿ�����һ��Ԫ�� nextָ������
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("------------------------------");
//        array.clear();
        //�����������Ԫ��
        for (String s : array) {
            System.out.println(s);
        }

    }
}
