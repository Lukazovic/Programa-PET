package Interface;

import java.awt.Dimension;
import model.bean.EstatisticaMes;
import model.bean.EstatisticasDiaSem;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * @author Lucas Vieira
 */

public class InfoEstDiaSemGraph {

    public CategoryDataset createDataSet(EstatisticasDiaSem diaSemana) {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();

        dataSet.addValue(diaSemana.getDomingo(), "Domingo", "");
        dataSet.addValue(diaSemana.getSegunda(), "Segunda", "");
        dataSet.addValue(diaSemana.getTerca(), "Terça", "");
        dataSet.addValue(diaSemana.getQuarta(), "Quarta", "");
        dataSet.addValue(diaSemana.getQuinta(), "Quinta", "");
        dataSet.addValue(diaSemana.getSexta(), "Sexta", "");
        dataSet.addValue(diaSemana.getSabado(), "Sábado", "");

        return dataSet;
    }

    public JFreeChart createBarChart(CategoryDataset dataSet, String dataText) {
        JFreeChart barChart = ChartFactory.createBarChart(
                "Estatística por Dia da Semana - " + dataText,
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

    public ChartPanel criarGrafico(EstatisticasDiaSem diaSemana, String dataText) {
        CategoryDataset dataSet = this.createDataSet(diaSemana);

        JFreeChart graph = this.createBarChart(dataSet, dataText);

        ChartPanel painelDoGrafico = new ChartPanel(graph);
        painelDoGrafico.setPreferredSize(new Dimension(400, 400));

        return painelDoGrafico;
    }
}
