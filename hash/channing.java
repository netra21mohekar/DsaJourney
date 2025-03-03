import java.util.ArrayList;
import java.util.LinkedList;

class channing{
    ArrayList<LinkedList<Integer>> table;
    int BUCKET;
    public channing(int b){
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i = 0;i<b;i++){
            table.add(new LinkedList<Integer>());
        }
    }
    public void insert(int key){
        int k = key%BUCKET;
        table.get(k).add(key);
    }
    public void delete(int key){
        int k = key%BUCKET;
        table.get(k).remove(k);
    }
    public static void main(String[]args){
        channing c = new channing(5);
        c.insert(34);
        c.insert(8);
        c.insert(12);
        c.insert(56);
        c.insert(90);
    }

}