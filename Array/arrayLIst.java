import java.util.ArrayList;

//arraylist store object in  continuos form like linkedlist ,array were able to store primittive datatypes and object , arraylist stores object only
//arraylist get stored in heap
public class arrayLIst {
    void arrayList(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(9);
        System.out.println(list);

        list.get(3);
        list.add(2,8);
        list.remove(2);
        ArrayList<Integer> m = new ArrayList<>();
        m.addAll(list);
        System.out.println(m);
        int size = list.size();
        System.out.println(size);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
