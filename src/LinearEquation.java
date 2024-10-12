public class LinearEquation {
    private double horizontal1;
    private double vertical1;
    private double horizontal2;
    private double vertical2;
    private double horizontal;

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
        String m = Integer.toString((int)changeOfY()/(int)changeOfX());
        if (changeOfY()/changeOfX() % 1 != 0 && changeOfY() < 0 && changeOfX() < 0) {
            m = (int)Math.abs(changeOfY()) + "/" + (int)Math.abs(changeOfX());
        } else if (changeOfY()/changeOfX() % 1 != 0 && changeOfX() < 0 && changeOfY() < 0) {
            m = (int)Math.abs(changeOfY()) + "/" + (int)Math.abs(changeOfX());
        } else if (changeOfY()/changeOfX() % 1 != 0 && changeOfX() < 0) {
            m = -1 * (int)changeOfY() + "/" + -1 * (int)changeOfX();
        } else if ((changeOfY()/changeOfX()) % 1 != 0) {
            m = (int)changeOfY() + "/" + (int)changeOfX();
        }
        return m;
    }

    public double yIntercept(){
        double yInt = vertical2 - (horizontal2 * (changeOfY()/changeOfX()));
        return (double) (Math.round(yInt*100))/100;

    }

    //pythagorean theorem
    public double distance(){
        double aSquaredBSquared = Math.pow(changeOfY(),2) + Math.pow(changeOfX(),2);
        double distance = (Math.sqrt(aSquaredBSquared));
        return ((double) Math.round(distance * 100))/100;
    }

    // y = mx + b form
    public String slopeEquation(){
        String slopeEquation = " ";
        if ((changeOfY()/changeOfX()) == 0 && yIntercept() == 0) {          //slope 0, intercept 0
            slopeEquation = "y = 0";
        } else if ((changeOfY()/changeOfX()) == 1 && yIntercept() == 0) {   //slope 1, intercept 0
            slopeEquation = "y = x";
        } else if ((changeOfY()/changeOfX()) == 1 && yIntercept() < 0){     //slope 1, intercept negative
            slopeEquation = "y = x - " + Math.abs(yIntercept());
        } else if ((changeOfY()/changeOfX()) != 1 && yIntercept() < 0){      //slope more than 1, intercept negative
            slopeEquation = "y = " + slope() + "x - " + (Math.abs(yIntercept()));
        } else if ((changeOfY()/changeOfX()) > 1 && yIntercept() == 0) {    //slope more than 1, intercept 0
            slopeEquation = "y = " + slope() + "x";
        } else if ((changeOfY()/changeOfX()) == 1 && yIntercept() > 0){     //slope 1, intercept positive
            slopeEquation = "y = x + " + yIntercept();
        } else {
            slopeEquation = "y = " + slope() + "x + " + yIntercept();
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
        double a = (((changeOfY()/changeOfX()) * horizontal) + yIntercept());
        return ((int)(a * 100))/100.00;
    }

    public String toString(){
        return ("Solved coordinate point is: (" + horizontal + "," + findY() + ")");
    }
}
