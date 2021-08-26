package kg.one.flat.Models.Enums.Search;

public enum FloorCount {
    NONE (0),
    ONE (1),
    TWO (2),
    THREE (3),
    FOUR (4),
    FIVE (5),
    SIX (6),
    SEVEN (7),
    EIGHT (8),
    NINE (9),
    TEN (10);

    private int code;

    FloorCount(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
