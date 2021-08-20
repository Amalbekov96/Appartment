package kg.one.flat.Models.Enums;

public enum CodeStatus {

    NEW (0),
    CANCELLED (1),
    APPROVED (2),
    FAILED (3),
    NOT_USED (4);

    private int code;

    CodeStatus(int code) {
        this.code = code;
    }
}
