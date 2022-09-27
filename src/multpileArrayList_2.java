import java.util.*;

public class multpileArrayList_2{
    public static void main(String[] args) {
//        java.util.ArrayList<java.util.ArrayList<Integer>> list= new ArrayList<>();
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();

        for (int i =0;i<3 ; i++){
            list.add(new ArrayList<>());
        }
    Scanner sc= new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
