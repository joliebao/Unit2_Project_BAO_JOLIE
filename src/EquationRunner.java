import java.util.Scanner;

public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // First coordinate
        System.out.print("Enter your first Coordinate Point: ");
        String coordinateOne = s.nextLine();
        int i = coordinateOne.indexOf(",");
        int p = coordinateOne.indexOf(")");
        String x1 = coordinateOne.substring(1, i);
        String y1 = coordinateOne.substring (i + 1, p);
        int horizontal1 = Integer.parseInt(x1);
        int vertical1 = Integer.parseInt(y1);


        // Second coordinate
        System.out.print("Enter your second Coordinate Point: ");
        String coordinateTwo = s.nextLine();
        int i2 = coordinateTwo.indexOf(",");
        int p2 = coordinateTwo.indexOf(")");
        String x2 = coordinateTwo.substring(1, i2);
        String y2 = coordinateTwo.substring (i2 + 1, p2);
        int horizontal2 = Integer.parseInt(x2);
        int vertical2 = Integer.parseInt(y2);

        LinearEquation points = new LinearEquation();

        points.receiverOne(horizontal1, vertical1);
        points.receiverTwo(horizontal2, vertical2);

        points.changeOfX();
        points.changeOfY();
        points.slope();
        points.yIntercept();
        points.distance();
        points.slopeEquation();
        System.out.println(points.linearEquation());

        System.out.print("Enter your second Coordinate Point: ");
        String coordinateX = s.nextLine();
        int x = Integer.parseInt(coordinateX);
        points.receiver(x);

        points.findY();
        System.out.println(points.toString());

    }
}
