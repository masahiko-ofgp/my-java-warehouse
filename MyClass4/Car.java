public class Car implements Action {
    
    @Override
    public void run() {
        System.out.println("Car is running.");
    }

    public void accelerate() {
        System.out.println("Speed Up!!!!");
    }
}
