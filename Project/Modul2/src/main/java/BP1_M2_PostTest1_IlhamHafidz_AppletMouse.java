/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.ArrayList;

/**
 *
 * 
 */
public class BP1_M2_PostTest1_IlhamHafidz_AppletMouse extends Applet implements MouseMotionListener {
    private ArrayList<Point> lines = new ArrayList<>();
    private int x1, y1, x2, y2;

    public void init() {
        setBackground(Color.white);
        addMouseMotionListener(this);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(6)); // Mengatur ketebalan garis
        Point prevPoint = null;
        for (Point p : lines) {
            if (prevPoint != null) {
                g2d.drawLine(prevPoint.x, prevPoint.y, p.x, p.y);
            }
            prevPoint = p;
        }
    }

    public void mouseMoved(MouseEvent e) {
        x1 = x2;
        y1 = y2;
        x2 = e.getX();
        y2 = e.getY();
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        lines.add(new Point(x2, y2));
        repaint();
    }
}