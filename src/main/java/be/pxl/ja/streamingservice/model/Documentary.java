package be.pxl.ja.streamingservice.model;

public class Documentary extends Movie{
    private String topic;


    //constr
    public Documentary(String title, Rating mtr) {
        super(title, mtr);
        setGenre(Genre.DOCUMENTARY);
    }

    //getters en setters
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    //methods
    @Override
    public void Play() {
        System.out.println("Playing " + this.getTopic());
    }

    @Override
    public void Pause() {
        System.out.println("Paused " + this.getTopic());
    }
}
