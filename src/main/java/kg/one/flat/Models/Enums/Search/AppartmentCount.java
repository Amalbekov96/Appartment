package kg.one.flat.Models.Enums.Search;

public enum AppartmentCount {
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
    TEN (10),
    ELEVEN (11),
    TWELVE (12);

    AppartmentCount(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    private int code;
}
