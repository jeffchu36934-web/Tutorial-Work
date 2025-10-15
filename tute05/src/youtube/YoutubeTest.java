package youtube;

public class YoutubeTest {
    public static void main(String[] args) {
        Producer prod = new Producer("Naomi");
        User u1 = new User("Brang");
        User u2 = new User("Pong");
        User u3 = new User("John");

        u2.subscribeTo(prod);
        u3.subscribeTo(prod);

        prod.addVideo("The Observer Pattern", 20);

        System.out.println("_______");

        u1.subscribeTo(prod);
        prod.addVideo("Quitting Youtube", 60);
        
    }
}
