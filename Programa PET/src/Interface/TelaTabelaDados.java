package Interface;

import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import model.bean.Dados;
import model.dao.PetDAO;

/**
 * @author Lucas Vieira
 */
public class TelaTabelaDados extends javax.swing.JFrame {

    private Object btnSalvarDados;

    /**
     * Creates new form TelaTabelaDados
     */
    public TelaTabelaDados() {
        initComponents();
        readTabelaDados();
    }
    
    public String converterData (String dataS){
        
        String[] dataConvertida = dataS.split("-");
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Calendar data = new GregorianCalendar(Integer.parseInt(dataConvertida[0]), (Integer.parseInt(dataConvertida[1])-1), Integer.parseInt(dataConvertida[2]));
        
        return sdf.format(data.getTime());
    }
    
    public void readTabelaDados (){
        
        String dataCerta;
        DefaultTableModel dtmDados = (DefaultTableModel) jTable1.getModel();
        dtmDados.setNumRows(0);
        PetDAO pdao =  new PetDAO();
        
        for (Dados d: pdao.read()){
            
            dtmDados.addRow(new Object[]{
                d.getContagemMonitoria(),
                d.getNomeMonitor1(),
                d.getNomeMonitor2(),
                d.getNomeMonitor3(),
                d.getNomeMonitor4(),
                d.getNomeAluno(),
                d.getCursoAluno(),
                d.getMateriaAluno(),
                d.getLocalMonitoria(),
                d.getHoraMonitoria(),
                dataCerta = converterData(d.getDataMonitoria())
            });
        }
    }
    
    public void readTabelaDadosForMonitor1 (String monitor){
        String dataCerta;
        DefaultTableModel dtmDados = (DefaultTableModel) jTable1.getModel();
        dtmDados.setNumRows(0);
        PetDAO pdao =  new PetDAO();
        
        for (Dados d: pdao.searchMonitor1(monitor)){
            
            dtmDados.addRow(new Object[]{
                d.getContagemMonitoria(),
                d.getNomeMonitor1(),
                d.getNomeMonitor2(),
                d.getNomeMonitor3(),
                d.getNomeMonitor4(),
                d.getNomeAluno(),
                d.getCursoAluno(),
                d.getMateriaAluno(),
                d.getLocalMonitoria(),
                d.getHoraMonitoria(),
                dataCerta = converterData(d.getDataMonitoria())
            });
        }
    }
    
    
    public void readTabelaDadosForMonitor2 (String monitor){
        String dataCerta;
        DefaultTableModel dtmDados = (DefaultTableModel) jTable1.getModel();
        PetDAO pdao =  new PetDAO();
        
        for (Dados d: pdao.searchMonitor2(monitor)){
            
            dtmDados.addRow(new Object[]{
                d.getContagemMonitoria(),
                d.getNomeMonitor1(),
                d.getNomeMonitor2(),
                d.getNomeMonitor3(),
                d.getNomeMonitor4(),
                d.getNomeAluno(),
                d.getCursoAluno(),
                d.getMateriaAluno(),
                d.getLocalMonitoria(),
                d.getHoraMonitoria(),
                dataCerta = converterData(d.getDataMonitoria())
            });
        }
    }
    
    public void readTabelaDadosForMonitor3 (String monitor){
        String dataCerta;
        DefaultTableModel dtmDados = (DefaultTableModel) jTable1.getModel();
        PetDAO pdao =  new PetDAO();
        
        for (Dados d: pdao.searchMonitor3(monitor)){
            
            dtmDados.addRow(new Object[]{
                d.getContagemMonitoria(),
                d.getNomeMonitor1(),
                d.getNomeMonitor2(),
                d.getNomeMonitor3(),
                d.getNomeMonitor4(),
                d.getNomeAluno(),
                d.getCursoAluno(),
                d.getMateriaAluno(),
                d.getLocalMonitoria(),
                d.getHoraMonitoria(),
                dataCerta = converterData(d.getDataMonitoria())
            });
        }
    }
    
