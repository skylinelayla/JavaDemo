import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by SHIKUN on 2016/8/3.
 */
public class SetDemo {
    public static void main(String[] args) {
        //SET集合元素无序，不能重复 HasSet TreeSet 常见子类
        /*
        HasSet的数据结构是hash表，保证元素唯一性是通过hashcode和equals方法进行的，若code值相同，才会判断equals，若code不同，则不会判断equals
         */
        HashSet hs = new HashSet();
        hs.add("java01");
        System.out.println(hs.add("java01"));//不可重复
        hs.add("java02");
        hs.add("java03");
        hs.add("java04");
        Iterator it = hs.iterator();//取出只有迭代器方法
        while (it.hasNext()) {
            System.out.println(it.next());//无序的
        }
        SetDemo demo1 = new SetDemo();
//        System.out.println(demo1.toString().hashCode());//打印出的是hash值


        HashSet hss = new HashSet();
        hss.add(new Person("ai", "11"));
        hss.add(new Person("bi", "11"));
        hss.add(new Person("ci", "11"));
        hss.add(new Person("di", "11"));
        Iterator itt = hss.iterator();
        while (itt.hasNext()) {

            Person p = (Person) itt.next();
            System.out.println("name: " + p.getName() + " age: " + p.getAge());
        }

    }
}
class Person{
    private  String name;
    private  String age;

    public Person(String name, String age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getAge() {
        return this.age;
    }




}