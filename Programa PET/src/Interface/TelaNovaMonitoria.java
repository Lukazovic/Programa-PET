package Interface;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import javax.swing.JOptionPane;
import model.bean.Cursos;
import model.bean.Dados;
import model.bean.Materias;
import model.bean.Monitores;
import model.dao.PetDAO;

/**
 * @author Lucas Vieira
 */
public class TelaNovaMonitoria extends javax.swing.JFrame {

    /**
     * Creates new form TelaNovaMonitoria2
     */
    public TelaNovaMonitoria() {
        initComponents();

        jRadioButtonHora.setSelected(true);
        txtHora.setEnabled(false);
        txtData.setEnabled(false);

        showBoxMonitores();
        showBoxCursos();
        showBoxMaterias();
    }

    private void showBoxMonitores() {
        PetDAO pdao = new PetDAO();
        List<Monitores> listaMonitores = new ArrayList<>();
        listaMonitores = pdao.readMonitores();
        Monitores monitor = new Monitores();

        if (listaMonitores.size() != 0) {
            PriorityQueue<String> listaOrdenadaMonitores = new PriorityQueue<>();
            for (int i = 1; i < listaMonitores.size() + 1; i++) {
                listaOrdenadaMonitores.add(listaMonitores.get(i - 1).getNomeMonitor());
            }
            int tamAux = listaOrdenadaMonitores.size();
            for (int j = 1; j < tamAux + 1; j++) {
                String auxNomeMonitor = listaOrdenadaMonitores.remove();
                jComboBoxMonitor1.addItem(auxNomeMonitor);
                jComboBoxMonitor2.addItem(auxNomeMonitor);
                jComboBoxMonitor3.addItem(auxNomeMonitor);
                jComboBoxMonitor4.addItem(auxNomeMonitor);
            }
        }
    }

    private void showBoxCursos() {
        PetDAO pdao = new PetDAO();

        List<Cursos> listaCursos = new ArrayList<>();
        listaCursos = pdao.readCursos();
        Cursos curso = new Cursos();
        if (!listaCursos.isEmpty()) {
            PriorityQueue<String> listaOrdenadaCursos = new PriorityQueue<>();
            for (int i = 0; i < listaCursos.size(); i++) {
                listaOrdenadaCursos.add(listaCursos.get(i).getCursoCadastrado());
            }

            int tamAux = listaOrdenadaCursos.size();
            for (int i = 1; i < tamAux + 1; i++) {
                String auxNomeCursos = listaOrdenadaCursos.remove();
                jComboBoxCurso.addItem(auxNomeCursos);
            }
        }
    }

    private void showBoxMaterias() {
        PetDAO pdao = new PetDAO();

        List<Materias> listamMaterias = new ArrayList<>();
        listamMaterias = pdao.readMaterias();
        Materias materia = new Materias();
        if (listamMaterias.size() != 0) {
            PriorityQueue<String> listaOrdenadaMaterias = new PriorityQueue<>();
            for (int i = 0; i < listamMaterias.size(); i++) {
                listaOrdenadaMaterias.add(listamMaterias.get(i).getMateriasCadastradas());
            }

            int tamAux = listaOrdenadaMaterias.size();
            for (int i = 1; i < tamAux + 1; i++) {
                String auxNomeMaterias = listaOrdenadaMaterias.remove();
                jComboBoxMateria.addItem(auxNomeMaterias);
            }
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxMonitor2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxMonitor1 = new javax.swing.JComboBox<>();
        jComboBoxMonitor3 = new javax.swing.JComboBox<>();
        jComboBoxMonitor4 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        jComboBoxCurso = new javax.swing.JComboBox<>();
        jComboBoxMateria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        jRadioButtonHora = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtHora = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        btnSalvarDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar nova Monitoria - PET");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensPET/LogoPET2.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 0, 120, 110);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Cadastrar Nova Monitoria");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 110, 360, 30);

        jComboBoxMonitor2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segundo Monitor" }));
        jPanel1.add(jComboBoxMonitor2);
        jComboBoxMonitor2.setBounds(220, 180, 130, 25);

