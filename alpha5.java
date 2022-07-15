import java.util.*;

public class alpha5 {
    public static void main(String[] args){
        // Customer loan eligiblty

        Scanner myRecord = new Scanner(System.in);
        System.out.println(" Enter customer's monthly Income ");
    
       
        
        
        int creditWorthiness = myRecord.nextInt();

        if (creditWorthiness >= 250_000) {
            System.out.println(" The customer is Eligible ");
        }
        else{
            System.out.println(" The customer is not Eligible ");
        }
    }
    
}
