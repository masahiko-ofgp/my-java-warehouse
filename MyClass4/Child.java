public class Child implements Action {

    @Override
    public void run() {
        System.out.println("Child is running.");
    }

    public void cry() {
        System.out.println("Child is crying.");
    }
}
