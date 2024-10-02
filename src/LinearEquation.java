public class LinearEquation {
    private String coordinate;
    private int horizontal1;
    private int vertical1;
    private int horizontal2;
    private int vertical2;

    public void Receiver1(int horizontal, int vertical){
        horizontal1 = horizontal;
        vertical1 = vertical;
    }

    public void Receiver2(int horizontal, int vertical){
        horizontal2 = horizontal;
        vertical2 = vertical;
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
    public double distance(){

    }

    // y = mx + b form
    public String slopeEquation(){

    }

    public LinearEquation(){

    }

    // Create all strings to be printed
    public String toString(){

    }

    public int findY(){

    }
}
