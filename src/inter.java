public interface inter {
    public void Details();
    public void features();
}
class car implements inter{
    public void Details(){
        System.out.println("ferrari");
        System.out.println("2.7Cr");
    }

    public void features(){
        System.out.println("Max Speed: " + 220);
        System.out.println("minimum speed is: "+10);
    }
}

class Main{
    public static void main(String[] args){
        car obj = new car();
        obj.Details();
        obj.features();
    }
}