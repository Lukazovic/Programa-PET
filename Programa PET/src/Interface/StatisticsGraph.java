package Interface;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import model.bean.Dados;
import model.bean.EstatisticaMes;
import model.dao.PetDAO;

/*
 * @author Lucas Vieira
 */
public class StatisticsGraph extends javax.swing.JFrame {

    /**
     * Creates new form StatisticsGraph
     */
    public StatisticsGraph(String dataText) {
        initComponents();
        
        EstatisticaMes estMes = calculateEstMes(dataText);
        
        InfoEstMesGraph graficoBarra = new InfoEstMesGraph();
        
        this.jPanel1.setLayout(new BorderLayout());
        
        this.jPanel1.add(graficoBarra.criarGrafico(estMes, dataText));
        pack();
    }
    
    public StatisticsGraph() {
        initComponents();
        
    }
    
    public EstatisticaMes calculateEstMes (String DataText){
        Dados dado = new Dados();
        PetDAO pdao = new PetDAO();
        List<Dados> listaDados = new ArrayList<>();

        listaDados = pdao.searchData(DataText);

        String sAux;
        dado = listaDados.get(0);
        sAux = dado.getDataMonitoria();
        String[] dataB = sAux.split("-");
        EstatisticaMes m = new EstatisticaMes(dataB[0]);
        m.setTotal(listaDados.size());

        for (int i = 0; i < listaDados.size(); i++) {
            sAux = listaDados.get(i).getDataMonitoria();
            String[] dataC = sAux.split("-");
            switch (Integer.parseInt(dataC[1])) {
                case 1:
                    m.setJaneiro(m.getJaneiro() + 1);
                    break;
                case 2:
                    m.setFevereiro(m.getFevereiro() + 1);
                    break;
                case 3:
                    m.setMarco(m.getMarco() + 1);
                    break;
                case 4:
                    m.setAbril(m.getAbril() + 1);
                    break;
                case 5:
                    m.setMaio(m.getMaio() + 1);
                    break;
                case 6:
                    m.setJunho(m.getJunho() + 1);
                    break;
                case 7:
                    m.setJulho(m.getJulho() + 1);
                    break;
                case 8:
                    m.setAgosto(m.getAgosto() + 1);
                    break;
                case 9:
                    m.setSetembro(m.getSetembro() + 1);
                    break;
                case 10:
                    m.setOutubro(m.getOutubro() + 1);
                    break;
                case 11:
                    m.setNovembro(m.getNovembro() + 1);
                    break;
                case 12:
                    m.setDezembro(m.getDezembro() + 1);
                    break;
                default:
                    break;
            }
        }
        
        return m;
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
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gráfico de Estatística por mês - Grupo PET Física");
        setMinimumSize(new java.awt.Dimension(810, 350));
        setPreferredSize(new java.awt.Dimension(730, 300));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 300));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 781, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 950, 450);

        setSize(new java.awt.Dimension(810, 339));
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
            java.util.logging.Logger.getLogger(StatisticsGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatisticsGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatisticsGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatisticsGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatisticsGraph().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
