import java.util.Scanner;

public class alpha3 {

    public static void main(String[] args){

        Scanner myRecord = new Scanner(System.in);
        System.out.println(" Enter your Temperature ");
        int temperature = 20;
        int tempt = myRecord.nextInt();

        if(temperature < 20){
            System.out.println(" it is freezing ");
        }
        else if(temperature == 20){
            System.out.println(" It is a beautiful day ");
        }
        else{
            System.out.println(" It is a sunny day ");
        }

    }
}
