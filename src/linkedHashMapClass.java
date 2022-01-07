import java.util.LinkedHashMap;

public class linkedHashMapClass {
    public static void main(String[] args){

        LinkedHashMap<String,Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("a",1);
        linkedMap.put("b",2);
        linkedMap.put("c",3);
        linkedMap.put("d",4);
        linkedMap.put("e",5);
        System.out.println("LinkedHashMap: "+ linkedMap);

        LinkedHashMap<String,Integer> linkedMapOne = new LinkedHashMap<>();
        for(int i=1; i<=5; i++){
            linkedMapOne.put("count"+i,i*3);
        }

        System.out.println();
        System.out.println("LinkedMap One: "+ linkedMapOne);
        linkedMapOne.putAll(linkedMap);

        System.out.println();
        System.out.println("LinkedHashMap One: "+linkedMapOne);
    }
}
