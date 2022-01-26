public class App {
    public static void describe(String colour, Priority p) {
        String p1;
        switch (p) {
            case LOW:
                p1 = "low";
                break;
            case MEDIUM:
                p1 = "medium";
                break;
            case HIGH:
                p1 = "high";
                break;
            default:
                p1 = "error";
                break;
        }
        String output = String.format("%s indicates %s priority", colour, p1);

        System.out.println(output);
    }

    public static void main(String[] args) {
        describe("Red", Priority.HIGH);
        describe("Orange", Priority.MEDIUM);
        describe("Blue", Priority.MEDIUM);
        describe("Green", Priority.LOW);
    }
}