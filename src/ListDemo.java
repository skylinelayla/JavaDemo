import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**List元素是有序的且可以重复，集合体系有索引。类似于数组的
 *set不能重复，无序的。
 * Created by SHIKUN on 2016/8/2.
 */
public class ListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("java01");
        al.add("java02");
        al.add("java03");

        System.out.println(al);
        al.add(1, "java09");
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.set(2, "java007");
        System.out.println(al);
        System.out.println(al.get(2));
        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }

        List sublist = al.subList(1, 2);
        System.out.println(sublist);

    }

    //列表迭代器





}
