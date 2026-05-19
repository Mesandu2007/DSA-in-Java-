public class Second_Largest_Number2 {
    public static void main(String[] args){
        int[] arr={45,67,32,89,56,35,76};
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]>second_largest && arr[i] != largest){
                second_largest=arr[i];
            }
        }

        System.out.println("Second Largest is: "+second_largest);



    }
}
