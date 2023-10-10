public class Main {
    public static void main(String[] args) {



        Participant[] participants = {
                new Human("Людина"),
                new Cat("Кіт"),
                new Robot("Робот")
        };

        Obstacle[] obstacles = {
                new RunningTrack(100),
                new Wall(2)
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) {
                    break;
                }
            }
        }
        GeometricShape[] shapes = {
                new Circle(5.0),
                new Triangle(4.0, 6.0),
                new Square(3.0)
        };
        double totalArea = calculateTotalArea(shapes);
        System.out.println("Сума площ усіх фігур дорівнює : " + totalArea);
    }
    public static double calculateTotalArea(GeometricShape[] shapes) {
        double totalArea = 0;
        for (GeometricShape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}