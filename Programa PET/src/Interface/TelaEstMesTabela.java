/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.bean.Dados;
import model.bean.EstatisticaMes;
import model.dao.PetDAO;

/**
 *
 * @author Lucas
 */
public class TelaEstMesTabela extends javax.swing.JFrame {

    /**
     * Creates new form TelaEstMesTabela
     */
    
    private String DataText;
    private Object btnEstatisticaMesTabela;
    
    public TelaEstMesTabela(String dataText) {
        initComponents();
        mostrarEstatisticasTMes(dataText);
    }
    
    public TelaEstMesTabela() {
        initComponents();
    }
    
    public void mostrarEstatisticasTMes(String DataText){
        Dados dado = new Dados();
        PetDAO pdao =  new PetDAO();
        List<Dados> listaDados = new ArrayList<>();
        
        
        listaDados = pdao.searchData(DataText);
        
        String sAux;
        dado = listaDados.get(0);
        sAux = dado.getDataMonitoria();
        String[] dataB = sAux.split("-");
        EstatisticaMes m = new EstatisticaMes(dataB[0]);
        m.setTotal(listaDados.size());
        
        
        for (int i=0; i<listaDados.size(); i++){
            sAux = listaDados.get(i).getDataMonitoria();
            String[] dataC = sAux.split("-");
            switch (Integer.parseInt(dataC[1])) {
                case 1:
                    m.setJaneiro(m.getJaneiro()+1);
                    break;
                case 2:
                    m.setFevereiro(m.getFevereiro()+1);
                    break;
                case 3:
                    m.setMarco(m.getMarco()+1);
                    break;
                case 4:
                    m.setAbril(m.getAbril()+1);
                    break;
                case 5:
                    m.setMaio(m.getMaio()+1);
                    break;
                case 6:
                    m.setJunho(m.getJunho()+1);
                    break;
                case 7:
                    m.setJulho(m.getJulho()+1);
                    break;
                case 8:
                    m.setAgosto(m.getAgosto()+1);
                    break;
                case 9:
                    m.setSetembro(m.getSetembro()+1);
                    break;
                case 10:
                    m.setOutubro(m.getOutubro()+1);
                    break;
                case 11:
                    m.setNovembro(m.getNovembro()+1);
                    break;
                case 12:
                    m.setDezembro(m.getDezembro()+1);
                    break;
                default:
                    break;
            }
            
        }
        double mt, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12;
        mt = m.getTotal();
        m1 = m.getJaneiro();
        m2 = m.getFevereiro();
        m3 = m.getMarco();
        m4 = m.getAbril();
        m5 = m.getMaio();
        m6 = m.getJunho();
        m7 = m.getJulho();
        m8 = m.getAgosto();
        m9 = m.getSetembro();
        m10 = m.getOutubro(); 
        m11 = m.getNovembro();
        m12 = m.getDezembro();
        
        
        m1 = m1/mt;
        m2 = m2/mt;
        m3 = m3/mt;
        m4 = m4/mt;
        m5 = m5/mt;
        m6 = m6/mt;
        m7 = m7/mt;
        m8 = m8/mt;
        m9 = m9/mt;
        m10 = m10/mt;
        m11 = m11/mt;
        m12 = m12/mt;
        
        /*NumberFormat.getPercentInstance().format(m1);
        NumberFormat.getPercentInstance().format(m2);
        NumberFormat.getPercentInstance().format(m3);
        NumberFormat.getPercentInstance().format(m4);
        NumberFormat.getPercentInstance().format(m5);
        NumberFormat.getPercentInstance().format(m6);
        NumberFormat.getPercentInstance().format(m7);
        NumberFormat.getPercentInstance().format(m8);
        NumberFormat.getPercentInstance().format(m9);
        NumberFormat.getPercentInstance().format(m10);
        NumberFormat.getPercentInstance().format(m11);
        NumberFormat.getPercentInstance().format(m12);*/
        
        jLabelJan.setText(NumberFormat.getPercentInstance().format(m1));
        jLabelFev.setText(NumberFormat.getPercentInstance().format(m2));
        jLabelMar.setText(NumberFormat.getPercentInstance().format(m3));
        jLabelAbr.setText(NumberFormat.getPercentInstance().format(m4));
        jLabelMai.setText(NumberFormat.getPercentInstance().format(m5));
        jLabelJun.setText(NumberFormat.getPercentInstance().format(m6));
        jLabelJul.setText(NumberFormat.getPercentInstance().format(m7));
        jLabelAgo.setText(NumberFormat.getPercentInstance().format(m8));
        jLabelSet.setText(NumberFormat.getPercentInstance().format(m9));
        jLabelOut.setText(NumberFormat.getPercentInstance().format(m10));
        jLabelNov.setText(NumberFormat.getPercentInstance().format(m11));
        jLabelDez.setText(NumberFormat.getPercentInstance().format(m12));
        
        //jLabelJan.setText(sAux);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelJun = new javax.swing.JLabel();
        jLabelJan = new javax.swing.JLabel();
        jLabelFev = new javax.swing.JLabel();
        jLabelMar = new javax.swing.JLabel();
        jLabelAbr = new javax.swing.JLabel();
        jLabelMai = new javax.swing.JLabel();
        jLabelDez1 = new javax.swing.JLabel();
        jLabelJul1 = new javax.swing.JLabel();
        jLabelAgo1 = new javax.swing.JLabel();
        jLabelSet1 = new javax.swing.JLabel();
        jLabelOut1 = new javax.swing.JLabel();
        jLabelNov1 = new javax.swing.JLabel();
        jLabelDez = new javax.swing.JLabel();
        jLabelJul = new javax.swing.JLabel();
        jLabelAgo = new javax.swing.JLabel();
        jLabelSet = new javax.swing.JLabel();
        jLabelOut = new javax.swing.JLabel();
        jLabelNov = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensPET/LogoPET2.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 20, 110, 110);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Mês");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 50, 120, 30);

