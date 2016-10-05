import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by cenk.akdeniz on 11.12.2015.
 */
public class Form extends  JFrame{
    private JPanel panel1;
    private JLabel lblWhiteList;
    private JTextField txtWhiteList;
    private JTextField txtBilet;
    private JLabel lblBilet;
    private JButton btnKiyasla;
    private JTextField txtDosyaYolu;
    private JButton btnYazdir;
    private JLabel lblDosyaYolu;


    public Form() {
        btnKiyasla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List list = new ArrayList();
                String whiteList = (String) txtWhiteList.getText();
                String bilet= (String)txtBilet.getText();
                String dosyaYolu= (String)txtDosyaYolu.getText();
                try {
                    biletOkuma bo = new biletOkuma();
                    dosyaOkuma doo= new dosyaOkuma();
                    list= bo.kiyasla(doo.dosyadanOku(bilet),doo.dosyadanOku(whiteList));
                    doo.dosyaYazma(dosyaYolu,list);
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setContentPane(new Form().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,300);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
}
