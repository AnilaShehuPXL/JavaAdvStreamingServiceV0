package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS(0), OLDER_KIDS(7), TEENS(12), MATURE(18);

    private int minimumAge;

    Rating(int minimumAge) {
        this.minimumAge = minimumAge;
    }
}
