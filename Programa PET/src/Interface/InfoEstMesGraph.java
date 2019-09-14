package Interface;

import java.awt.Dimension;
import model.bean.EstatisticaMes;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * @author Lucas Vieira
 */

public class InfoEstMesGraph {
    
    public CategoryDataset createDataSet (EstatisticaMes estatisticaMes){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        dataSet.addValue(estatisticaMes.getJaneiro(), "Janeiro", "");
        dataSet.addValue(estatisticaMes.getFevereiro(), "Fevereiro", "");
        dataSet.addValue(estatisticaMes.getMarco(), "Março", "");
        dataSet.addValue(estatisticaMes.getAbril(), "Abril", "");
        dataSet.addValue(estatisticaMes.getMaio(), "Maio", "");
        dataSet.addValue(estatisticaMes.getJunho(), "Junho", "");
        dataSet.addValue(estatisticaMes.getJulho(), "Julho", "");
        dataSet.addValue(estatisticaMes.getAgosto(), "Agosto", "");
        dataSet.addValue(estatisticaMes.getSetembro(), "Setembro", "");
        dataSet.addValue(estatisticaMes.getOutubro(), "Outubro", "");
        dataSet.addValue(estatisticaMes.getNovembro(), "Novembro", "");
        dataSet.addValue(estatisticaMes.getDezembro(), "Dezembro", "");
        
        return dataSet;
    }
    
    public JFreeChart createBarChart(CategoryDataset dataSet, String dataText){
        JFreeChart barChart = ChartFactory.createBarChart(
                "Estatística por Mês - " + dataText,
                "", 
                "Monitorias", 
                dataSet,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        
        return barChart;
    }
    
    public ChartPanel criarGrafico(EstatisticaMes estatisticaMes, String dataText){
        CategoryDataset dataSet = this.createDataSet(estatisticaMes);
        
        JFreeChart graph = this.createBarChart(dataSet, dataText);
        
        ChartPanel painelDoGrafico = new ChartPanel(graph);
        painelDoGrafico.setPreferredSize(new Dimension(400, 400));
        
        return painelDoGrafico;
    }
}
