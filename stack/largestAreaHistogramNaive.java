public class largestAreaHistogramNaive {

    public void area(int arr[]){
        int res = 0;
        for(int i = 0;i<arr.length;i++){
            int curr = arr[i];
            for(int j = i-1;j>=0;j--){
                if(arr[j]>=arr[i]){
                    curr+=arr[i];
                }
                else{
                    break;
                }
            }
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]>=arr[i]){
                    curr+=arr[i];
                }
                else{
                    break;
                }
            }
            res = Math.max(res,curr);
        }
        System.out.println("The largest Area is "+ res);
    }

    public static void main(String[] args) {
        int arr[] = {2,1,4,6,7,8,9};
        largestAreaHistogramNaive l = new largestAreaHistogramNaive();
        l.area(arr);
    }
}
