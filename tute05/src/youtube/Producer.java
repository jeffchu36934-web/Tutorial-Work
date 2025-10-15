package youtube;

import java.util.ArrayList;
import java.util.List;

public class Producer {
    private String name;
    private List<Video> videos = new ArrayList<Video>();
    private List<User> subscribers = new ArrayList<User>();

    public Producer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void addSubscriber(User user) {
        subscribers.add(user);
    }

    public void removeSubscriber(User user) {
        subscribers.remove(user);
    }

    public void addVideo(String name, int length) {
        Video video = new Video(name, length, this);
        videos.add(video);

        for (User subscriber : subscribers) {
            subscriber.alertNewVideo(video);
        }
    }
}
