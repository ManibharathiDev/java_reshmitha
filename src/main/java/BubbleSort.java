import java.util.ArrayList;

public class BubbleSort {

    public static void main(String[] args){
        /*ArrayList<Integer> a = new ArrayList<>();
        a.add(100);
        a.add(98);
        a.add(10);
        a.add(56);
        a.add(9);
        a.add(45);*/

        int[] a = {100,98,10,56,9,45};

        for(int i = 0; i < a.length;i++)
        {
            for(int j = i+1; j< a.length; j++){
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for(int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }

    }

}
