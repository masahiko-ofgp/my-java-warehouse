public class MyClass_3_Main {
    public static void main(String[] args) {
        CDPlayer my_cd_player = new CDPlayer();
        DVDPlayer my_dvd_player = new DVDPlayer();

        CDPlayer empty_cd_player = new CDPlayer();
        DVDPlayer empty_dvd_player = new DVDPlayer();

        my_cd_player.set("Buena Vista Social Club");
        my_dvd_player.set("Forest Gump");

        my_cd_player.play();
        my_dvd_player.play();

        empty_cd_player.play();
        empty_dvd_player.play();

        my_cd_player.stop();
        my_dvd_player.stop();

        empty_cd_player.stop();
        empty_dvd_player.stop();
    }
}
