package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Dados;
import model.bean.Cursos;
import model.bean.Materias;
import model.bean.Monitores;

/**
 * @author Lucas Vieira
 */
public class PetDAO {
    
    public void create(Dados d){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO dadospet (nomeMonitor1,nomeMonitor2,nomeMonitor3, nomeMonitor4, nomeAluno,cursoAluno,materiaAluno,localMonitoria,horaMonitoria,dataMonitoria)VALUES(?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, d.getNomeMonitor1());
            stmt.setString(2, d.getNomeMonitor2());
            stmt.setString(3, d.getNomeMonitor3());
            stmt.setString(4, d.getNomeMonitor4());
            stmt.setString(5, d.getNomeAluno());
            stmt.setString(6, d.getCursoAluno());
            stmt.setString(7, d.getMateriaAluno());
            stmt.setString(8, d.getLocalMonitoria());
            stmt.setString(9, d.getHoraMonitoria());
            stmt.setString(10, d.getDataMonitoria());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Dados> read (){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Dados> listaDados = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM dadospet");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Dados dado = new Dados();
                
                dado.setContagemMonitoria(rs.getInt("contagemMonitorias"));
                dado.setNomeMonitor1(rs.getString("nomeMonitor1"));
                dado.setNomeMonitor2(rs.getString("nomeMonitor2"));
                dado.setNomeMonitor3(rs.getString("nomeMonitor3"));
                dado.setNomeMonitor4(rs.getString("nomeMonitor4"));
                dado.setNomeAluno(rs.getString("nomeAluno"));
                dado.setCursoAluno(rs.getString("cursoAluno"));
                dado.setMateriaAluno(rs.getString("materiaAluno"));
                dado.setLocalMonitoria(rs.getString("localMonitoria"));
                dado.setHoraMonitoria(rs.getString("horaMonitoria"));
                dado.setDataMonitoria(rs.getString("dataMonitoria"));
                
                listaDados.add(dado);
            }
            
                    } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return listaDados;
    }
    
    public List<Dados> searchMonitor1 (String moni1){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Dados> listaDados = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM dadospet WHERE nomeMonitor1 LIKE ?");
            stmt.setString(1, "%" +moni1 +"%");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Dados dado = new Dados();
                
                dado.setContagemMonitoria(rs.getInt("contagemMonitorias"));
                dado.setNomeMonitor1(rs.getString("nomeMonitor1"));
                dado.setNomeMonitor2(rs.getString("nomeMonitor2"));
                dado.setNomeMonitor3(rs.getString("nomeMonitor3"));
                dado.setNomeMonitor4(rs.getString("nomeMonitor4"));
                dado.setNomeAluno(rs.getString("nomeAluno"));
                dado.setCursoAluno(rs.getString("cursoAluno"));
                dado.setMateriaAluno(rs.getString("materiaAluno"));
                dado.setLocalMonitoria(rs.getString("localMonitoria"));
                dado.setHoraMonitoria(rs.getString("horaMonitoria"));
                dado.setDataMonitoria(rs.getString("dataMonitoria"));
                
                listaDados.add(dado);
            }
            
                    } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return listaDados;
    }
    
    
    public List<Dados> searchMonitor2 (String moni1){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Dados> listaDados = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM dadospet WHERE nomeMonitor2 LIKE ?");
            stmt.setString(1, "%" +moni1 +"%");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Dados dado = new Dados();
                
                dado.setContagemMonitoria(rs.getInt("contagemMonitorias"));
                dado.setNomeMonitor1(rs.getString("nomeMonitor1"));
                dado.setNomeMonitor2(rs.getString("nomeMonitor2"));
                dado.setNomeMonitor3(rs.getString("nomeMonitor3"));
                dado.setNomeMonitor4(rs.getString("nomeMonitor4"));
                dado.setNomeAluno(rs.getString("nomeAluno"));
                dado.setCursoAluno(rs.getString("cursoAluno"));
                dado.setMateriaAluno(rs.getString("materiaAluno"));
                dado.setLocalMonitoria(rs.getString("localMonitoria"));
                dado.setHoraMonitoria(rs.getString("horaMonitoria"));
                dado.setDataMonitoria(rs.getString("dataMonitoria"));
                
                listaDados.add(dado);
            }
            
                    } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return listaDados;
    }
    
    public List<Dados> searchMonitor3 (String moni1){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Dados> listaDados = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM dadospet WHERE nomeMonitor3 LIKE ?");
            stmt.setString(1, "%" +moni1 +"%");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Dados dado = new Dados();
                
                dado.setContagemMonitoria(rs.getInt("contagemMonitorias"));
                dado.setNomeMonitor1(rs.getString("nomeMonitor1"));
                dado.setNomeMonitor2(rs.getString("nomeMonitor2"));
                dado.setNomeMonitor3(rs.getString("nomeMonitor3"));
                dado.setNomeMonitor4(rs.getString("nomeMonitor4"));
                dado.setNomeAluno(rs.getString("nomeAluno"));
                dado.setCursoAluno(rs.getString("cursoAluno"));
                dado.setMateriaAluno(rs.getString("materiaAluno"));
                dado.setLocalMonitoria(rs.getString("localMonitoria"));
                dado.setHoraMonitoria(rs.getString("horaMonitoria"));
                dado.setDataMonitoria(rs.getString("dataMonitoria"));
                
                listaDados.add(dado);
            }
            
                    } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return listaDados;
    }
    
    public List<Dados> searchMonitor4 (String moni1){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Dados> listaDados = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM dadospet WHERE nomeMonitor4 LIKE ?");
            stmt.setString(1, "%" +moni1 +"%");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Dados dado = new Dados();
                
                dado.setContagemMonitoria(rs.getInt("contagemMonitorias"));
                dado.setNomeMonitor1(rs.getString("nomeMonitor1"));
                dado.setNomeMonitor2(rs.getString("nomeMonitor2"));
                dado.setNomeMonitor3(rs.getString("nomeMonitor3"));
                dado.setNomeMonitor4(rs.getString("nomeMonitor4"));
                dado.setNomeAluno(rs.getString("nomeAluno"));
                dado.setCursoAluno(rs.getString("cursoAluno"));
                dado.setMateriaAluno(rs.getString("materiaAluno"));
                dado.setLocalMonitoria(rs.getString("localMonitoria"));
                dado.setHoraMonitoria(rs.getString("horaMonitoria"));
                dado.setDataMonitoria(rs.getString("dataMonitoria"));
                
                listaDados.add(dado);
            }
            
                    } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return listaDados;
    }
    
    public List<Dados> searchCurso (String curso){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Dados> listaDados = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM dadospet WHERE cursoAluno LIKE ?");
            stmt.setString(1, "%" +curso +"%");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Dados dado = new Dados();
                
                dado.setContagemMonitoria(rs.getInt("contagemMonitorias"));
                dado.setNomeMonitor1(rs.getString("nomeMonitor1"));
                dado.setNomeMonitor2(rs.getString("nomeMonitor2"));
                dado.setNomeMonitor3(rs.getString("nomeMonitor3"));
                dado.setNomeMonitor4(rs.getString("nomeMonitor4"));
                dado.setNomeAluno(rs.getString("nomeAluno"));
                dado.setCursoAluno(rs.getString("cursoAluno"));
                dado.setMateriaAluno(rs.getString("materiaAluno"));
                dado.setLocalMonitoria(rs.getString("localMonitoria"));
                dado.setHoraMonitoria(rs.getString("horaMonitoria"));
                dado.setDataMonitoria(rs.getString("dataMonitoria"));
                
                listaDados.add(dado);
            }
            
                    } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return listaDados;
    }
    
    public List<Dados> searchMateria (String materia){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Dados> listaDados = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM dadospet WHERE materiaAluno LIKE ?");
            stmt.setString(1, "%" +materia +"%");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Dados dado = new Dados();
                
                dado.setContagemMonitoria(rs.getInt("contagemMonitorias"));
                dado.setNomeMonitor1(rs.getString("nomeMonitor1"));
                dado.setNomeMonitor2(rs.getString("nomeMonitor2"));
                dado.setNomeMonitor3(rs.getString("nomeMonitor3"));
                dado.setNomeMonitor4(rs.getString("nomeMonitor4"));
                dado.setNomeAluno(rs.getString("nomeAluno"));
                dado.setCursoAluno(rs.getString("cursoAluno"));
                dado.setMateriaAluno(rs.getString("materiaAluno"));
                dado.setLocalMonitoria(rs.getString("localMonitoria"));
                dado.setHoraMonitoria(rs.getString("horaMonitoria"));
                dado.setDataMonitoria(rs.getString("dataMonitoria"));
                
                listaDados.add(dado);
            }
            
                    } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return listaDados;
    }
    
    
    public List<Dados> searchData (String data){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Dados> listaDados = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM dadospet WHERE dataMonitoria LIKE ?");
            stmt.setString(1, data +"%");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Dados dado = new Dados();
                
                dado.setContagemMonitoria(rs.getInt("contagemMonitorias"));
                dado.setNomeMonitor1(rs.getString("nomeMonitor1"));
                dado.setNomeMonitor2(rs.getString("nomeMonitor2"));
                dado.setNomeMonitor3(rs.getString("nomeMonitor3"));
                dado.setNomeMonitor4(rs.getString("nomeMonitor4"));
                dado.setNomeAluno(rs.getString("nomeAluno"));
                dado.setCursoAluno(rs.getString("cursoAluno"));
                dado.setMateriaAluno(rs.getString("materiaAluno"));
                dado.setLocalMonitoria(rs.getString("localMonitoria"));
                dado.setHoraMonitoria(rs.getString("horaMonitoria"));
                dado.setDataMonitoria(rs.getString("dataMonitoria"));
                
                listaDados.add(dado);
            }
            
                    } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return listaDados;
    }
    
    
    public ArrayList<Integer> contarNumerosPorMes (List<Dados> listaDados){
        
        ArrayList<Integer> contMes = new ArrayList<Integer>(12);
        
        
        
        int t=0;
        while (t!=12){
            int contador = 0;
            Dados dado = new Dados();
            for(int i=0; i<listaDados.size(); i++){
                dado = listaDados.remove(0);
                
                String[] dataConvertida = dado.getDataMonitoria().toString().split("-");
                
                if(Integer.parseInt(dataConvertida[1]) == (t+1)){
                    contador++;
                }
                
            }
            contMes.add(contador);
            t++;
        }
        
        return contMes;
    }
    
    public Dados readLastMonitoria (){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Dados dado = new Dados();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM dadospet");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                dado.setContagemMonitoria(rs.getInt("contagemMonitorias"));
                dado.setNomeMonitor1(rs.getString("nomeMonitor1"));
                dado.setNomeMonitor2(rs.getString("nomeMonitor2"));
                dado.setNomeMonitor3(rs.getString("nomeMonitor3"));
                dado.setNomeMonitor4(rs.getString("nomeMonitor4"));
                dado.setNomeAluno(rs.getString("nomeAluno"));
                dado.setCursoAluno(rs.getString("cursoAluno"));
                dado.setMateriaAluno(rs.getString("materiaAluno"));
                dado.setLocalMonitoria(rs.getString("localMonitoria"));
                dado.setHoraMonitoria(rs.getString("horaMonitoria"));
                dado.setDataMonitoria(rs.getString("dataMonitoria"));
            }
            
                    } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return dado;
    }
    
    public List<Monitores> readMonitores (){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Monitores> listaMonitores = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM monitorespet");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Monitores monitor = new Monitores();
                
                monitor.setRAmonitor(rs.getString("RA"));
                monitor.setNomeMonitor(rs.getString("nomeMonitor"));
                
                listaMonitores.add(monitor);
            }
            
                    } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return listaMonitores;
    }
    
    public List<Cursos> readCursos (){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Cursos> listaCursos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cursospet");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Cursos curso = new Cursos();
                
                curso.setCursoCadastrado(rs.getString("cursoCadastrado"));
                
                listaCursos.add(curso);
            }
            
                    } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaCursos;
    }
    
    public List<Materias> readMaterias (){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Materias> listaMaterias = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM materiasPET");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Materias materia = new Materias();
                
                materia.setMateriasCadastradas(rs.getString("materiaCadastrada"));
                
                listaMaterias.add(materia);
            }
            
                    } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaMaterias;
    }
    
    public void deleteMonitor(Monitores monitor){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM monitorespet WHERE RA = ?");
            stmt.setString(1, monitor.getRAmonitor());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Monitor removido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover monitor: " +ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void saveNewMonitor(Monitores monitor){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO monitorespet (RA,nomeMonitor)VALUES(?,?)");
            stmt.setString(1, monitor.getRAmonitor());
            stmt.setString(2, monitor.getNomeMonitor());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar novo Monitor: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void deleteDado(Dados d){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM dadospet WHERE contagemMonitorias = ?");
            stmt.setString(1, String.valueOf(d.getContagemMonitoria()));
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Monitoria removida com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover monitoria: " +ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void saveNewCurso(Cursos curso){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cursospet (cursoCadastrado)VALUES(?)");
            stmt.setString(1, curso.getCursoCadastrado());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar novo Curso: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void deleteCurso(Cursos curso){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM cursospet WHERE cursoCadastrado = ?");
            stmt.setString(1, curso.getCursoCadastrado());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Curso removido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover curso: " +ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    public void saveNewMateria(Materias materia){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO materiaspet (materiaCadastrada)VALUES(?)");
            stmt.setString(1, materia.getMateriasCadastradas());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar nova Matéria: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void deleteMateria(Materias materia){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM materiaspet WHERE materiaCadastrada = ?");
            stmt.setString(1, materia.getMateriasCadastradas());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Matéria removida com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover matéria: " +ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
