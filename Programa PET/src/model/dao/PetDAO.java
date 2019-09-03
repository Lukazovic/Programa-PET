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
import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class PetDAO {
    
    public void create(Dados d){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO dadospet (nomeMonitor1,nomeMonitor2,nomeAluno,cursoAluno,materiaAluno,raAluno,localMonitoria,horaMonitoria,dataMonitoria)VALUES(?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, d.getNomeMonitor1());
            stmt.setString(2, d.getNomeMonitor2());
            stmt.setString(3, d.getNomeAluno());
            stmt.setString(4, d.getCursoAluno());
            stmt.setString(5, d.getMateriaAluno());
            stmt.setInt(6, d.getRaAluno());
            stmt.setString(7, d.getLocalMonitoria());
            stmt.setString(8, d.getHoraMonitoria());
            stmt.setString(9, d.getDataMonitoria());
            
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
                dado.setNomeAluno(rs.getString("nomeAluno"));
                dado.setCursoAluno(rs.getString("cursoAluno"));
                dado.setMateriaAluno(rs.getString("materiaAluno"));
                dado.setRaAluno(rs.getInt("raAluno"));
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
                dado.setNomeAluno(rs.getString("nomeAluno"));
                dado.setCursoAluno(rs.getString("cursoAluno"));
                dado.setMateriaAluno(rs.getString("materiaAluno"));
                dado.setRaAluno(rs.getInt("raAluno"));
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
                dado.setNomeAluno(rs.getString("nomeAluno"));
                dado.setCursoAluno(rs.getString("cursoAluno"));
                dado.setMateriaAluno(rs.getString("materiaAluno"));
                dado.setRaAluno(rs.getInt("raAluno"));
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
                dado.setNomeAluno(rs.getString("nomeAluno"));
                dado.setCursoAluno(rs.getString("cursoAluno"));
                dado.setMateriaAluno(rs.getString("materiaAluno"));
                dado.setRaAluno(rs.getInt("raAluno"));
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
                dado.setNomeAluno(rs.getString("nomeAluno"));
                dado.setCursoAluno(rs.getString("cursoAluno"));
                dado.setMateriaAluno(rs.getString("materiaAluno"));
                dado.setRaAluno(rs.getInt("raAluno"));
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
                dado.setNomeAluno(rs.getString("nomeAluno"));
                dado.setCursoAluno(rs.getString("cursoAluno"));
                dado.setMateriaAluno(rs.getString("materiaAluno"));
                dado.setRaAluno(rs.getInt("raAluno"));
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
}