        jLabel3.setText("Monitores:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 160, 100, 15);

        jComboBoxMonitor1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monitor" }));
        jComboBoxMonitor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMonitor1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxMonitor1);
        jComboBoxMonitor1.setBounds(50, 180, 130, 25);

        jComboBoxMonitor3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terceiro Monitor" }));
        jPanel1.add(jComboBoxMonitor3);
        jComboBoxMonitor3.setBounds(50, 210, 130, 25);

        jComboBoxMonitor4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quarto Monitor" }));
        jPanel1.add(jComboBoxMonitor4);
        jComboBoxMonitor4.setBounds(220, 210, 130, 25);

        jLabel4.setText("Nome do Aluno:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 240, 130, 15);
        jPanel1.add(txtNomeAluno);
        txtNomeAluno.setBounds(50, 260, 170, 30);

        jComboBoxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Curso do Aluno" }));
        jPanel1.add(jComboBoxCurso);
        jComboBoxCurso.setBounds(50, 300, 170, 25);

        jComboBoxMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matéria" }));
        jComboBoxMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMateriaActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxMateria);
        jComboBoxMateria.setBounds(240, 300, 110, 25);

        jLabel5.setText("Local:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(240, 240, 60, 15);
        jPanel1.add(txtLocal);
        txtLocal.setBounds(240, 260, 110, 30);

        jRadioButtonHora.setText("Definir data e hora automaticamente");
        jRadioButtonHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHoraActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonHora);
        jRadioButtonHora.setBounds(50, 340, 300, 28);

        jLabel6.setText("Hora:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 370, 50, 15);

        try {
            txtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtHora);
        txtHora.setBounds(90, 390, 50, 30);

        jLabel7.setText("Data:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(210, 370, 60, 15);

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        jPanel1.add(txtData);
        txtData.setBounds(210, 390, 80, 30);

        btnSalvarDados.setBackground(new java.awt.Color(0, 0, 204));
        btnSalvarDados.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarDados.setText("Salvar");
        btnSalvarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarDadosActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvarDados);
        btnSalvarDados.setBounds(259, 450, 90, 31);

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 410, 560);

