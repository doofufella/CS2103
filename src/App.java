public class App {

    public static void printArea(String descriptor) {
        try {
            System.out.println(descriptor + "=" + calculateArea(descriptor));

        } catch (NumberFormatException e) {
            System.out.println("width or height is not a number: " + descriptor);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("WIDTH or HEIGHT is missing: " + descriptor);

        } catch (IllegalShapeException e) {
            System.out.println("Illegal shape: " + descriptor);
            // e.printStackTrace();
        }

    }

    private static int calculateArea(String descriptor) throws IllegalShapeException {
        String[] dimensions = descriptor.split("x");

        if (dimensions.length > 2) {
            throw new IllegalShapeException();
        }

        return Integer.parseInt(dimensions[0]) * Integer.parseInt(dimensions[1]);

    }

    public static void main(String[] args) {
        printArea("3x4");
        printArea("Ax5");
        printArea("3x");
        printArea("3");
        printArea("5x5x5");
    }
}