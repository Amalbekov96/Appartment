package kg.one.flat.Models.Enums;

public enum RentType {
    DAILY (0),
    MOUNTHLY (1);

    private int type;

    RentType(int type) {
        this.type = type;
    }
}
