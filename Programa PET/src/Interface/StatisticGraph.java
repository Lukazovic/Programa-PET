package Interface;

import java.awt.BorderLayout;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.bean.Dados;
import model.bean.EstatisticaMateria;
import model.bean.EstatisticaMes;
import model.bean.EstatisticasDiaSem;
import model.bean.Materias;
import model.dao.PetDAO;

/*
 * @author Lucas Vieira
 */
public class StatisticGraph extends javax.swing.JFrame {

    /**
     * Creates new form StatisticsGraph
     */
    public StatisticGraph(String dataText, int mesProcurado, int option) {
        initComponents();
        
        switch (option){
            case 1:
                showGraphByMateria(dataText, mesProcurado);
                break;
            case 2:
                showGraphByDayOfWeek(dataText, mesProcurado);
                break;
            case 3:
                showGraphByMonth(dataText);
                break;
        }
    }
    
    public StatisticGraph() {
        initComponents();
        
    }
    
    private void showGraphByMonth(String dataText){
        EstatisticaMes estMes = calculateEstMes(dataText);
        
        InfoEstMesGraph graficoBarra = new InfoEstMesGraph();
        
        this.jPanel1.setLayout(new BorderLayout());
        
        this.jPanel1.add(graficoBarra.criarGrafico(estMes, dataText));
        pack();
    }
    
    private EstatisticaMes calculateEstMes (String DataText){
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
    
    private EstatisticasDiaSem calculateDiaSemana (String DataText, int mesProcurado){
        
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
        
        return diaSemana;
    }
    
    private void showGraphByDayOfWeek(String dataText, int mesProcurado){
        EstatisticasDiaSem estMes = calculateDiaSemana(dataText, mesProcurado);
        
        InfoEstDiaSemGraph graficoBarra = new InfoEstDiaSemGraph();
        
        this.jPanel1.setLayout(new BorderLayout());
        
        String aux = setNameMes(mesProcurado);
        
        this.jPanel1.add(graficoBarra.criarGrafico(estMes, aux+dataText));
        pack();
    }
    
    private String setNameMes(int mesProcurado){
        switch(mesProcurado){
            case 0:
                return "Ano Inteiro - ";
            case 1:
                return "Janeiro - ";
            case 2:
                return "Fevereiro - ";
            case 3:
                return "Março - ";
            case 4:
                return "Abril - ";
            case 5:
                return "Maio - ";
            case 6:
                return "Junho - ";
            case 7:
                return "Julho - ";
            case 8:
                return "Agosto - ";
            case 9:
                return "Setembro - ";
            case 10:
                return "Outubro - ";
            case 11:
                return "Novembro - ";
            case 12:
                return "Dezembro - ";
        }
        return "";
    }
    
    private List<EstatisticaMateria> calculateEstMateria (String DataText){
        Dados dado = new Dados();
        PetDAO pdao = new PetDAO();
        List<Dados> listaDados = new ArrayList<>();

        listaDados = pdao.searchData(DataText);

        Materias dadosDaMateria = new Materias();
        List<Materias> listaMaterias = new ArrayList<>();
        listaMaterias = pdao.readMaterias();

        List<EstatisticaMateria> listEstMaterias = new ArrayList<>();

        int tamanhoAux = listaMaterias.size();
        for (int i = 0; i < tamanhoAux; i++) {
            EstatisticaMateria estMateria = new EstatisticaMateria();
            estMateria.setNomeMateria(listaMaterias.get(i).getMateriasCadastradas());
            listEstMaterias.add(estMateria);
        }

        String nomeAux;
        int tamanhoAux2 = listaDados.size();
        for (int i = 0; i < listaDados.size(); i++) {
            dado = listaDados.get(i);
            for (int j = 0; j < listEstMaterias.size(); j++) {
                if (dado.getMateriaAluno().equals(listEstMaterias.get(j).getNomeMateria())) {
                    listEstMaterias.get(j).setQuantidadeMateria(listEstMaterias.get(j).getQuantidadeMateria() + 1);
                }
            }
        }
        
        return listEstMaterias;
    }
    
    private void showGraphByMateria(String dataText, int mesProcurado){
        List<EstatisticaMateria> listaMateria = calculateEstMateria(dataText);
        
        InfoEstMateriaGraph graficoBarra = new InfoEstMateriaGraph();
        
        this.jPanel1.setLayout(new BorderLayout());
        
        String aux = setNameMes(mesProcurado);
        
        this.jPanel1.add(graficoBarra.criarGrafico(listaMateria, aux+dataText));
        pack();
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
            java.util.logging.Logger.getLogger(StatisticGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatisticGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatisticGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatisticGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatisticGraph().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
