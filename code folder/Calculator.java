public interface Calculator 
          extends java.rmi.Remote { 
    public long add(long a, long b) 
        throws java.rmi.RemoteException; 
 
    public long sub(long a, long b) 
        throws java.rmi.RemoteException; 
 
    public long mul(long a, long b) 
        throws java.rmi.RemoteException; 
 
    public long div(long a, long b) 
        throws java.rmi.RemoteException; 
    
    public long max(long a, long b) 
        throws java.rmi.RemoteException;  
    
    public long min(long a, long b) 
        throws java.rmi.RemoteException;

    public long max1(long[] a) 
        throws java.rmi.RemoteException;    
    
    public long min1(long[] a) 
        throws java.rmi.RemoteException;
    
    public int USCLN(int a, int b)
        throws java.rmi.RemoteException;
    
    public int BSCNN(int a, int b) 
        throws java.rmi.RemoteException;
} 
