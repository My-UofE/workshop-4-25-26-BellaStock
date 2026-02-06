public class CircleApp {
    public static void main(String[] args) {

        // Create circles
        Circle c1 = new Circle(5, 10, 10);
        Circle c2 = new Circle(3);
        Circle c3 = new Circle();

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);

        // Test getters
        System.out.println("c1 radius: " + c1.getRadius());
        System.out.println("c1 origin: (" + c1.getOriginX() + ", " + c1.getOriginY() + ")");

        // Test area & circumference
        System.out.println("c1 area: " + c1.getArea());
        System.out.println("c1 circumference: " + c1.getCircumference());

        // Test move
        c1.move(5, -3);
        System.out.println("c1 after moving: " + c1);

        // Test scale
        c2.scale(2);
        System.out.println("c2 after scaling: " + c2);

        // Test negative radius protection
        c3.setRadius(-10);   // should be ignored
        System.out.println("c3 radius after invalid set: " + c3.getRadius());

        // Test overlap
        System.out.println("c1 overlaps c2: " + c1.isOverlappedWith(c2));
        System.out.println("c2 overlaps c3: " + c2.isOverlappedWith(c3));

        // Test enclosure
        System.out.println("c1 enclosed by c2: " + c1.isEnclosedBy(c2));
        System.out.println("c2 enclosed by c1: " + c2.isEnclosedBy(c1));
    }
}

