package enumerations;

public enum SeverityEnum {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    // If a variable isn't defined as final, then we can modify its value
    private final int levelCode;

    // Enum Fields: Mandatory constructor should be used for Enum
    private SeverityEnum(int levelCode){
        this.levelCode = levelCode;
    }

    // We can add methods to enum
    public int getLevelCode(){
        return this.levelCode;
    }
}
