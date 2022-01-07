import java.util.HashSet;

public class hashSetClass {
    public static void main(String[] args){

        HashSet<Integer> hashInt = new HashSet<>();
        for(int h=1; h<7; h++){
            hashInt.add(h*2);
        }
        System.out.println("Hash Set: "+hashInt);
        System.out.println("Remove from HashSet: "+ hashInt.remove(2));
        System.out.println("Clone of HashSet: "+hashInt.clone());

        HashSet<Integer> hashSetOne = new HashSet<>();
        hashSetOne.add(6);
        hashSetOne.add(33);
        hashSetOne.add(10);
        hashSetOne.add(55);
        hashSetOne.add(66);

        System.out.println("Second HashSet: "+ hashSetOne);
        hashInt.addAll(hashSetOne);
        System.out.println("Union of Two sets: "+ hashInt);
        hashInt.retainAll(hashSetOne);
        System.out.println("Intersection of two sets: "+ hashInt);
        hashInt.containsAll(hashSetOne);
        System.out.println("Subset of: "+ hashInt);
        hashInt.removeAll(hashSetOne);
        System.out.println("remove the element: "+ hashInt);

    }
}
