import java.rmi.Naming;
import java.util.Scanner;


public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            Scanner scanner=new Scanner(System.in);

            //Using the reverse Service :
            System.out.println("Input for reverse :");
            String str1 = scanner.nextLine();
            System.out.println(service.reverse(str1));

            //Using the minchar Service :
            System.out.println("Input for minchar :");
            String str2 = scanner.nextLine();
            System.out.println(service.minchar(str2));

            //Using the casechanger Service :
            System.out.println("Input for casechanger :");
            String str3 = scanner.nextLine();
            System.out.println(service.casechanger(str3));

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
