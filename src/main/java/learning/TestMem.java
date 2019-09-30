package learning;

public class TestMem {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = s1+s2;
        String s5 = s4+"fff";
        System.out.println(System.identityHashCode(s5));
        s5 = s5+"hh";
        System.out.println(System.identityHashCode(s5));
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.hashCode());
        sb.append("world");
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.hashCode());

        System.out.println(s3==s4);
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
        System.out.println(System.identityHashCode(s5));

    }
}
