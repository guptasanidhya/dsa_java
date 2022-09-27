/* for not fixed column size*/
public class array_col_not_fixed_1 {
    public static void main(String[] args) {

        //valid
//        int[][] array=new int[3][2];
//        int[][] array1=new int[3][];

        int[][] arr={{1,2,3,4},
                {5,6},
                {7,8,9}
        };


        for (int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
