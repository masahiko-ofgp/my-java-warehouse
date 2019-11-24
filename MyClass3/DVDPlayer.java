public class DVDPlayer extends Device {

    @Override
    public void play() {
        if (this.software == "Empty") {
            System.out.println("Couldn't play. DVDPlayer is empty.");
        } else {
            System.out.println("Play: " + this.software);
        }
    }

    @Override
    public void stop() {
        if (this.software == "Empty") {
            System.out.println("Please set DVD.");
        } else {
            System.out.println("Stop DVD");
        }
    }

    @Override
    public void set(String software) {
        this.software = software;
    }
}
