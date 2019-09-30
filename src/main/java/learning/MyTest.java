package learning;

public class MyTest {

    public static void main(String[] args){
        Object o = new Object();
        Object o1 = new Object();
        int i = o.hashCode();
        int i1 = o1.hashCode();
        String haha = new String("HAHA");
        String haha1 = new String("HAHA");
        System.out.println(haha.hashCode());
        System.out.println(haha1.hashCode());
        System.out.println(haha.equals(haha1));
        System.out.println(haha==haha1);
    }
}
