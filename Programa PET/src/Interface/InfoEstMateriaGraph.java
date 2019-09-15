package Interface;

import java.awt.Dimension;
import java.util.List;
import model.bean.EstatisticaMateria;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * @author Lucas Vieira
 */

public class InfoEstMateriaGraph {

    public CategoryDataset createDataSet(List<EstatisticaMateria> listaMateria) {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        for(EstatisticaMateria materia: listaMateria){
            if(materia.getQuantidadeMateria() != 0){
                dataSet.addValue(materia.getQuantidadeMateria(), materia.getNomeMateria(), "");
            }
        }

        return dataSet;
    }

    public JFreeChart createBarChart(CategoryDataset dataSet, String dataText) {
        JFreeChart barChart = ChartFactory.createBarChart(
                "Estatística por Matéria - " + dataText,
                "",
                "Quantidade de Monitorias",
                dataSet,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        return barChart;
    }

    public ChartPanel criarGrafico(List<EstatisticaMateria> listaMateria, String dataText) {
        CategoryDataset dataSet = this.createDataSet(listaMateria);

        JFreeChart graph = this.createBarChart(dataSet, dataText);

        ChartPanel painelDoGrafico = new ChartPanel(graph);
        painelDoGrafico.setPreferredSize(new Dimension(400, 400));

        return painelDoGrafico;
    }
}
