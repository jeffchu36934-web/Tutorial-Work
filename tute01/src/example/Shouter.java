package example;

public class Shouter {
    private String message;

    public Shouter(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toUpperCase() {
        return message.toUpperCase();
    }

    

    public static void main(String[] args) {
        Shouter shout = new Shouter("hi");

        System.out.println(shout.toUpperCase());
    }
}    