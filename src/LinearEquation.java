public class LinearEquation {
    private String coordinate;
    private int horizontal;
    private int vertical;

    public void Receiver1(int horizontal, int vertical){
        int horizontal1 = horizontal;
        int vertical1 = vertical;
    }

    public void Receiver2(int horizontal, int vertical){
        int horizontal2 = horizontal;
        int vertical2 = vertical;
    }

    public int ChangeOfX(){
        int deltaX = horizontal2 - horizontal1;
        return deltaX;
    }

    public int ChangeOfY(){
        int deltaY = vertical2 - vertical1;
        return deltaY;
    }


    public int slope(){
        deltaY / deltaX;
    }

    public double distance(){

    }

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
