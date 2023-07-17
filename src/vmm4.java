
import java.awt.Color;
import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class vmm4 extends javax.swing.JFrame {

    public vmm4() {
        initComponents();
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        int random = (int) (Math.random() * 10);

        ImageIcon icon = new ImageIcon("src/images/success.png");
        Image resizeimage = icon.getImage().getScaledInstance(sorf.getWidth(), sorf.getHeight(), SCALE_SMOOTH);

        sorf.setIcon(new ImageIcon(resizeimage));
        lb_sorf.setText("Success");
        global.payment_status = "success";
        JOptionPane.showMessageDialog(this, "Payment Done!!");
        setVisible(true);

//        }
//        else{
//            ImageIcon icon1 = new ImageIcon("src/images/failure.png");
//            Image resizeimage1 = icon1.getImage().getScaledInstance(sorf.getWidth(), sorf.getHeight(), SCALE_SMOOTH);
//
//        sorf.setIcon(new ImageIcon(resizeimage1));
//        lb_sorf.setText("Fail");
//        setVisible(true);
//        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sorf = new javax.swing.JLabel();
        lb_sorf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        sorf.setText("sorf");
        getContentPane().add(sorf);
        sorf.setBounds(4, 4, 390, 290);

        lb_sorf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_sorf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_sorf.setText("lb_sorf");
        getContentPane().add(lb_sorf);
        lb_sorf.setBounds(0, 310, 400, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vmm4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_sorf;
    private javax.swing.JLabel sorf;
    // End of variables declaration//GEN-END:variables
}
