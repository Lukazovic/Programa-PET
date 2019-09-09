package Interface;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import model.bean.Dados;
import model.bean.EstatisticaMes;
import model.dao.PetDAO;
import java.time.LocalDate;
import java.time.LocalTime;
import model.bean.EstatisticasDiaSem;

/**
 * @author Lucas
 */
public class TelaEstDiaSemanaTabela extends javax.swing.JFrame {

    /**
     * Creates new form TelaEstMesTabela
     */
    
    private String DataText;
    private Object btnEstatisticaMesTabela;
    
    public TelaEstDiaSemanaTabela(String dataText, int mesProcurado) {
        initComponents();
        showMonth(mesProcurado);
        jLabelAno.setText(dataText);
        mostrarEstatisticasTMes(dataText, mesProcurado);
    }
    
    public TelaEstDiaSemanaTabela() {
        initComponents();
    }
    
    public void mostrarEstatisticasTMes(String DataText, int mesProcurado){
        
        Dados dado = new Dados();
        PetDAO pdao =  new PetDAO();
        List<Dados> listaDados = new ArrayList<>();
        
        
        listaDados = pdao.searchData(DataText);
        int tamanhoAux = listaDados.size();
        
        String sAux;
        dado = listaDados.get(0);
        sAux = dado.getDataMonitoria();
        String[] dataB = sAux.split("-");
        EstatisticasDiaSem diaSemana = new EstatisticasDiaSem(Integer.parseInt(dataB[1]));
        diaSemana.setTotal(listaDados.size());
        
        //Filtrando datas por mês
        List<Dados> listaDados2 = new ArrayList<>();
        if(mesProcurado != 0){
            for (int i=0; i<listaDados.size(); i++){
                sAux = dado.getDataMonitoria();
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
        int count = 0;
        for(int i=0; i<listaDados2.size(); i++){
            count++;
            sAux = listaDados2.get(i).getDataMonitoria();
            String[] dataC = sAux.split("-");
            LocalDate dataTesteSemana = LocalDate.of(Integer.parseInt(dataC[0]), Integer.parseInt(dataC[1]), Integer.parseInt(dataC[2]));
            
            switch (dataTesteSemana.getDayOfWeek().getValue()){
                case 1:
                    diaSemana.setSegunda(diaSemana.getSegunda() +1);
                    break;
                case 2:
                    diaSemana.setTerca(diaSemana.getTerca()+1);
                    break;
                case 3:
                    diaSemana.setQuarta(diaSemana.getQuarta()+1);
                    break;
                case 4:
                    diaSemana.setQuinta(diaSemana.getQuinta()+1);
                    break;
                case 5:
                    diaSemana.setSexta(diaSemana.getSexta()+1);
                    break;
                case 6:
                    diaSemana.setSabado(diaSemana.getSabado()+1);
                    break;
                case 7:
                    diaSemana.setDomingo(diaSemana.getDomingo()+1);
            }
        }
        
        double mt, m1, m2, m3, m4, m5, m6, m7;
        mt = diaSemana.getTotal();
        m1 = diaSemana.getDomingo();
        m2 = diaSemana.getSegunda();
        m3 = diaSemana.getTerca();
        m4 = diaSemana.getQuarta();
        m5 = diaSemana.getQuinta();
        m6 = diaSemana.getSexta();
        m7 = diaSemana.getSabado();
        
        m1 = m1/mt;
        m2 = m2/mt;
        m3 = m3/mt;
        m4 = m4/mt;
        m5 = m5/mt;
        m6 = m6/mt;
        m7 = m7/mt;
        
        jLabelDom.setText(NumberFormat.getPercentInstance().format(m1));
        jLabelSeg.setText(NumberFormat.getPercentInstance().format(m2));
        jLabelTer.setText(NumberFormat.getPercentInstance().format(m3));
        jLabelQuar.setText(NumberFormat.getPercentInstance().format(m4));
        jLabelQui.setText(NumberFormat.getPercentInstance().format(m5));
        jLabelSex.setText(NumberFormat.getPercentInstance().format(m6));
        jLabelSab.setText(NumberFormat.getPercentInstance().format(m7));
        jLabelContagem.setText(String.valueOf(count +" Monitorias contadas"));
        
    }
    
    private void showMonth (int mesEscolhido){
        switch(mesEscolhido){
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
        jLabelMes = new javax.swing.JLabel();
        jLabelDom1 = new javax.swing.JLabel();
        jLabelSeg1 = new javax.swing.JLabel();
        jLabelTer1 = new javax.swing.JLabel();
        jLabelQua1 = new javax.swing.JLabel();
        jLabelQui1 = new javax.swing.JLabel();
        jLabelSex1 = new javax.swing.JLabel();
        jLabelSex = new javax.swing.JLabel();
        jLabelDom = new javax.swing.JLabel();
        jLabelSeg = new javax.swing.JLabel();
        jLabelTer = new javax.swing.JLabel();
        jLabelQuar = new javax.swing.JLabel();
        jLabelQui = new javax.swing.JLabel();
        jLabelAno = new javax.swing.JLabel();
        jLabelSab1 = new javax.swing.JLabel();
        jLabelSab = new javax.swing.JLabel();
        jLabelContagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensPET/LogoPET2.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 100, 110);

        jLabelMes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMes.setText("Dezembro");
        jPanel1.add(jLabelMes);
        jLabelMes.setBounds(140, 40, 160, 30);

        jLabelDom1.setText("Domingo:");
        jPanel1.add(jLabelDom1);
        jLabelDom1.setBounds(90, 140, 60, 14);

        jLabelSeg1.setText("Segunda:");
        jPanel1.add(jLabelSeg1);
        jLabelSeg1.setBounds(90, 160, 60, 14);

        jLabelTer1.setText("Terça:");
        jPanel1.add(jLabelTer1);
        jLabelTer1.setBounds(90, 180, 60, 14);

        jLabelQua1.setText("Quarta:");
        jPanel1.add(jLabelQua1);
        jLabelQua1.setBounds(90, 200, 60, 14);

        jLabelQui1.setText("Quinta:");
        jPanel1.add(jLabelQui1);
        jLabelQui1.setBounds(90, 220, 60, 14);

        jLabelSex1.setText("Sexta:");
        jPanel1.add(jLabelSex1);
        jLabelSex1.setBounds(90, 240, 60, 14);

        jLabelSex.setText("jLabel8");
        jPanel1.add(jLabelSex);
        jLabelSex.setBounds(170, 240, 34, 14);

        jLabelDom.setText("jLabel3");
        jPanel1.add(jLabelDom);
        jLabelDom.setBounds(170, 140, 34, 14);

        jLabelSeg.setText("jLabel4");
        jPanel1.add(jLabelSeg);
        jLabelSeg.setBounds(170, 160, 34, 14);

        jLabelTer.setText("jLabel5");
        jPanel1.add(jLabelTer);
        jLabelTer.setBounds(170, 180, 34, 14);

        jLabelQuar.setText("jLabel6");
        jPanel1.add(jLabelQuar);
        jLabelQuar.setBounds(170, 200, 34, 14);

        jLabelQui.setText("jLabel7");
        jPanel1.add(jLabelQui);
        jLabelQui.setBounds(170, 220, 34, 14);

        jLabelAno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelAno.setText("2019");
        jPanel1.add(jLabelAno);
        jLabelAno.setBounds(170, 80, 50, 22);

        jLabelSab1.setText("Sábado:");
        jPanel1.add(jLabelSab1);
        jLabelSab1.setBounds(90, 260, 60, 14);

        jLabelSab.setText("jLabel10");
        jPanel1.add(jLabelSab);
        jLabelSab.setBounds(170, 260, 40, 14);

        jLabelContagem.setText("jLabel2");
        jPanel1.add(jLabelContagem);
        jLabelContagem.setBounds(110, 300, 160, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 320, 360);

        setSize(new java.awt.Dimension(321, 366));
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
            java.util.logging.Logger.getLogger(TelaEstDiaSemanaTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstDiaSemanaTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstDiaSemanaTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstDiaSemanaTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstDiaSemanaTabela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAno;
    private javax.swing.JLabel jLabelContagem;
    private javax.swing.JLabel jLabelDom;
    private javax.swing.JLabel jLabelDom1;
    private javax.swing.JLabel jLabelMes;
    private javax.swing.JLabel jLabelQua1;
    private javax.swing.JLabel jLabelQuar;
    private javax.swing.JLabel jLabelQui;
    private javax.swing.JLabel jLabelQui1;
    private javax.swing.JLabel jLabelSab;
    private javax.swing.JLabel jLabelSab1;
    private javax.swing.JLabel jLabelSeg;
    private javax.swing.JLabel jLabelSeg1;
    private javax.swing.JLabel jLabelSex;
    private javax.swing.JLabel jLabelSex1;
    private javax.swing.JLabel jLabelTer;
    private javax.swing.JLabel jLabelTer1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
