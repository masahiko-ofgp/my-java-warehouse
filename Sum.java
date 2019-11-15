public class Sum {
    public static void main(String[] args) {
        int limit = Integer.parseInt(args[0]);
        int sum = 0;

        for (int count = 1; count <= limit; count = count + 1) {
            sum = sum + count;
        }
        System.out.println(sum);
    }
}
