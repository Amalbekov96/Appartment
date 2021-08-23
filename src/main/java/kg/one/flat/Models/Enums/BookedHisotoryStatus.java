package kg.one.flat.Models.Enums;

public enum BookedHisotoryStatus {
    BOOKED (0),
    NOT_BOOKED (1),
    CANCELLED (2);


    private int code;

    BookedHisotoryStatus(int code) {
        this.code = code;
    }
}
