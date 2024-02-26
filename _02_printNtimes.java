
public class _02_printNtimes {
    
    public static void printHello(int n)
    {
        if(n==0){
            return;
        }
        System.out.println("Hello");
        printHello(n-1);
    }
    public static void main(String[] args) {
        printHello(5);
    }

}
    

