public class hashtable{
    private HashNode bucket[];
    private int noOfBucket;
    private int size;
    public hashtable(int capacity){
        this.noOfBucket = capacity;
        bucket = new HashNode[capacity];
        this.size = 0;
    }
private class HashNode{
    private Integer key;
    private String value;
    private HashNode next;
    public HashNode(Integer key,String value){
        this.key = key;
        this.value = value;
    }

    public int size(){
        return size;
    }
    public  boolean isEmpty(){
        return size==0;
    }



}
}