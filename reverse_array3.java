public class reverse_array3 {
    public static void main(String[] args){
        int[] arr={6,7,9,23,45,76,87,12};
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end --;


        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}
