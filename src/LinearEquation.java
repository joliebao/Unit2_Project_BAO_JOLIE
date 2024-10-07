public class LinearEquation {
    private int horizontal1;
    private int vertical1;
    private int horizontal2;
    private int vertical2;
    private int horizontal;

    public void ReceiverOne(int horizontal, int vertical){
        horizontal1 = horizontal;
        vertical1 = vertical;
    }

    public void ReceiverTwo(int horizontal, int vertical){
        horizontal2 = horizontal;
        vertical2 = vertical;
    }

    public void Receiver(int horizontal){
        this.horizontal = horizontal;
    }

    public int ChangeOfX(){
        int deltaX = horizontal2 - horizontal1;
        return deltaX;
    }

    public int ChangeOfY(){
        int deltaY = vertical2 - vertical1;
        return deltaY;
    }

    public String Slope(){
       String m = ChangeOfY() + "/" + ChangeOfX();
       return m;
       // set up different slope conditions following the third page instructions!
    }

    public int YIntercept(){
        int b = vertical2 - (horizontal2 * (ChangeOfY()/ChangeOfX()));
        return b;
    }

    //pythagorean theorem
    public double Distance(){
        double aSquaredBSquared = (double) (Math.pow(ChangeOfY(),2) + Math.pow(ChangeOfX(),2));
        double distance = Math.sqrt(aSquaredBSquared);
        return distance;
    }

    // y = mx + b form
    public String SlopeEquation(){
        String slopeEquation = "y = " + Slope() + "x + " + YIntercept();
        return slopeEquation;
    }

    public String LinearEquation(){
        String linearEq = "First pair: " + horizontal1 + "," + vertical1 +
                                "\n Second pair: " + horizontal2 + "," + vertical2 +
                                "\n Slope of line: " + Slope() +
                                "\n Y-intercept: " + YIntercept() +
                                "\n Slope intercept form: " + SlopeEquation() +
                                "\n Distance between points: " + Distance();
        return linearEq;
    }

    // Create all strings to be printed
    public int FindY(){
        int yValue = (((ChangeOfY()/ChangeOfX()) * horizontal) + YIntercept());
        return yValue;
    }

    public String toString(){
        String coordString = ("Solved coordinate point is: (" + horizontal + "," + FindY() + ")");
        return coordString;
    }
}
