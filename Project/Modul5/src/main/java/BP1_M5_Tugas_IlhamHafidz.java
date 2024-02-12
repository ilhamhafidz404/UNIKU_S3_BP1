import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BP1_M5_Tugas_IlhamHafidz extends JFrame {
    private int xPosition = 0;
    private int yPosition = 0;
    private final int width = 50;
    private final int height = 50;
    private final int deltaX = 5;
    private final int deltaY = 5;
    private Timer timer;

    public BP1_M5_Tugas_IlhamHafidz() {
        setTitle("Animasi Ilham");
        setSize(400, 400);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillRect(xPosition, yPosition, width, height);
            }
        };

//        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);

        startAnimation();
    }

    private void startAnimation() {
        timer = new Timer(50, new ActionListener() {
            private int elapsedTime = 0;
            private boolean moveLeft = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (elapsedTime < 5000) { 
                    moveLeft();
                } else {
                    moveDown();
                }
                elapsedTime += 50;
                repaint();
            }

            private void moveLeft() {
                xPosition += deltaX;
                if (xPosition > getWidth() - width) {
                    xPosition = getWidth() - width;
                    moveLeft = false;
                }
            }

            private void moveDown() {
                if (!moveLeft) {
                    yPosition += deltaY;
                    if (yPosition > getHeight() - height) {
                        yPosition = getHeight() - height;
                        timer.stop(); 
                    }
                }
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BP1_M5_Tugas_IlhamHafidz().setVisible(true);
            }
        });
    }
}
