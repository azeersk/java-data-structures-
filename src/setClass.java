import java.util.HashSet;
import java.util.Set;

public class setClass {
    public static void main(String[] args){
        Set<Integer> setOne = new HashSet<>();
        for(int s=1; s<6; s++){
            setOne.add(s*5);
        }
        System.out.println("Set is: "+ setOne);
        System.out.println("Set size is: "+ setOne.size() );
        System.out.println("Set is Empty: "+ setOne.isEmpty());

    }
}
