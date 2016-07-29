import java.util.ArrayList;

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
