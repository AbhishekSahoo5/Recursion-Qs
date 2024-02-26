
public class _04_powerOfab {
    public static int powerOfab(int a, int b)
    {
        if(b==0){
            return 1;
        }
        else if(b==1){
            return a;
        }
        return a*powerOfab(a, b-1);
    }
    public static void main(String[] args) {
        int a=5;
        int b=4;
        System.out.println(powerOfab(a, b));
    }
    
}
