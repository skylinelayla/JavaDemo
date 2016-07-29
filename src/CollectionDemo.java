import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by SHIKUN on 2016/7/29.
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //ArrayList 是collection接口的子类
        ArrayList al = new ArrayList();
        al.add("java1");
        al.add("java2");
        al.add("java3");
        al.add("java4");//集合中存储都是对象的引用，即地址

        ArrayList al2 = new ArrayList();
        al2.add("java1");
        al2.add("java2");
        al2.add("java5");
        al2.add("java3");

        Iterator it= al2.iterator();//返回一个Iterator接口,获取迭代器，去除元素，何为迭代器，就是取出元素的方式
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for(Iterator ii=al2.iterator();ii.hasNext();) {
            System.out.println(ii.next());
        }
        System.out.println(al.retainAll(al2));//仅保留了交集，即al中和al2相同的元素。
        System.out.println(al.removeAll(al2));//去掉al中al2相同的元素。

        System.out.println(al);
        System.out.println(al.size());
        al.remove(1);
        System.out.println(al);
        System.out.println(al.contains("java3"));
        System.out.println(al.isEmpty());
    }
}
