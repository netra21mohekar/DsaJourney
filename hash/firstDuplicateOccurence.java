import java.util.HashMap;

public class firstDuplicateOccurence {
    public int duplicate(int array[]){
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int arr : array){
            h.put(arr,h.getOrDefault(arr,0)+1);
        }
        for(int i = 0;i<array.length;i++){
           if(h.get(array[i])>1){
               return i+1;
           }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,5,7};
        firstDuplicateOccurence f = new firstDuplicateOccurence();
        int n = f.duplicate(arr);
        System.out.println(n);
    }
}
