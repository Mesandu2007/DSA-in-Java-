public class Smallest_Number {
    public static void main(String[] args){
        int[] arr={7,23,54,65,2,45,760};
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest Number: "+ smallest);
    }
}