    public void readTabelaDadosForMonitor4 (String monitor){
        String dataCerta;
        DefaultTableModel dtmDados = (DefaultTableModel) jTable1.getModel();
        PetDAO pdao =  new PetDAO();
        
        for (Dados d: pdao.searchMonitor4(monitor)){
            
            dtmDados.addRow(new Object[]{
                d.getContagemMonitoria(),
                d.getNomeMonitor1(),
                d.getNomeMonitor2(),
                d.getNomeMonitor3(),
                d.getNomeMonitor4(),
                d.getNomeAluno(),
                d.getCursoAluno(),
                d.getMateriaAluno(),
                d.getLocalMonitoria(),
                d.getHoraMonitoria(),
                dataCerta = converterData(d.getDataMonitoria())
            });
        }
    }
    
    public void readTabelaDadosForCurso (String curso){
        String dataCerta;
        DefaultTableModel dtmDados = (DefaultTableModel) jTable1.getModel();
        dtmDados.setNumRows(0);
        PetDAO pdao =  new PetDAO();
        
        for (Dados d: pdao.searchCurso(curso)){
            
            dtmDados.addRow(new Object[]{
                d.getContagemMonitoria(),
                d.getNomeMonitor1(),
                d.getNomeMonitor2(),
                d.getNomeMonitor3(),
                d.getNomeMonitor4(),
                d.getNomeAluno(),
                d.getCursoAluno(),
                d.getMateriaAluno(),
                d.getLocalMonitoria(),
                d.getHoraMonitoria(),
                dataCerta = converterData(d.getDataMonitoria())
            });
        }
    }
    
    public void readTabelaDadosForMateria (String materia){
        String dataCerta;
        DefaultTableModel dtmDados = (DefaultTableModel) jTable1.getModel();
        dtmDados.setNumRows(0);
        PetDAO pdao =  new PetDAO();
        
        for (Dados d: pdao.searchMateria(materia)){
            
            dtmDados.addRow(new Object[]{
                d.getContagemMonitoria(),
                d.getNomeMonitor1(),
                d.getNomeMonitor2(),
                d.getNomeMonitor3(),
                d.getNomeMonitor4(),
                d.getNomeAluno(),
                d.getCursoAluno(),
                d.getMateriaAluno(),
                d.getLocalMonitoria(),
                d.getHoraMonitoria(),
                dataCerta = converterData(d.getDataMonitoria())
            });
        }
    }
    
