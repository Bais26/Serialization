package Setting;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author bass
 */
public class MainFrame extends javax.swing.JFrame {
    
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtUmur = new javax.swing.JTextField();
        comboTema = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JPasswordField();
        btnGantiTema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        jLabel3.setText("Age");

        jLabel4.setText("Tema");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtUmur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUmurActionPerformed(evt);
            }
        });

        comboTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Light", "Dark" }));
        comboTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTemaActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnGantiTema.setText("Ganti Tema");
        btnGantiTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGantiTemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername)
                            .addComponent(txtUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnGantiTema)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addComponent(btnGantiTema)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtUmurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUmurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUmurActionPerformed

    private void comboTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTemaActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnGantiTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGantiTemaActionPerformed
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());
        String umurText = txtUmur.getText();
        String temaBaru = (String) comboTema.getSelectedItem();

        if (username.isEmpty() || password.isEmpty() || umurText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int umur;
        try {
            umur = Integer.parseInt(umurText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Umur harus berupa angka", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        try {
            if (temaBaru.equals("Light")) {
                // Set tema terang
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                UIManager.put("Button.background", Color.WHITE); // Warna background tombol menjadi putih
                UIManager.put("Button.foreground", Color.BLACK); // Warna teks tombol menjadi hitam
                UIManager.put("Label.foreground", Color.BLACK); // Warna teks label menjadi hitam
            } else if (temaBaru.equals("Dark")) {
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                UIManager.put("control", new Color(43, 43, 43)); // Warna background menjadi gelap
                UIManager.put("info", new Color(128, 128, 128)); // Warna info menjadi abu-abu
                UIManager.put("nimbusBase", new Color(30, 30, 30)); // Warna base menjadi gelap
                UIManager.put("nimbusAlertYellow", new Color(248, 187, 0)); // Warna alert menjadi kuning
                UIManager.put("nimbusDisabledText", new Color(128, 128, 128)); // Warna teks disabled menjadi abu-abu
                UIManager.put("nimbusFocus", new Color(115,164,209)); // Warna fokus menjadi biru
                UIManager.put("nimbusGreen", new Color(176,179,50)); // Warna hijau
                UIManager.put("nimbusInfoBlue", new Color(66,139,221)); // Warna info menjadi biru
                UIManager.put("nimbusLightBackground", new Color(18, 30, 49)); // Warna background terang               
                UIManager.put("nimbusSelectedText", new Color(255,255,255)); // Warna teks terpilih menjadi putih
                UIManager.put("nimbusSelectionBackground", new Color(104,93,156)); // Warna latar belakang terpilih menjadi ungu
                UIManager.put("text", new Color(230, 230, 230)); // Warna teks menjadi putih
                }
                    
                SwingUtilities.updateComponentTreeUI(this);                

                PreferensiPengguna preferensiPengguna = new PreferensiPengguna(txtUsername.getText(), new String(txtPassword.getPassword()), Integer.parseInt(txtUmur.getText()), temaBaru);
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("preferensiPengguna.ser"))) {
                    oos.writeObject(preferensiPengguna);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("preferensiPengguna.ser"))) {
                    PreferensiPengguna readPreferensi = (PreferensiPengguna) ois.readObject();
                    System.out.println("Username: " + readPreferensi.getUsername());
                    System.out.println("Password: " + readPreferensi.getPassword());
                    System.out.println("Umur: " + readPreferensi.getUmur());
                    System.out.println("Tema: " + readPreferensi.getTema());
                } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }
    }//GEN-LAST:event_btnGantiTemaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            try {
                // Set look and feel tema terang
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGantiTema;
    private javax.swing.JComboBox<String> comboTema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUmur;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
