package kg.one.flat.Models.Enums;

public enum RequestStatus {
    USER_BLOCKED (0),
    USER_ENTERED_WRONG_PASS (1),
    USER_PUT_BLACK_LIST (2),
    USER_ACCESSED (3);

    private int code;

    RequestStatus(int code) {
        this.code = code;
    }
}