        jLabel3.setText("Janeiro:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 140, 50, 14);

        jLabel4.setText("Feveiro:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 160, 50, 14);

        jLabel5.setText("Março:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 180, 50, 14);

        jLabel6.setText("Abril:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 200, 50, 14);

        jLabel7.setText("Maio:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 220, 50, 14);

        jLabel8.setText("Julho:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 240, 29, 14);

        jLabelJun.setText("jLabel8");
        jPanel1.add(jLabelJun);
        jLabelJun.setBounds(130, 240, 34, 14);

        jLabelJan.setText("jLabel3");
        jPanel1.add(jLabelJan);
        jLabelJan.setBounds(130, 140, 34, 14);

        jLabelFev.setText("jLabel4");
        jPanel1.add(jLabelFev);
        jLabelFev.setBounds(130, 160, 34, 14);

        jLabelMar.setText("jLabel5");
        jPanel1.add(jLabelMar);
        jLabelMar.setBounds(130, 180, 34, 14);

        jLabelAbr.setText("jLabel6");
        jPanel1.add(jLabelAbr);
        jLabelAbr.setBounds(130, 200, 34, 14);

        jLabelMai.setText("jLabel7");
        jPanel1.add(jLabelMai);
        jLabelMai.setBounds(130, 220, 34, 14);

        jLabelDez1.setText("Dezembro:");
        jPanel1.add(jLabelDez1);
        jLabelDez1.setBounds(220, 240, 60, 14);

        jLabelJul1.setText("Julho:");
        jPanel1.add(jLabelJul1);
        jLabelJul1.setBounds(220, 140, 60, 14);

        jLabelAgo1.setText("Agosto:");
        jPanel1.add(jLabelAgo1);
        jLabelAgo1.setBounds(220, 160, 60, 14);

        jLabelSet1.setText("Setembro:");
        jPanel1.add(jLabelSet1);
        jLabelSet1.setBounds(220, 180, 60, 14);

        jLabelOut1.setText("Outubro:");
        jPanel1.add(jLabelOut1);
        jLabelOut1.setBounds(220, 200, 60, 14);

        jLabelNov1.setText("Novembro:");
        jPanel1.add(jLabelNov1);
        jLabelNov1.setBounds(220, 220, 60, 14);

        jLabelDez.setText("jLabel8");
        jPanel1.add(jLabelDez);
        jLabelDez.setBounds(300, 240, 34, 14);

        jLabelJul.setText("jLabel3");
        jPanel1.add(jLabelJul);
        jLabelJul.setBounds(300, 140, 34, 14);

        jLabelAgo.setText("jLabel4");
        jPanel1.add(jLabelAgo);
        jLabelAgo.setBounds(300, 160, 34, 14);

        jLabelSet.setText("jLabel5");
        jPanel1.add(jLabelSet);
        jLabelSet.setBounds(300, 180, 34, 14);

        jLabelOut.setText("jLabel6");
        jPanel1.add(jLabelOut);
        jLabelOut.setBounds(300, 200, 34, 14);

        jLabelNov.setText("jLabel7");
        jPanel1.add(jLabelNov);
        jLabelNov.setBounds(300, 220, 34, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(398, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaEstMesTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstMesTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstMesTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstMesTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstMesTabela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAbr;
    private javax.swing.JLabel jLabelAgo;
    private javax.swing.JLabel jLabelAgo1;
    private javax.swing.JLabel jLabelDez;
    private javax.swing.JLabel jLabelDez1;
    private javax.swing.JLabel jLabelFev;
    private javax.swing.JLabel jLabelJan;
    private javax.swing.JLabel jLabelJul;
    private javax.swing.JLabel jLabelJul1;
    private javax.swing.JLabel jLabelJun;
    private javax.swing.JLabel jLabelMai;
    private javax.swing.JLabel jLabelMar;
    private javax.swing.JLabel jLabelNov;
    private javax.swing.JLabel jLabelNov1;
    private javax.swing.JLabel jLabelOut;
    private javax.swing.JLabel jLabelOut1;
    private javax.swing.JLabel jLabelSet;
    private javax.swing.JLabel jLabelSet1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}