package com.rohini.checkerapplet;

import java.applet.Applet;
import java.awt.*;

public class CheckerApplet extends Applet {
    private int squareSize=50;
    private Color squareColor = Color.CYAN;
    private Color foreColor = Color.CYAN;
    private String message;
    @Override
    public void init() {
        message = "Java Sucks";
        try
        {
            String colorStr = this.getParameter("Color");
            String sizeStr = this.getParameter("Size");
            message = getParameter("message");
            if(message == null) {
                squareColor = Color.YELLOW;
            }
            squareColor = parseColor(colorStr);
            foreColor = parseColor(getParameter("foreColor"));
            squareSize = Integer.parseInt(sizeStr);
        }catch(Exception e) {
            System.out.println("Exception occurred");
            squareColor = Color.red;
        }
        setForeground(squareColor);
    }
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
    @Override
    public void paint(Graphics g) {
        g.setColor(squareColor);
        g.fillRect(0,0, squareSize, squareSize);
        g.setColor(foreColor);
        g.setFont(new Font("arial", Font.BOLD, 30));
        g.drawString(message, 0, squareSize/2);
    }

}
