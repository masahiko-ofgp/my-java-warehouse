public class CDPlayer extends Device {

    @Override
    public void play() {
        if (this.software == "Empty") {
            System.out.println("Couldn't play. CDPlayer is empty.");
        } else {
            System.out.println("Play: " + this.software);
        }
    }

    @Override
    public void stop() {
        if (this.software == "Empty") {
            System.out.println("Please set CD.");
        } else {
            System.out.println("Stop CD");
        }
    }

    @Override
    public void set(String software) {
        this.software = software;
    }
}
