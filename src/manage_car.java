
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Component;
import java.awt.Dimension;
import static java.awt.EventQueue.invokeLater;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

public class manage_car extends javax.swing.JFrame {

    ArrayList<car> al = new ArrayList<>();
    mytablemodel tm = new mytablemodel();

    public manage_car() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jt.setModel(tm);
        jt.setRowHeight(100);
        jt.getColumnModel().getColumn(9).setCellRenderer(new manage_car.ImageRenderer());
        setVisible(true);
        Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        setSize(d);
        photolb.setBounds(0, 0, d.width, d.height);
//        getContentPane().setBackground(Color.black);
        ImageIcon i1 = new ImageIcon("src/uploads/back03.jpg");
        Image img = i1.getImage().getScaledInstance(photolb.getWidth(), photolb.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        photolb.setIcon(i2);
        getcar();
    }

    class ImageRenderer extends DefaultTableCellRenderer {

        JLabel lb = new JLabel();
        
        
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            try {
                URL url = new URL("http://localhost:9000/GetResource/" + al.get(row).photo);
                BufferedImage img = ImageIO.read(url);
                Image im = img.getScaledInstance(75, 100, Image.SCALE_SMOOTH);
                lb.setIcon(new ImageIcon(im));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return lb;

        }

    }

    void getcar() {
        try {
            HttpResponse<String> res = Unirest.get("http://localhost:9000/getcar")
                    .asString();
            if (res.getStatus() == 200) {
                String ans = res.getBody();
                System.out.println(ans);
                StringTokenizer st = new StringTokenizer(ans, ";;");
                while (st.hasMoreTokens()) {
                    String row = st.nextToken();
                    StringTokenizer st2 = new StringTokenizer(row, "~~");
                    String car_id = st2.nextToken();
                    String Car_Names = st2.nextToken();
                    String Brand = st2.nextToken();
                    String Car_Type = st2.nextToken();
                    String Fuel_Type = st2.nextToken();
                    String price_per_day_without_driver = st2.nextToken();
                    String price_per_day_with_driver = st2.nextToken();
                    String Security = st2.nextToken();
                    String discription = st2.nextToken();
                    String photo = st2.nextToken();
                    al.add(new car(car_id, Car_Names, Brand, Car_Type, Fuel_Type, price_per_day_without_driver, price_per_day_with_driver, Security, discription, photo));
                }
                tm.fireTableDataChanged();
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        lb = new javax.swing.JLabel();
        photolb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jt.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Car Name", "Brand", "Car Type", "Fuel Type", "price per day without driver", "price per day with driver", "Security", "Discription", "Photo"
            }
        ));
        jScrollPane1.setViewportView(jt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 170, 1140, 430);

        bt1.setBackground(new java.awt.Color(204, 204, 204));
        bt1.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        bt1.setForeground(new java.awt.Color(51, 51, 51));
        bt1.setText("Add");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(390, 630, 170, 40);

        bt2.setBackground(new java.awt.Color(204, 204, 204));
        bt2.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        bt2.setForeground(new java.awt.Color(51, 51, 51));
        bt2.setText("Delete");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(730, 630, 170, 40);

        lb.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 0, 48)); // NOI18N
        lb.setForeground(new java.awt.Color(0, 51, 102));
        lb.setText("Manage car");
        getContentPane().add(lb);
        lb.setBounds(490, 70, 320, 70);

        photolb.setText("jLabel1");
        getContentPane().add(photolb);
        photolb.setBounds(1150, 20, 37, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    class mytablemodel extends AbstractTableModel {

        @Override
        public int getRowCount() {

            return al.size();

        }

        @Override
        public int getColumnCount() {

            return 10;

        }

        @Override
        public String getColumnName(int j) {
            String s[] = {"Car_id", "Car Name", "Brand", "Car Type", "Fuel Type", "Price Per Day Without Driver", "Price Per Day With Driver", "Security", "Discription", "Photo"};
            return s[j];

        }

        @Override
        public Object getValueAt(int i, int j) {
            car c = al.get(i);
            if (j == 0) {
                return c.car_id;
            } else if (j == 1) {
                return c.carname;
            } else if (j == 2) {
                return c.brand;
            } else if (j == 3) {
                return c.cartype;
            } else if (j == 4) {
                return c.fueltype;
            } else if (j == 5) {
                return c.priceperdaywithoutdriver;
            } else if (j == 6) {
                return c.priceperdaywithdriver;
            } else if (j == 7) {
                return c.security;
            } else if (j == 8) {
                return c.discription;

            } else {
                return c.photo;
            }

        }
    }


    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        add_car obj = new add_car();
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        int i = jt.getSelectedRow();
        if (i == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row");
        } else {
            String car_id = al.get(i).car_id;
            System.out.println(car_id);
            try {
                HttpResponse<String> res = Unirest.get(global.ip_address + "delete_car")
                        .queryString("car_id", car_id)
                        .asString();
                if (res.getStatus() == 200) {
                    String ans = res.getBody();
                    if (ans.equals("success")) {
                        JOptionPane.showMessageDialog(this, "deleted Successfully!!");
                        getcar();
                    } else {
                        JOptionPane.showMessageDialog(this, "erroe occured!!");

                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bt2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new manage_car().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel photolb;
    // End of variables declaration//GEN-END:variables

}
