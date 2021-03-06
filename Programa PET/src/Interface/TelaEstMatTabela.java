package Interface;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.bean.Dados;
import model.bean.EstatisticaMateria;
import model.bean.Materias;
import model.dao.PetDAO;

/**
 * @author Lucas Vieira
 */
public class TelaEstMatTabela extends javax.swing.JFrame {

    /**
     * Creates new form TelaEstMatTabela
     */
    public TelaEstMatTabela() {
        initComponents();
    }

    public TelaEstMatTabela(String dataText, int mesProcurado) {
        initComponents();
        showMonth(mesProcurado);
        jLabelAno.setText(dataText);
        mostrarEstatisticasMateria(dataText, mesProcurado);

    }

    public void mostrarEstatisticasMateria(String DataText, int mesProcurado) {
        Dados dado = new Dados();
        PetDAO pdao = new PetDAO();
        List<Dados> listaDados = new ArrayList<>();

        listaDados = pdao.searchData(DataText);

        Materias dadosDaMateria = new Materias();
        List<Materias> listaMaterias = new ArrayList<>();
        listaMaterias = pdao.readMaterias();

        String sAux;
        List<EstatisticaMateria> listEstMaterias = new ArrayList<>();
        
        //Filtrando datas por mês
        List<Dados> listaDados2 = new ArrayList<>();
        if(mesProcurado != 0){
            for (int i=0; i<listaDados.size(); i++){
                sAux = listaDados.get(i).getDataMonitoria();
                String[] dataC = sAux.split("-");
                if(Integer.parseInt(dataC[1]) == mesProcurado){
                    listaDados2.add(listaDados.get(i));
                }
            }
        }else{
            for (int i=0; i<listaDados.size(); i++){
                listaDados2.add(listaDados.get(i));
            }
        }
        
        int tamanhoAux = listaMaterias.size();
        for (int i = 0; i < tamanhoAux; i++) {
            EstatisticaMateria estMateria = new EstatisticaMateria();
            estMateria.setNomeMateria(listaMaterias.get(i).getMateriasCadastradas());
            listEstMaterias.add(estMateria);
        }

        String nomeAux;
        int tamanhoAux2 = listaDados2.size();
        for (int i = 0; i < listaDados2.size(); i++) {
            dado = listaDados2.get(i);
            for (int j = 0; j < listEstMaterias.size(); j++) {
                if (dado.getMateriaAluno().equals(listEstMaterias.get(j).getNomeMateria())) {
                    listEstMaterias.get(j).setQuantidadeMateria(listEstMaterias.get(j).getQuantidadeMateria() + 1);
                }
            }
        }

        DefaultTableModel dtmMonitorias = (DefaultTableModel) jTableMonitorias.getModel();
        dtmMonitorias.setRowCount(0);

        tamanhoAux = listEstMaterias.size();
        for (int i = 0; i < tamanhoAux; i++) {
            if (listEstMaterias.get(i).getQuantidadeMateria() != 0) {
                float estatisticaPorcentagem = listEstMaterias.get(i).getQuantidadeMateria();
                estatisticaPorcentagem = estatisticaPorcentagem / listaDados2.size();
                dtmMonitorias.addRow(new Object[]{
                    listEstMaterias.get(i).getNomeMateria(),
                    listEstMaterias.get(i).getQuantidadeMateria(),
                    NumberFormat.getPercentInstance().format(estatisticaPorcentagem)
                });
            }
        }
        mostrarTotalMonitorias(listaDados2.size());

    }

    private void mostrarTotalMonitorias(int totalMonitorias) {
        DefaultTableModel dtmMonitorias = (DefaultTableModel) jTableMonitorias.getModel();
        dtmMonitorias.addRow(new Object[]{
            "Total",
            totalMonitorias,
            NumberFormat.getPercentInstance().format(1)
        });
    }

    private void showMonth(int mesEscolhido) {
        switch (mesEscolhido) {
            case 0:
                jLabelMes.setText("Ano Inteiro");
                break;
            case 1:
                jLabelMes.setText("Janeiro");
                break;
            case 2:
                jLabelMes.setText("Fevereiro");
                break;
            case 3:
                jLabelMes.setText("Março");
                break;
            case 4:
                jLabelMes.setText("Abril");
                break;
            case 5:
                jLabelMes.setText("Maio");
                break;
            case 6:
                jLabelMes.setText("Junho");
                break;
            case 7:
                jLabelMes.setText("Julho");
                break;
            case 8:
                jLabelMes.setText("Agosto");
                break;
            case 9:
                jLabelMes.setText("Setembro");
                break;
            case 10:
                jLabelMes.setText("Outubro");
                break;
            case 11:
                jLabelMes.setText("Novembro");
                break;
            case 12:
                jLabelMes.setText("Dezembro");
                break;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMes = new javax.swing.JLabel();
        jLabelAno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMonitorias = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensPET/LogoPET3.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 130, 120);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Estatísticas por Semana");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 20, 260, 22);

        jLabelMes.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelMes.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMes.setText("jLabel3");
        jPanel1.add(jLabelMes);
        jLabelMes.setBounds(210, 60, 140, 17);

        jLabelAno.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelAno.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAno.setText("jLabel3");
        jPanel1.add(jLabelAno);
        jLabelAno.setBounds(230, 90, 100, 17);

        jTableMonitorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Matéria", "Monitorias", "Monitorias (%)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableMonitorias);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 380, 170);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 310);

        setSize(new java.awt.Dimension(411, 333));
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
            java.util.logging.Logger.getLogger(TelaEstMatTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstMatTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstMatTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstMatTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstMatTabela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAno;
    private javax.swing.JLabel jLabelMes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMonitorias;
    // End of variables declaration//GEN-END:variables
}
