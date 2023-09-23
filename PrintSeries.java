public class PrintSeries {
    public static void printSeries(int n){
        if(n==9){
            System.out.println(0);
            return;
        }
        printSeries(n-1);
        if(n%10==0)
        System.out.println(n/10);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=100;
        printSeries(n-1);
    }
}
