package kg.one.flat.Models.Enums;

public enum RentType {
    NONE (-1),
    DAILY (0),
    MOUNTHLY (1);

    private int type;

    RentType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
