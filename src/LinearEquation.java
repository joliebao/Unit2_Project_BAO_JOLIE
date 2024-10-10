public class LinearEquation {
    private double horizontal1;
    private double vertical1;
    private double horizontal2;
    private double vertical2;
    private double horizontal;

    // TO BE FIXED: integers should be rewritten as doubles   (WIP)
    //              page 3 requirements should be done
    //              doublecheck typing standards
    //              complete testing document

    public void receiverOne(double horizontal, double vertical){
        horizontal1 = horizontal;
        vertical1 = vertical;
    }

    public void receiverTwo(double horizontal, double vertical){
        horizontal2 = horizontal;
        vertical2 = vertical;
    }

    public void receiver(double horizontal){
        this.horizontal = horizontal;
    }

    public double changeOfX(){
        return horizontal2 - horizontal1;
    }

    public double changeOfY(){
        return vertical2 - vertical1;
    }

    public String slope(){
        String m = Double.toString(changeOfY()/changeOfX());
        if (changeOfY()/changeOfX() % 1 != 0 && changeOfY() < 0 && changeOfX() < 0) {
            m = Math.abs(changeOfY()) + "/" + Math.abs(changeOfX());
        } else if (changeOfY()/changeOfX() % 1 != 0 && changeOfX() < 0) {
            m = -1 * changeOfY() + "/" + -1 * changeOfX();
        } else if ((changeOfY()/changeOfX()) % 1 != 0) {
            m = changeOfY() + "/" + changeOfX();
        }
        return m;
    }

    public double yIntercept(){
        return vertical2 - (horizontal2 * (changeOfY()/changeOfX()));
    }

    //pythagorean theorem
    public double distance(){
        double aSquaredBSquared = Math.pow(changeOfY(),2) + Math.pow(changeOfX(),2);
        double distance = (Math.sqrt(aSquaredBSquared));
        return ((double) Math.round(distance * 100))/100;
    }

    // y = mx + b form
    public String slopeEquation(){
        String slopeEquation = "y = " + slope() + "x + " + yIntercept();
        if ((changeOfY()/changeOfX()) == 1 && yIntercept() == 0) {
            slopeEquation = "y = " + "x";
        } else if (yIntercept() < 0){
            slopeEquation = "y = " + "x - " + yIntercept();
        } else if ((changeOfY()/changeOfX()) == 1){
            slopeEquation = "y = " + "x + " + yIntercept();
        } else if (yIntercept() == 0) {
            slopeEquation = "y = " + slope() + "x";
        }
        return slopeEquation;
    }

    public String linearEquation(){
        return "First pair: (" + (int)horizontal1 + "," + (int)vertical1 + ")" +
                                "\nSecond pair: (" + (int)horizontal2 + "," + (int)vertical2 + ")" +
                                "\nSlope of line: " + slope() +
                                "\nY-intercept: " + yIntercept() +
                                "\nSlope intercept form: " + slopeEquation() +
                                "\nDistance between points: " + distance();
    }

    // Create all strings to be printed
    public double findY(){
        return (((changeOfY()/changeOfX()) * horizontal) + yIntercept());
    }

    public String toString(){
        return ("Solved coordinate point is: (" + horizontal + "," + findY() + ")");
    }
}
