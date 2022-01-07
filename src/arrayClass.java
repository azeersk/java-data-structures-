import java.util.Arrays;
import java.util.Scanner;

public class arrayClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for(int i=0; i<5; i++){
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));

        String[] names = {"Apple","Banana","Greps","Orange"};
        for(int j=0; j<4; j++){
            String fruit = names[j];
            System.out.println(fruit);
        }

    }
}
