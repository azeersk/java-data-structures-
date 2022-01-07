import java.util.*;

public class queueClass {
    public static void main(String[] args){
        Queue<Integer> queuePri = new PriorityQueue<>();
        for(int p=0; p<5; p++){
            queuePri.add(p);
        }
        System.out.println("PriorityQueue: "+queuePri);

        Queue<Integer> queueDe = new ArrayDeque<>();
        for(int A=5; A<10; A++){
            queueDe.add(A);
        }
        System.out.println("ArrayDequeue: "+queueDe);
        Queue<Integer> queueLink = new LinkedList<>();
        for(int L=10; L<15; L++){
            queueLink.add(L);
        }
        System.out.println("LinkedList: "+queueLink);
    }
}
