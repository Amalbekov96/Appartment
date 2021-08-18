package kg.one.flat.Models.Enums;

public enum CodeStatus {

    USED (0),
    NOT_USED (1),
    NEW (2);

    private int code;

    CodeStatus(int code) {
        this.code = code;
    }
}
