package norouz;

public class HaftSin {


    public String isHaftSin(String object) {
        String result;

        switch (object) {
            case "Sib":
            case "Sir":
            case "Serke":
            case "Senjed":
            case "Somagh":
            case "Samanou":
            case "Sabze":
                result = "Yes";
                break;
            case "Mahi":
            case "Sekke":
            case "Ayne":
            case "Mive":
            case "Shirini":
            case "Saat":
            case "Sham":
                result = "Can be";
                break;
            default:
                result = "No";
        }
        
        return result;
    }
}
