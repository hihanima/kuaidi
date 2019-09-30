package learning;

public class Bar {
    int a =1;
    static int b =2;
    public  int sum(int c){
        return a+b+c;
    }

    public static void main(String[] args){
        Bar bar = new Bar();
        bar.sum(3);
    }



}
