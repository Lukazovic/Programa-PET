package Interface;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Monitores;
import model.dao.PetDAO;

/**
 * @author Lucas Vieira
 */
public class TelaPetianos extends javax.swing.JFrame {

    /**
     * Creates new form TelaPetianos
     */
    public TelaPetianos() {
        initComponents();
        
        readTabelaMonitores();
    }

    
    public void readTabelaMonitores(){
        DefaultTableModel dtmDados = (DefaultTableModel) jTable1.getModel();
        dtmDados.setNumRows(0);
        
        PetDAO pdao =  new PetDAO();
        for(Monitores monitor: pdao.readMonitores()){
            dtmDados.addRow(new Object[]{
                monitor.getRAmonitor(),
                monitor.getNomeMonitor()
            });
        }
    }
    
    public boolean nomeMonitorValido(String nomeMonitor){
        if(nomeMonitor.length() > 30){
            return false;
        }
        return true;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtNomeMonitor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRAmonitor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensPET/LogoPET2.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 10, 99, 94);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Petianos");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 40, 170, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "RA", "Monitor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 110, 250, 150);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Remover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 270, 120, 31);

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Adicionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(180, 420, 110, 31);

        txtNomeMonitor.setToolTipText("Nome do novo monitor - Máximo 30 caracteres");
        jPanel1.add(txtNomeMonitor);
        txtNomeMonitor.setBounds(50, 370, 130, 30);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome:");
        jLabel3.setToolTipText("Nome do novo monitor - Máximo 30 caracteres");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 350, 150, 15);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Adicionar Monitor");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(111, 320, 180, 17);

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("RA:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(200, 350, 90, 15);

        try {
            txtRAmonitor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtRAmonitor);
        txtRAmonitor.setBounds(200, 370, 90, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-20, 0, 420, 510);

        setSize(new java.awt.Dimension(314, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTable1.getSelectedRow() != -1){
            Monitores monitor = new Monitores();
            PetDAO dao = new PetDAO();
            
            monitor.setRAmonitor((String) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            
            dao.deleteMonitor(monitor);
            
            readTabelaMonitores();
        }
        else{
            JOptionPane.showMessageDialog(null, "ERRO: Selecione um monitor para remover.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(nomeMonitorValido(txtNomeMonitor.getText())){
            Monitores monitor = new Monitores();
            PetDAO dao = new PetDAO();
            
            monitor.setRAmonitor(txtRAmonitor.getText());
            monitor.setNomeMonitor(txtNomeMonitor.getText());
            
            dao.saveNewMonitor(monitor);
            
            readTabelaMonitores();
        }else if (!nomeMonitorValido(txtNomeMonitor.getText())){
            JOptionPane.showMessageDialog(null, "ERRO: Insira um nome com, no máximo, 30 caracteres!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPetianos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPetianos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPetianos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPetianos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPetianos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNomeMonitor;
    private javax.swing.JFormattedTextField txtRAmonitor;
    // End of variables declaration//GEN-END:variables
}
