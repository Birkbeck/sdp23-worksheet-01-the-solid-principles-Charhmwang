public class Greeter {

    private Personality personality;

    public Greeter() { this(() -> "Hello."); } //?

    public Greeter(Personality personality) {
        this.personality = personality;
    }

//    public String greet() {
////        if (this.formality == "formal") {
////            return "Good evening";
////        } else if (this.formality == "casual") {
////            return "Goodday?";
////        } else if (this.formality == "intimate") {
////            return "Hello darling!";
////        } else {
////            return "Hello.";
////        }
//    }
//
    public void setFormality(String formality) {
        personality = switch (formality) {
            case "formal" -> new Formal();
            case "casual" -> new Casual();
            case "intimate" -> new Intimate();
            default -> () -> "Hello.";
        };
    }

    public String greet() { return this.personality.greet(); }
}
