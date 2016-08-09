import java.util.*;

/**List元素是有序的且可以重复，集合体系有索引。类似于数组的 ArrayList LinkList Vector
 *set不能重复，无序的。
 * Created by SHIKUN on 2016/8/2.
 */
public class ListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("java01");
        al.add("java02");
        al.add("java03");

//        System.out.println(al);
//        al.add(1, "java09");
//        System.out.println(al);
//        al.remove(2);
//        System.out.println(al);
//        al.set(2, "java007");
//        System.out.println(al);
//        System.out.println(al.get(2));
//        while (it.hasNext()) {
//
//            Object obj = new Object();
//            if (obj.equals("java01")) {
//                al.add("java008");
//
//            }
//            System.out.print("obj=" + obj);
//        }

//        List sublist = al.subList(1, 2);
//        System.out.println(sublist);


        ListIterator itr = al.listIterator();  //列表迭代器,取元素的同时又可以添加元素。ListInterator 是 Iterator的子接口，在迭代时可以操作列表，对列表进行增删查改。

        while (itr.hasNext()) {
            Object obj = itr.next();
            if (obj.equals("java01")) {
                itr.add("java009");
            }
        }

        System.out.println(al);

        while (itr.hasPrevious()) {//逆向遍历
            System.out.println("prev " + itr.previous());
        }


        Vector vector = new Vector();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);

        System.out.println(vector);
        Enumeration en = vector.elements(); //枚举是vector特有的取出方式，与迭代相同，但功能少
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("java01");//加在头部
        linkedList.addFirst("java02");
        linkedList.addFirst("java03");
        linkedList.addFirst("java04");
        linkedList.addLast("java05");

        System.out.println(linkedList);



    }








}
