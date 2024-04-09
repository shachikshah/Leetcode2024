public class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1){
            arr[0] = -1;
            return arr;
        }
        int n=arr.length;
        int temp=arr[n-1];
        arr[n-1]=-1;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]>temp){
                int demo=arr[i];
                arr[i]=temp;
                temp=demo;
            }
            else{
                arr[i]=temp;
            }
        }
        return arr;
    }
}
