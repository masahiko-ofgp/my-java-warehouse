public class Color {
    public static void main(String[] args) {
        String red = "\u001b[00;31m";
        String end = "\u001b[00m";

        System.out.println(
                String.format(
                    "%sHello, world!!%s",
                    red,
                    end)
                );
    }
}
