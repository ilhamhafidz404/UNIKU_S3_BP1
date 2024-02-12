import javax.swing.JApplet;
import javax.swing.JFrame;

public class MainAppletRunner {
    public static void main(String[] args) {
        BP1_M2_P1_IlhamHafidz applet = new BP1_M2_P1_IlhamHafidz();
        BP1_M2_PostTest1_IlhamHafidz_AppletMouse applet2 = new BP1_M2_PostTest1_IlhamHafidz_AppletMouse();
        BP1_M2_PostTest2_IlhamHafidz_Applet3D applet3 = new BP1_M2_PostTest2_IlhamHafidz_Applet3D();
        BP1_M2_Tugas1_Ilham_AppletePerhitungan appletKalkulatorTugas = new BP1_M2_Tugas1_Ilham_AppletePerhitungan();
        BP1_M2_Tugas2_Ilham_AppleteAnimasi appletAnimasiTugas = new BP1_M2_Tugas2_Ilham_AppleteAnimasi();
        
        NewApplet farhan = new NewApplet();

        
        JFrame frame = new JFrame("Applet Runner");

        frame.add(farhan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // Sesuaikan ukuran frame sesuai kebutuhan
        frame.setVisible(true);

        farhan.init();
        farhan.start();
    }
}

