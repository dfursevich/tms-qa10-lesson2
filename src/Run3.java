public class Run3 {
    public static void main(String[] args) {
        int count = 1;
        int time = 3;

        System.out.println("time=" + 0 + ", count=" + 1);

        while (time <= 24) {
            count = count * 2;

            System.out.println("time=" + time + ", count=" + count);

            time = time + 3;
        }
    }
}
