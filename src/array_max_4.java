import java.util.Arrays;

public class array_max_4 {
    public static void main(String[] args) {
        int[] arr= {1,2,33,4,55};
        System.out.println(max(arr));
        System.out.println(maxInRange(arr,1,3));

    }
    static int max(int[] arr){
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
    static int maxInRange(int[] arr ,int start, int end){
        int max=arr[start];

            if(arr.length==0)
            {return -1;}

            if(start>end){
                return -1;
            }
            if (arr==null){
                return -1;
            }
        for(int i=start;i<end;i++){
           if(arr[i]>max) {
               max=arr[i];

           }
           }

        return max;
    }
}
