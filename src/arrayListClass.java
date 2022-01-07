import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class arrayListClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<5; i++){
            arrayList.add(input.nextInt());
        }
        System.out.println(arrayList);
        System.out.println(arrayList.subList(1,3));
        arrayList.remove(1);
        System.out.println(arrayList);
        arrayList.set(2,34);
        System.out.println(arrayList);
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);
        ArrayList<String> arrayList1 = new ArrayList<>();
        for(int i=0; i<5; i++){
            arrayList1.add(input.next());
        }
        System.out.println(arrayList1);
        System.out.println(arrayList1.size());
        System.out.println(arrayList1.get(2));
        arrayList1.sort(Comparator.naturalOrder());
        System.out.println(arrayList1);
    }
}