        setSize(new java.awt.Dimension(409, 551));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMonitor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMonitor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMonitor1ActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnSalvarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarDadosActionPerformed
        if (validateMonitoria()) {
            Dados d = new Dados();
            PetDAO dao = new PetDAO();

            d.setNomeMonitor1(nameMonitor1());
            d.setNomeMonitor2(nameMonitor2());
            d.setNomeMonitor3(nameMonitor3());
            d.setNomeMonitor4(nameMonitor4());
            d.setNomeAluno(txtNomeAluno.getText());
            d.setCursoAluno(nameCurso());
            d.setMateriaAluno(nameMateria());
            d.setLocalMonitoria(txtLocal.getText());
            d.setHoraMonitoria(defineHour());
            d.setDataMonitoria(defineDate());

            dao.create(d);

            jComboBoxMonitor1.setSelectedIndex(0);
            jComboBoxMonitor2.setSelectedIndex(0);
            jComboBoxMonitor3.setSelectedIndex(0);
            jComboBoxMonitor4.setSelectedIndex(0);
            txtNomeAluno.setText("");
            jComboBoxCurso.setSelectedIndex(0);
            jComboBoxMateria.setSelectedIndex(0);
            txtLocal.setText("");
            txtHora.setText("");
            txtData.setText("");
            jRadioButtonHora.setSelected(true);
            txtHora.setEnabled(false);
            txtData.setEnabled(false);
        }
    }//GEN-LAST:event_btnSalvarDadosActionPerformed

    private void jRadioButtonHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHoraActionPerformed
        if (jRadioButtonHora.isSelected()) {
            txtData.setEnabled(false);
            txtHora.setEnabled(false);
        } else {
            txtData.setEnabled(true);
            txtHora.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonHoraActionPerformed

    private void jComboBoxMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMateriaActionPerformed

    boolean validateMonitoria() {
        if (!validateMonitor1()) {
            return false;
        }
        if (!validateNomeAluno()) {
            return false;
        }
        if (!validateCursoAluno()) {
            return false;
        }
        if (!validateMateria()) {
            return false;
        }
        if (!validateHora()) {
            return false;
        }
        if (!validateData()) {
            return false;
        }
        return true;
    }

    private boolean validateMonitor1() {
        if (jComboBoxMonitor1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "ERRO: Monitor não informado!");
            return false;
        }
        return true;
    }

    private boolean validateNomeAluno() {
        if (txtNomeAluno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO: Insira o nome do Aluno!");
            return false;
        }
        return true;
    }

    private boolean validateCursoAluno() {
        if (jComboBoxCurso.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "ERRO: Selecione o curso do Aluno!");
            return false;
        }
        return true;
    }

    private boolean validateMateria() {
        if (jComboBoxMateria.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "ERRO: Informe a matéria!");
            return false;
        }
        return true;
    }

    private boolean validateHora() {
        if (!jRadioButtonHora.isSelected()) {
            if (txtHora.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERRO: Hora inválida!");
                return false;
            }
        }
        return true;
    }

    private boolean validateData() {
        if (!jRadioButtonHora.isSelected()) {
            if (txtData.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERRO: Data não inserida corretamente!");
                return false;
            } else if (validateIfDateIsAfter()) {
                JOptionPane.showMessageDialog(null, "ERRO: Data inválida!");
                return false;
            }
        }
        return true;
    }

    private boolean validateIfDateIsAfter() {
        String[] separeteDate = txtData.getText().split("/");
        LocalDate newDate = LocalDate.of(Integer.parseInt(separeteDate[2]), Integer.parseInt(separeteDate[1]), Integer.parseInt(separeteDate[0]));
        LocalDate today = LocalDate.now();

        return today.isBefore(newDate);
    }

    private String nameMonitor1() {
        if (jComboBoxMonitor1.getSelectedIndex() == 0) {
            return "";
        }

        return jComboBoxMonitor1.getSelectedItem().toString();
    }

    private String nameMonitor2() {
        if (jComboBoxMonitor2.getSelectedIndex() == 0) {
            return "";
        }

        return jComboBoxMonitor2.getSelectedItem().toString();
    }

    private String nameMonitor3() {
        if (jComboBoxMonitor3.getSelectedIndex() == 0) {
            return "";
        }

        return jComboBoxMonitor3.getSelectedItem().toString();
    }

    private String nameMonitor4() {
        if (jComboBoxMonitor4.getSelectedIndex() == 0) {
            return "";
        }

        return jComboBoxMonitor4.getSelectedItem().toString();
    }

    private String nameCurso() {
        if (jComboBoxCurso.getSelectedIndex() == 0) {
            return "";
        }

        return jComboBoxCurso.getSelectedItem().toString();
    }

    private String nameMateria() {
        if (jComboBoxMateria.getSelectedIndex() == 0) {
            return "";
        }

        return jComboBoxMateria.getSelectedItem().toString();
    }

    private String defineHour() {
        if (jRadioButtonHora.isSelected()) {
            LocalTime nowHour = LocalTime.now();
            return nowHour.toString();
        }
        return txtHora.getText();
    }

    private String defineDate() {
        if (jRadioButtonHora.isSelected()) {
            LocalDate today = LocalDate.now();
            return today.toString();
        }
        String[] separeteDate = txtData.getText().split("/");
        LocalDate newDate = LocalDate.of(Integer.parseInt(separeteDate[2]), Integer.parseInt(separeteDate[1]), Integer.parseInt(separeteDate[0]));

        return newDate.toString();
    }

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
            java.util.logging.Logger.getLogger(TelaNovaMonitoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovaMonitoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovaMonitoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovaMonitoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNovaMonitoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarDados;
    private javax.swing.JComboBox<String> jComboBoxCurso;
    private javax.swing.JComboBox<String> jComboBoxMateria;
    private javax.swing.JComboBox<String> jComboBoxMonitor1;
    private javax.swing.JComboBox<String> jComboBoxMonitor2;
    private javax.swing.JComboBox<String> jComboBoxMonitor3;
    private javax.swing.JComboBox<String> jComboBoxMonitor4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonHora;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtHora;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtNomeAluno;
    // End of variables declaration//GEN-END:variables
}
