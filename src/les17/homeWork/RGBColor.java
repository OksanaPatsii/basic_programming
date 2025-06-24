package les17.homeWork;

public class RGBColor {
    public int red;

    public int green;

    public int blue;

    public RGBColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }


    RGBColor blend(RGBColor other) {
        int blendedRed = (this.red + other.red) / 2;
        int blendedGreen = (this.green + other.green) / 2;
        int blendedBlue = (this.blue + other.blue) / 2;

        return new RGBColor(blendedRed, blendedGreen, blendedBlue);
    }


    public void printColor() {
        System.out.println("RGB(" + red + ", " + green + ", "
         + blue);
    }

}
