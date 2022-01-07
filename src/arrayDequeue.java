import java.util.ArrayDeque;

public class arrayDequeue {
    public static void main(String[] args){
        ArrayDeque<Integer> arrayDe = new ArrayDeque<>();
        for(int a=1; a<=6; a++){
            arrayDe.add(a*5);
        }

        System.out.println("ArrayDequeue: "+arrayDe);
        System.out.println("get first: "+arrayDe.getFirst());
        System.out.println("get last: "+arrayDe.getLast());
        System.out.println("size of the ArrayDequeue: "+arrayDe.size());
        System.out.println("element: "+arrayDe.element());

        for(int Ad=0; Ad<4; Ad++){
            System.out.println(arrayDe.peek());
            arrayDe.remove();
        }
        System.out.println("Queue is Empty: "+arrayDe.isEmpty());
        System.out.println("Queue poll first of: "+arrayDe.pollLast());
        System.out.println("Queue poll last of: "+arrayDe.pollFirst());
        System.out.println("Queue: "+arrayDe);
        ArrayDeque<Integer> arrayDequeOne = new ArrayDeque<>();
        for(int j=1; j<5; j++) {
            arrayDequeOne.add(j * 4);
        }

        arrayDe.addAll(arrayDequeOne);
        System.out.println(arrayDe);
    }
}
