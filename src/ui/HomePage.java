package ui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.util.Locale;
import java.util.ResourceBundle;
import object.FontSetting;

/**
 *
 * @author ACER
 */
public class HomePage extends javax.swing.JFrame {

    private Locale currentLocale;

    public HomePage(Locale locale) {
        this.currentLocale = locale;
        initComponents();
        applyFont();
        applyLanguage(); // Terapkan bahasa saat halaman dibuka
    }

    private void applyFont() {
        try {
            FontSetting fs = new FontSetting("CODE2000", 1, 14);
            fs.selectContainer(getContentPane());
        } catch (Exception e) {
            System.err.println("Font Error: " + e.getMessage());
        }
    }

    private void applyLanguage() {
        try {
            ResourceBundle rb = ResourceBundle.getBundle("localization/Bundle", currentLocale);
            lblWelcome.setText(rb.getString("HomePage.lblWelcome.text"));
            lblChooseLanguage.setText(rb.getString("LoginPage.lblChooseLanguage.text"));
            setTitle(rb.getString("HomePage.title"));
        } catch (Exception e) {
            System.err.println("Language Error: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        cmbChooseLanguage = new javax.swing.JComboBox<>();
        lblChooseLanguage = new javax.swing.JLabel();
        btnAbout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblWelcome.setText("WELCOME!");

        cmbChooseLanguage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Indonesian", "Korean", "Japan" }));
        cmbChooseLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChooseLanguageActionPerformed(evt);
            }
        });

        lblChooseLanguage.setText("Choose Language:");

        btnAbout.setBackground(new java.awt.Color(0, 51, 102));
        btnAbout.setForeground(new java.awt.Color(255, 255, 255));
        btnAbout.setText("About");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(lblWelcome)
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblChooseLanguage)
                        .addGap(18, 18, 18)
                        .addComponent(cmbChooseLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAbout)
                        .addGap(157, 157, 157))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbChooseLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChooseLanguage))
                .addGap(30, 30, 30)
                .addComponent(lblWelcome)
                .addGap(59, 59, 59)
                .addComponent(btnAbout)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbChooseLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChooseLanguageActionPerformed
        int lang = cmbChooseLanguage.getSelectedIndex();
        switch (lang) {
            case 0:
                currentLocale = new Locale("en", "US");
                break;
            case 1:
                currentLocale = new Locale("in", "ID");
                break;
            case 2:
                currentLocale = new Locale("ko", "KR");
                break;
            case 3:
                currentLocale = new Locale("ja", "JP");
                break;
            default:
                currentLocale = new Locale("en", "US");
                break;
        }
        applyLanguage(); // Terapkan ulang bahasa
    }//GEN-LAST:event_cmbChooseLanguageActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        try {
            AboutPage aboutPage = new AboutPage(currentLocale);
            aboutPage.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace(); // Ini WAJIB untuk tahu error
        }
    }//GEN-LAST:event_btnAboutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale defaultLocale = new Locale("en", "US");
        java.awt.EventQueue.invokeLater(() -> {
            new HomePage(defaultLocale).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JComboBox<String> cmbChooseLanguage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblChooseLanguage;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
