import java.util.LinkedHashSet;
import java.util.LinkedList;

public class linkedClass {
    public static void main(String[] args){
        LinkedList linkedOne = new LinkedList<>();
        linkedOne.add("azeer");
        linkedOne.add("saheb");
        linkedOne.add("shaik");
        linkedOne.add(11805521);
        linkedOne.add(98);
        System.out.println("LinkedList: "+linkedOne);
        System.out.println();

        for(int L=0; L<5; L++){
            System.out.println(linkedOne.get(L));
        }

        linkedOne.removeLast();
        linkedOne.removeFirst();
        linkedOne.addFirst("azeersk");
        linkedOne.addLast(1180);
        System.out.println();
        System.out.println(linkedOne);
        System.out.println();
        System.out.println("Index of: "+linkedOne.indexOf(11805521));
        LinkedList<Integer> linkedListOf = new LinkedList<>();

        for(int ll=2; ll<5; ll++){
            linkedListOf.add(ll*5);
        }

        System.out.println(linkedListOf);
        System.out.println();
        linkedOne.addAll(linkedListOf);
        System.out.println(linkedOne);
    }
}
