public abstract class Device {
    protected String software = "Empty";

    abstract void set(String software);
    abstract void play();
    abstract void stop();
}
