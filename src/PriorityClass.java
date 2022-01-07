import java.util.PriorityQueue;

public class PriorityClass {
    public static void main(String[] args){
        PriorityQueue<Integer> priorityOne = new PriorityQueue<>();
        for(int i=1; i<=5; i++){
            priorityOne.add(i*5);
        }
        System.out.println("PriorityQueue: "+ priorityOne);

        for(int j=0; j<5; j++){
            System.out.println("Peek of value: "+priorityOne.peek());
            priorityOne.remove();
        }

    }
}
