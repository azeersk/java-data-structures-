import java.util.HashMap;

public class hashMapClass {
    public static void main(String[] args){
        HashMap<String,String> hashMapOne = new HashMap<>();
        hashMapOne.put("name","azeer");
        hashMapOne.put("age","20");
        hashMapOne.put("id","11805521");
        hashMapOne.put("rollNo","23");
        hashMapOne.put("phoneNo","938158");

        System.out.println("HashMap: "+ hashMapOne);
        hashMapOne.replace("name","Saheb");
        System.out.println("Replace of: "+hashMapOne);
        System.out.println("Is Empty: "+hashMapOne.isEmpty());
        System.out.println("Size of HashMap: "+hashMapOne.size());
        System.out.println("Hash Code: "+hashMapOne.hashCode());
        System.out.println("Id No: "+hashMapOne.get("id"));
        System.out.println("Clone of HashMap: "+hashMapOne.clone());
    }
}
