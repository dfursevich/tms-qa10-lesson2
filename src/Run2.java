public class Run2 {
    public static void main(String[] args) {
        int sum = 0;
        int a = 0;

        while (a <= 10) {
            sum = sum + a;
            System.out.println("sum=" + sum + ", a=" + a);
            a = a + 1;
        }

        System.out.println("Sum=" + sum);
    }
}
