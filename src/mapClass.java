import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapClass {
    public static void main(String[] args){
        Map<String, Integer> mapHash = new HashMap<>();
        mapHash.put("count",1);
        mapHash.put("id", 11805521);
        mapHash.put("phone",938158);
        mapHash.put("rollNo",56);
        System.out.println("Hash map : "+ mapHash);
        System.out.println();

        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        for(int i=1; i<5; i++){
            linkedMap.put(("count"+i),i*5);
        }
        System.out.println("Linked map: "+linkedMap);

        Map<String, Integer> treeMap = new TreeMap<>();
        for(int j=5; j<10; j++){
            treeMap.put("count"+j,j*7);
        }
        System.out.println();
        System.out.println("Tree map: "+treeMap);

    }
}
