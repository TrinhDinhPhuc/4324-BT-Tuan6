
import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.NotBoundException; 
 
public class CalculatorClient { 
 
    public static void main(String[] args) { 
        try { 
             long[] arr={1,-5,3,6,15,24,33,19,17};
            Calculator c = (Calculator)
                           Naming.lookup(
                 "rmi://localhost/CalculatorService"); 
            System.out.println("Tru giua 4 va 3");
            System.out.println( c.sub(4, 3) ); 
            System.out.println("Cong giua 4 va 5");
            System.out.println( c.add(4, 5) ); 
            System.out.println("Nhan giua 3 va 6");
            System.out.println( c.mul(3, 6) ); 
            System.out.println("Chia giua 9 va 3");
            System.out.println( c.div(9, 3) );
            System.out.println("Max giua 6 va 9");
            System.out.println( c.max(6, 9) ); 
            System.out.println("Min giua 9 va 6");
            System.out.println( c.min(9, 6) );   
            System.out.println("Min trong day {1,-5,3,6,15,24,33,19,17} la: ");
            System.out.println(c.min1(arr));
            System.out.println("Max trong day {1,-5,3,6,15,24,33,19,17} la: ");
            System.out.println(c.max1(arr));       
            System.out.println("USCLN giua 15 va 40 la");
            System.out.println( c.USCLN(15, 40) ); 
            System.out.println("BSCNN giua 15 va 40 la");
            System.out.println( c.BSCNN(15, 40) ); 
            
        }
        
        
        catch (MalformedURLException murle) { 
            System.out.println(); 
            System.out.println(
              "MalformedURLException"); 
            System.out.println(murle); 
        } 
        catch (RemoteException re) { 
            System.out.println(); 
            System.out.println(
                        "RemoteException"); 
            System.out.println(re); 
        } 
        catch (NotBoundException nbe) { 
            System.out.println(); 
            System.out.println(
                       "NotBoundException"); 
            System.out.println(nbe); 
        } 
        catch (
            java.lang.ArithmeticException
                                      ae) { 
            System.out.println(); 
            System.out.println(
             "java.lang.ArithmeticException"); 
            System.out.println(ae); 
        } 
    } 
} 
