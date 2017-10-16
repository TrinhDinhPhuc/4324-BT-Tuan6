

 
public class CalculatorImpl 
    extends 
      java.rmi.server.UnicastRemoteObject 
    implements Calculator { 
 
    // Implementations must have an 
    //explicit constructor 
    // in order to declare the 
    //RemoteException exception 
    public CalculatorImpl() 
        throws java.rmi.RemoteException { 
        super(); 
    } 
 
    public long add(long a, long b) 
        throws java.rmi.RemoteException { 
        return a + b; 
    } 
 
    public long sub(long a, long b) 
        throws java.rmi.RemoteException { 
        return a - b; 
    } 
 
    public long mul(long a, long b) 
        throws java.rmi.RemoteException { 
        return a * b; 
    } 
 
    public long div(long a, long b) 
        throws java.rmi.RemoteException { 
        return a / b; 
    } 
    public long max(long a, long b) 
        throws java.rmi.RemoteException { 
        long max=0;
        if (a > b ) {
            max = a;
        } else if (a < b) {
            max = b;
        }
          else if (a == b) {
            max = -1;
        }
        return max;
    }     
    public long min(long a, long b) 
        throws java.rmi.RemoteException { 
        long min=0;
        if (a < b ) {
            min = a;
        } else if (a > b) {
            min = b;
        }
          else if (a == b) {
            min = -1;
        }
        return min;
    } 
    
    public long min1(long[] arr) 
        throws java.rmi.RemoteException { 
        long min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
    return min;
    } 
        public long max1(long[] arr) 
        throws java.rmi.RemoteException { 
        long max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
    return max;
    } 
        
    public int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }

    public int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
} 
