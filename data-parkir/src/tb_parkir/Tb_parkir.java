
package tb_parkir;
import javax.swing.UIManager;

public class Tb_parkir {

    public static void main(String[] args) {
        // TODO code application logic here
        koneksi konek = new koneksi();
        konek.koneksi();
        try 
        {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel");
        } 
        catch (Exception e) 
        {
          e.printStackTrace();
        }
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
