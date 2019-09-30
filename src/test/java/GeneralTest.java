import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneralTest {
    public static void main(String[] args){
        List[] lists = new List[1];
        List list = new ArrayList<Integer>();
        list.add(3);
        lists[0] = list;
        for (List list1: lists
                ) {
            Object o = list1.get(0);
            System.out.println(o);
        }
    }
   

}
