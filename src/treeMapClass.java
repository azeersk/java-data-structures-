import java.util.TreeMap;

public class treeMapClass {
    public static void main(String[] args){
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Z",26);
        treeMap.put("Y",25);
        treeMap.put("X",24);
        treeMap.put("W",23);
        treeMap.put("U",21);

        System.out.println("TreeMap: "+ treeMap);
        System.out.println("Size of Tree map: "+treeMap.size());
        System.out.println("First key: "+treeMap.firstKey());
        System.out.println("Last key: "+treeMap.lastKey());

        treeMap.replace("V",22);
        System.out.println("Replace Wrong value: "+treeMap);
        System.out.println("Sub Map is: "+treeMap.subMap("W","Y"));
        System.out.println("Enter Set is: "+ treeMap.entrySet());
        treeMap.clear();
        System.out.println("Empty Map: "+ treeMap);

    }
}
