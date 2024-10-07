import java.util.Scanner;

public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // First coordinate
        System.out.print("Enter your first Coordinate Point: ");
        String coordinateOne = s.nextLine();
        String x1 = coordinateOne.substring(1, 2);
        String y1 = coordinateOne.substring (3, 4);
        int horizontal1 = Integer.parseInt(x1);
        int vertical1 = Integer.parseInt(y1);


        // Second coordinate
        System.out.print("Enter your second Coordinate Point: ");
        String coordinateTwo = s.nextLine();
        String x2 = coordinateTwo.substring(1, 2);
        String y2 = coordinateTwo.substring (3, 4);
        int horizontal2 = Integer.parseInt(x2);
        int vertical2 = Integer.parseInt(y2);

        LinearEquation points = new LinearEquation();

        points.ReceiverOne(horizontal1, vertical1);
        points.ReceiverTwo(horizontal2, vertical2);
        points.ChangeOfX();
        points.ChangeOfY();
        points.Slope();
        points.YIntercept();
        points.Distance();
        points.SlopeEquation();
        System.out.println(points.LinearEquation());

//        System.out.print("Enter your second Coordinate Point: ");
        points.FindY();
        points.toString();

    }
}
