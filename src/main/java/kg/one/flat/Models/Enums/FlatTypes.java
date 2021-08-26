package kg.one.flat.Models.Enums;

public enum FlatTypes {
    NONE (-1),
 STO4 (0),
 STO5 (1),
 STO6 (2),
 STALIN(3),
 KHRUSHCHEV(4),
    OTHER (5);

 private int seria;

    FlatTypes(int seria) {
        this.seria = seria;
    }

    public int getSeria() {
        return seria;
    }
}
