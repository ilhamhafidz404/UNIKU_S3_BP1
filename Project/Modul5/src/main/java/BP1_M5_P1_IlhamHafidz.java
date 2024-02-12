import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class BP1_M5_P1_IlhamHafidz extends JPanel {
    private static final int L = 400, T = 400;
    List<Mobil> mobil;

    public BP1_M5_P1_IlhamHafidz() {
        setBackground(new Color(0, 0, 0));
        setLayout(null);
        mobil = new ArrayList<>();
        mobil.add(new Mobil(100, 200));
        Timer timer = new Timer(50, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (Mobil mobil : mobil) {
                    mobil.bergerak();
                }
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Mobil mobil : mobil) {
            mobil.gambarMobil(g);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(L, T);
    }

    public class Mobil {
        private static final int INCREMENT = 5;
        int x, y;

        public Mobil(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void gambarMobil(Graphics g) {
            g.setColor(Color.BLUE);
            g.fillRect(x + 15, y - 20, 60, 35);
            g.setColor(Color.yellow);
            g.fillRect(x, y, 110, 30);
            g.setColor(Color.red);
            g.fillOval(x + 15, y + 20, 20, 20);
            g.fillOval(x + 60, y + 20, 20, 20);
        }

        public void bergerak() {
            if (x == L) {
                x = 1;
            } else {
                x += INCREMENT;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.getContentPane().add(new BP1_M5_P1_IlhamHafidz());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Animasi Mobil Bergerak");
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
