import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BP1_M2_Tugas2_Ilham_AppleteAnimasi extends Applet implements Runnable {
    Thread t1;

    public void init() {
        t1 = new Thread(this);
    }

    public void start() {
        t1.start();
    }

    public void run() {
        Thread t2 = Thread.currentThread();
        while (t1 == t2) {
            repaint();
        }
    }

    public void paint(Graphics g) {
        Color c[] = { Color.red, Color.yellow, Color.BLUE, Color.pink, Color.MAGENTA };
        int posX[] = {10, 20, 30, 40, 50};
        int posY[] = {10, 20, 30, 40, 50};

        for (int x = 0; x <= 4; x++) {
            try {
                Thread.sleep(1000);
                g.setColor(c[x]);
                g.fillRect(posX[x], posY[x], 200, 200);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        t1 = null;
    }
}