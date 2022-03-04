import java.applet.Applet;
import java.awt.*;

public class appletnewclass extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("Hello there everybody", 100,100);
        g.drawRect(0, 0, 100, 100);
        g.fillRect(0,0,100,100);

    }
}
