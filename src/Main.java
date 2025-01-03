import enumerations.Level;
import enumerations.RGBColorEnum;
import enumerations.SeverityEnum;

public class Main {
    public static void main(String[] args) {
        RGBColorEnum red = RGBColorEnum.Red;
        System.out.println(red); // This will internally use toString to convert the enum to String
        System.out.println(red.toString());

        // If an Enums value needs to get the instance of Enum, we can use static method valueOf
        SeverityEnum severityEnum = SeverityEnum.valueOf("HIGH");
        System.out.println(severityEnum.getLevelCode()); // Adding methods to enum
        // Note: We can define complex function if we want in an enum

        // Using abstract methods in enum
        Level lowLevel = Level.LOW;
        System.out.println("Simple : " + lowLevel);
        System.out.println("Lowercase : " + lowLevel.asLowerCase());
        System.out.println("Uppercase : " + lowLevel.asUpperCase());


    }
}