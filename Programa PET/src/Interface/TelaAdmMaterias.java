package Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Materias;
import model.dao.PetDAO;

/**
 * @author Lucas Vieira
 */
public class TelaAdmMaterias extends javax.swing.JFrame {

    /**
     * Creates new form TelaPetianos
     */
    public TelaAdmMaterias() {
        initComponents();
        
        readTabelaMaterias();
    }

    
    public void readTabelaMaterias(){
        DefaultTableModel dtmDados = (DefaultTableModel) jTable1.getModel();
        dtmDados.setNumRows(0);
        
        PetDAO pdao = new PetDAO();

        List<Materias> listaMaterias = new ArrayList<>();
        listaMaterias = pdao.readMaterias();
        Materias materia = new Materias();
        if (!listaMaterias.isEmpty()) {
            PriorityQueue<String> listaOrdenadaMaterias = new PriorityQueue<>();
            for (int i = 0; i < listaMaterias.size(); i++) {
                listaOrdenadaMaterias.add(listaMaterias.get(i).getMateriasCadastradas());
            }

            int tamAux = listaOrdenadaMaterias.size();
            for (int i = 1; i < tamAux + 1; i++) {
                String auxNomeMaterias = listaOrdenadaMaterias.remove();
                dtmDados.addRow(new Object[]{
                auxNomeMaterias
            });
            }
        }
    }
    
    public boolean nomeMateriaValido(String nomeMateria){
        if(nomeMateria.length() > 30){
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
        txtNomeMateria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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
        jLabel2.setText("Matérias");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 40, 170, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Matérias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
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
        jButton1.setBounds(190, 270, 110, 31);

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Adicionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(190, 420, 100, 31);

        txtNomeMateria.setToolTipText("Nome do novo monitor - Máximo 30 caracteres");
        jPanel1.add(txtNomeMateria);
        txtNomeMateria.setBounds(50, 370, 240, 30);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome da Matéria:");
        jLabel3.setToolTipText("Nome do novo monitor - Máximo 30 caracteres");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 350, 230, 15);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Adicionar Matéria");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(111, 320, 180, 17);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-20, 0, 420, 510);

        setSize(new java.awt.Dimension(314, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTable1.getSelectedRow() != -1){
            
            Materias materia = new Materias();
            PetDAO dao = new PetDAO();
            
            materia.setMateriasCadastradas((String) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            
            dao.deleteMateria(materia);
            
            readTabelaMaterias();
        }
        else{
            JOptionPane.showMessageDialog(null, "ERRO: Selecione uma matéria para remover.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(nomeMateriaValido(txtNomeMateria.getText())){
            Materias materia = new Materias();
            PetDAO dao = new PetDAO();
            
            materia.setMateriasCadastradas(txtNomeMateria.getText());
            
            dao.saveNewMateria(materia);
            
            readTabelaMaterias();
        }else if (!nomeMateriaValido(txtNomeMateria.getText())){
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
            java.util.logging.Logger.getLogger(TelaAdmMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdmMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdmMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdmMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmMaterias().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNomeMateria;
    // End of variables declaration//GEN-END:variables
}
