/**
 * Created by SHIKUN on 2016/7/27.
 */
public class Test {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();//StringBuffer是一个容器,还可以操作多个数据类型，长度可以变换，并可以转换成字符串。
        StringBuffer sb1 = sb.append(34);
        System.out.println(sb1.toString());
        sb.append("qq").append(1223);
        sb.insert(1, "win");
        System.out.println(sb.toString());

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);//基本数据类型的包装类的常用作用就是与字符串之间做转换

        Integer.toString(45);
        int num = Integer.parseInt("123");
        int num2 = Integer.parseInt("110", 2);
        Integer x=4;//x自动装箱 new Integer(4)
        x=x+2;//自动拆箱，在自动装箱  x.invalue()




    }
}
