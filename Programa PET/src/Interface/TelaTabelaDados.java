package Interface;

import javax.swing.table.DefaultTableModel;
import Interface.TelaTabelaDados;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import model.bean.Dados;
import model.dao.PetDAO;

/**
 *
 * @author Lucas
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
        
        //LocalDate dataCerta = LocalDate.of(Integer.parseInt(dataConvertida[2]), Integer.parseInt(dataConvertida[1]), Integer.parseInt(dataConvertida[0]));
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Calendar data = new GregorianCalendar(Integer.parseInt(dataConvertida[0]), (Integer.parseInt(dataConvertida[1])-1), Integer.parseInt(dataConvertida[2]));
        
        //return dataCerta.toString();
        return sdf.format(data.getTime());
    }
    
    public void readTabelaDados (){
        //DefaultTableModel dtmDados = (DefaultTableModel) btnSalvarDados.getModel();
        
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
        //DefaultTableModel dtmDados = (DefaultTableModel) btnSalvarDados.getModel();
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
        //DefaultTableModel dtmDados = (DefaultTableModel) btnSalvarDados.getModel();
        String dataCerta;
        DefaultTableModel dtmDados = (DefaultTableModel) jTable1.getModel();
        //dtmDados.setNumRows(0);
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
        //DefaultTableModel dtmDados = (DefaultTableModel) btnSalvarDados.getModel();
        String dataCerta;
        DefaultTableModel dtmDados = (DefaultTableModel) jTable1.getModel();
        //dtmDados.setNumRows(0);
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
        //DefaultTableModel dtmDados = (DefaultTableModel) btnSalvarDados.getModel();
        String dataCerta;
        DefaultTableModel dtmDados = (DefaultTableModel) jTable1.getModel();
        //dtmDados.setNumRows(0);
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
        //DefaultTableModel dtmDados = (DefaultTableModel) btnSalvarDados.getModel();
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
        //DefaultTableModel dtmDados = (DefaultTableModel) btnSalvarDados.getModel();
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
        //DefaultTableModel dtmDados = (DefaultTableModel) btnSalvarDados.getModel();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscaMonitor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscaMonitor = new javax.swing.JButton();
        txtBuscaCurso = new javax.swing.JTextField();
        btnBuscarCurso = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBuscaMateria = new javax.swing.JTextField();
        btnBuscaMateria = new javax.swing.JButton();
        btnBuscaMes = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBuscaData = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dados - Monitoria PET Física");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(249, 249, 249));
        jScrollPane1.setToolTipText("");

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Contagem", "Monitor", "Monitor 2", "Monitor 3", "Monitor 4", "Aluno", "Curso Aluno", "Materia", "Local", "Hora", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 156, 893, 187);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensPET/LogoPET.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(222, 16, 118, 114);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setText("Dados - Monitoria PET Física");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(358, 59, 334, 32);

        txtBuscaMonitor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaMonitorKeyPressed(evt);
            }
        });
        getContentPane().add(txtBuscaMonitor);
        txtBuscaMonitor.setBounds(210, 380, 125, 30);

        jLabel3.setText("Buscar por Monitor:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 360, 120, 14);

        btnBuscaMonitor.setBackground(new java.awt.Color(0, 0, 255));
        btnBuscaMonitor.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscaMonitor.setText("Buscar");
        btnBuscaMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaMonitorActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscaMonitor);
        btnBuscaMonitor.setBounds(340, 380, 80, 30);

        txtBuscaCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaCursoKeyPressed(evt);
            }
        });
        getContentPane().add(txtBuscaCurso);
        txtBuscaCurso.setBounds(210, 440, 125, 30);

        btnBuscarCurso.setBackground(new java.awt.Color(0, 0, 255));
        btnBuscarCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCurso.setText("Buscar");
        btnBuscarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCursoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarCurso);
        btnBuscarCurso.setBounds(340, 440, 80, 30);

        jLabel4.setText("Buscar por Curso:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 420, 120, 14);

        txtBuscaMateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaMateriaKeyPressed(evt);
            }
        });
        getContentPane().add(txtBuscaMateria);
        txtBuscaMateria.setBounds(500, 380, 125, 30);

        btnBuscaMateria.setBackground(new java.awt.Color(0, 0, 255));
        btnBuscaMateria.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscaMateria.setText("Buscar");
        btnBuscaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaMateriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscaMateria);
        btnBuscaMateria.setBounds(630, 380, 80, 30);

        btnBuscaMes.setBackground(new java.awt.Color(0, 0, 255));
        btnBuscaMes.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscaMes.setText("Buscar");
        btnBuscaMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaMesActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscaMes);
        btnBuscaMes.setBounds(630, 440, 80, 30);

        jLabel5.setText("Buscar por Matéria:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(500, 360, 120, 14);

        jLabel6.setText("Buscar por data:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(500, 420, 120, 14);

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel7.setText("Ano - Mês - Dia");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(520, 470, 90, 14);

        txtBuscaData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaDataKeyPressed(evt);
            }
        });
        getContentPane().add(txtBuscaData);
        txtBuscaData.setBounds(500, 440, 120, 30);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 10, 10);

        setSize(new java.awt.Dimension(921, 534));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscaMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaMonitorActionPerformed
        readTabelaDadosForMonitor1(txtBuscaMonitor.getText());
        readTabelaDadosForMonitor2(txtBuscaMonitor.getText());
    }//GEN-LAST:event_btnBuscaMonitorActionPerformed

    private void btnBuscarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCursoActionPerformed
        readTabelaDadosForCurso(txtBuscaCurso.getText());
    }//GEN-LAST:event_btnBuscarCursoActionPerformed

    private void btnBuscaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaMateriaActionPerformed
        readTabelaDadosForMateria(txtBuscaMateria.getText());
    }//GEN-LAST:event_btnBuscaMateriaActionPerformed

    private void btnBuscaMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaMesActionPerformed
        readTabelaDadosForData(txtBuscaData.getText());
    }//GEN-LAST:event_btnBuscaMesActionPerformed

    private void txtBuscaMonitorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaMonitorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            readTabelaDadosForMonitor1(txtBuscaMonitor.getText());
            readTabelaDadosForMonitor2(txtBuscaMonitor.getText());
            readTabelaDadosForMonitor3(txtBuscaMonitor.getText());
            readTabelaDadosForMonitor4(txtBuscaMonitor.getText());
        }
    }//GEN-LAST:event_txtBuscaMonitorKeyPressed

    private void txtBuscaCursoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaCursoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            readTabelaDadosForCurso(txtBuscaCurso.getText());
        }
    }//GEN-LAST:event_txtBuscaCursoKeyPressed

    private void txtBuscaMateriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaMateriaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            readTabelaDadosForMateria(txtBuscaMateria.getText());
        }
    }//GEN-LAST:event_txtBuscaMateriaKeyPressed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscaCurso;
    private javax.swing.JTextField txtBuscaData;
    private javax.swing.JTextField txtBuscaMateria;
    private javax.swing.JTextField txtBuscaMonitor;
    // End of variables declaration//GEN-END:variables
}