    public void readTabelaDadosForData (String data){
        String dataCerta;
        DefaultTableModel dtmDados = (DefaultTableModel) jTable1.getModel();
        dtmDados.setNumRows(0);
        PetDAO pdao =  new PetDAO();
        
        for (Dados d: pdao.searchData(data)){
            
            dtmDados.addRow(new Object[]{
                d.getContagemMonitoria(),
                d.getNomeMonitor1(),
                d.getNomeMonitor2(),
                d.getNomeMonitor3(),
                d.getNomeMonitor4(),
                d.getNomeAluno(),
                d.getCursoAluno(),
                d.getMateriaAluno(),
                d.getLocalMonitoria(),
                d.getHoraMonitoria(),
                dataCerta = converterData(d.getDataMonitoria())
            });
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBuscaMonitor = new javax.swing.JTextField();
        btnBuscaMonitor = new javax.swing.JButton();
        txtBuscaCurso = new javax.swing.JTextField();
        btnBuscarCurso = new javax.swing.JButton();
        txtBuscaMateria = new javax.swing.JTextField();
        btnBuscaMateria = new javax.swing.JButton();
        btnBuscaMes = new javax.swing.JButton();
        txtBuscaData = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dados - Monitoria PET Física");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setForeground(new java.awt.Color(249, 249, 249));
        jScrollPane3.setToolTipText("");

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID monitoria", "Monitor", "Monitor 2", "Monitor 3", "Monitor 4", "Aluno", "Curso Aluno", "Materia", "Local", "Hora", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 130, 893, 187);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setText("Dados - Monitoria PET Física");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(420, 60, 379, 29);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensPET/LogoPET2.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(240, 10, 118, 118);

        jLabel3.setText("Buscar por Monitor:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(200, 330, 150, 20);

        jLabel4.setText("Buscar por Curso:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(200, 390, 150, 15);

        jLabel5.setText("Buscar por Matéria:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(510, 330, 150, 20);

        jLabel6.setText("Buscar por data:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(510, 390, 150, 15);

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel7.setText("Ano - Mês - Dia");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(530, 440, 90, 13);

        txtBuscaMonitor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaMonitorKeyPressed(evt);
            }
        });
        jPanel2.add(txtBuscaMonitor);
        txtBuscaMonitor.setBounds(200, 350, 125, 30);

        btnBuscaMonitor.setBackground(new java.awt.Color(0, 0, 255));
        btnBuscaMonitor.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscaMonitor.setText("Buscar");
        btnBuscaMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaMonitorActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscaMonitor);
        btnBuscaMonitor.setBounds(340, 350, 80, 30);

        txtBuscaCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaCursoKeyPressed(evt);
            }
        });
        jPanel2.add(txtBuscaCurso);
        txtBuscaCurso.setBounds(200, 410, 125, 30);

        btnBuscarCurso.setBackground(new java.awt.Color(0, 0, 255));
        btnBuscarCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCurso.setText("Buscar");
        btnBuscarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCursoActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarCurso);
        btnBuscarCurso.setBounds(340, 410, 80, 30);

        txtBuscaMateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaMateriaKeyPressed(evt);
            }
        });
        jPanel2.add(txtBuscaMateria);
        txtBuscaMateria.setBounds(510, 350, 120, 30);

        btnBuscaMateria.setBackground(new java.awt.Color(0, 0, 255));
        btnBuscaMateria.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscaMateria.setText("Buscar");
        btnBuscaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaMateriaActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscaMateria);
        btnBuscaMateria.setBounds(650, 350, 80, 30);

        btnBuscaMes.setBackground(new java.awt.Color(0, 0, 255));
        btnBuscaMes.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscaMes.setText("Buscar");
        btnBuscaMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaMesActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscaMes);
        btnBuscaMes.setBounds(650, 410, 80, 30);

        txtBuscaData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaDataKeyPressed(evt);
            }
        });
        jPanel2.add(txtBuscaData);
        txtBuscaData.setBounds(510, 410, 120, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 920, 470);

        setSize(new java.awt.Dimension(920, 492));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscaMonitorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaMonitorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            readTabelaDadosForMonitor1(txtBuscaMonitor.getText());
            readTabelaDadosForMonitor2(txtBuscaMonitor.getText());
            readTabelaDadosForMonitor3(txtBuscaMonitor.getText());
            readTabelaDadosForMonitor4(txtBuscaMonitor.getText());
        }
    }//GEN-LAST:event_txtBuscaMonitorKeyPressed

    private void btnBuscaMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaMonitorActionPerformed
        readTabelaDadosForMonitor1(txtBuscaMonitor.getText());
        readTabelaDadosForMonitor2(txtBuscaMonitor.getText());
    }//GEN-LAST:event_btnBuscaMonitorActionPerformed

    private void txtBuscaCursoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaCursoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            readTabelaDadosForCurso(txtBuscaCurso.getText());
        }
    }//GEN-LAST:event_txtBuscaCursoKeyPressed

    private void btnBuscarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCursoActionPerformed
        readTabelaDadosForCurso(txtBuscaCurso.getText());
    }//GEN-LAST:event_btnBuscarCursoActionPerformed

    private void txtBuscaMateriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaMateriaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            readTabelaDadosForMateria(txtBuscaMateria.getText());
        }
    }//GEN-LAST:event_txtBuscaMateriaKeyPressed

    private void btnBuscaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaMateriaActionPerformed
        readTabelaDadosForMateria(txtBuscaMateria.getText());
    }//GEN-LAST:event_btnBuscaMateriaActionPerformed

    private void btnBuscaMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaMesActionPerformed
        readTabelaDadosForData(txtBuscaData.getText());
    }//GEN-LAST:event_btnBuscaMesActionPerformed

    private void txtBuscaDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaDataKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            readTabelaDadosForData(txtBuscaData.getText());
        }
    }//GEN-LAST:event_txtBuscaDataKeyPressed

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
            java.util.logging.Logger.getLogger(TelaTabelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTabelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTabelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTabelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTabelaDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscaMateria;
    private javax.swing.JButton btnBuscaMes;
    private javax.swing.JButton btnBuscaMonitor;
    private javax.swing.JButton btnBuscarCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscaCurso;
    private javax.swing.JTextField txtBuscaData;
    private javax.swing.JTextField txtBuscaMateria;
    private javax.swing.JTextField txtBuscaMonitor;
    // End of variables declaration//GEN-END:variables
}
