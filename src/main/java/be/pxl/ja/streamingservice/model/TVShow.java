package be.pxl.ja.streamingservice.model;

public final class TVShow extends Content {

    //properties
    private int numberOfSeasons;


    //constructor
    public TVShow(String title, Rating maturityRating, int numberOfSeasons) {
        super(title, maturityRating);
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfSeasons(){
        return numberOfSeasons;
    }


}
