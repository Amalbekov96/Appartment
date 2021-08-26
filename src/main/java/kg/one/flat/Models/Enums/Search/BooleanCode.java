package kg.one.flat.Models.Enums.Search;

public enum BooleanCode {
    NONE (-1),
    TRUE (1),
    FLASE (0);

    private int code;

    BooleanCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
