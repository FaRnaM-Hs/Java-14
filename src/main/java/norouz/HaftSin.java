package norouz;

public class HaftSin {


    public String isHaftSin(String object) {
        return switch (object) {
            case "Sib", "Sir", "Serke", "Senjed", "Somagh", "Samanou", "Sabze" -> "Yes";
            case "Mahi", "Sekke", "Ayne", "Mive", "Shirini", "Saat", "Sham" -> {
                // Some code
                System.out.println("Maybe some objects are not present here.");
                // Some code
                yield "Can be";
            }
            default -> "No";
        };
    }
}
