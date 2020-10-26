/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlefinanceiro;

import java.awt.*;
import javax.swing.JPanel;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author aluno
 */
public class grafico {
    
    public void barra(double credito, double debito, JPanel painel){
DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
barChartData.setValue(debito, "Tipo", "Despesa");
barChartData.setValue(credito, "Tipo", "Crédito");
JFreeChart barchart = ChartFactory.createBarChart("Despesas por TIPO", "", "", barChartData, PlotOrientation.VERTICAL, false, true, false);
CategoryPlot barchrt = barchart.getCategoryPlot();
barchrt.setRangeMinorGridlinePaint(Color.ORANGE);
ChartPanel barPanel = new ChartPanel(barchart, true);
barPanel.setSize(painel.getWidth(), painel.getHeight());
barPanel.setVisible(true);
painel.removeAll();
painel.add(barPanel, BorderLayout.CENTER);
painel.revalidate();
painel.repaint();
}
    
    public void pizza(double credito, double debito, JPanel painel){

DefaultPieDataset dpd = new DefaultPieDataset();

dpd.setValue("Despesa", debito);

dpd.setValue("Crédito", credito);

JFreeChart barchart = ChartFactory.createPieChart("Despesas por TIPO", dpd,true, true, false);

ChartPanel pizzaPanel = new ChartPanel(barchart, true);

pizzaPanel.setSize(painel.getWidth(), painel.getHeight());

pizzaPanel.setVisible(true);

painel.removeAll();

painel.add(pizzaPanel, BorderLayout.CENTER);

painel.revalidate();

painel.repaint();

}
    
}
