import com.rohini.checkerapplet.CheckerApplet;

import java.awt.*;
public class TestApplet {

    private Color parseColor(String strColor) {
        Color color = new Color(0,0,0);
        switch (strColor) {
            case "red":
                return new Color(255,0,0);
            case "green":
                return new Color(0,255,0);
            case "blue":
                return new Color(0,0,255);
            case "white":
                return new Color(255,255,255);
        };
        return color;
    }
    public static void main(String[] args) {
        System.out.println("Color RED is " + Color.red.toString());
        Color clrBlue = new Color(0,0,255);

        System.out.println("Color blue is " + clrBlue );

        TestApplet appletTester = new TestApplet();
        System.out.println("My color is " + appletTester.parseColor("ajshdj"));
        CheckerApplet applet = new CheckerApplet();
    }


}
