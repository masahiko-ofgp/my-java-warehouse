public abstract class Device {
    public String software = "Empty";

    abstract void set(String software);
    abstract void play();
    abstract void stop();
}
