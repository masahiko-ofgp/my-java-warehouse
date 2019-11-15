public class Hanoi {
    public static void main(String[] args) {
        char a = 'A', b = 'B', c = 'C';
        int n = 3;
        hanoi(n, a, b, c);
    }
    private static void hanoi(int n, char a, char b, char c) {
        if (n > 0) {
            hanoi(n - 1, a, c, b);
            System.out.println(a + "=>" + c);
            hanoi(n - 1, b, a, c);
        }
    }
}
