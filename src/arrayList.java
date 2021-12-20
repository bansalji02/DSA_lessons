import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //adding the elements
        list.add(1);
        list.add(3);
        list.add(5 );
        list.add(8);

        //removing the element
        list.remove(2);

        //get an element
        list.get(1);

        //modify an element
        list.set(2,0);



        System.out.println(list);

    }
}
