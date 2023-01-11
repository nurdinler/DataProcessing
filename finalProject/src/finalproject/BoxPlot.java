/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;
import java.awt.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.statistics.BoxAndWhiskerCalculator;
import org.jfree.data.statistics.BoxAndWhiskerXYDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset;
import org.jfree.date.DateUtilities;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class BoxPlot {

    private static final String ROW_KEY = "City";

    public void display() {
        JFrame f = new JFrame("Kutu Grafiği");        
            List<Float> list = Attributes.getAttributeses().get(5).getDatas();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DefaultBoxAndWhiskerCategoryDataset data = new DefaultBoxAndWhiskerCategoryDataset();
       // data.
//var x = new BoxAndWhiskerItem
       // data.add(list, ROW_KEY, "");
        JFreeChart chart = ChartFactory.createBoxAndWhiskerChart(
            "Box and Whisker Chart", ROW_KEY, "", data, false);
        f.add(new ChartPanel(chart) {

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(320, 480);
            }
        });
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
            
        
        
    }

    private List<Double> getInputData() {
        Scanner s = new Scanner((Readable) Attributes.getAttributeses().get(1).getDatas());
        List<Double> list = new ArrayList<>();
        do {
            list.add(s.nextDouble());
        } while (s.hasNext());
        return list;
    }

    public void main() {
        EventQueue.invokeLater(new BoxPlot()::display);
    }
}
