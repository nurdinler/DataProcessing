
package finalproject;
import java.awt.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.statistics.BoxAndWhiskerCalculator;
import org.jfree.data.statistics.BoxAndWhiskerXYDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset;
import org.jfree.date.DateUtilities;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;


import java.awt.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.statistics.BoxAndWhiskerCalculator;
import org.jfree.data.statistics.BoxAndWhiskerXYDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset;
import org.jfree.date.DateUtilities;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class BoxAndWhiskerChart extends ApplicationFrame {

    public BoxAndWhiskerChart(String titel) {
        
        super(titel);

        final BoxAndWhiskerXYDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);

        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(1000, 800));
        setContentPane(chartPanel);
        

    }

    private BoxAndWhiskerXYDataset createDataset() {
        final int ENTITY_COUNT = 14;
        DefaultBoxAndWhiskerXYDataset dataset = new DefaultBoxAndWhiskerXYDataset("Test");        
            Date date = DateUtilities.createDate(2003, 7,  1, 12, 0);
            List values = new ArrayList();
            
            Attributes attributes = new Attributes();
            
           if(Integer.parseInt(MainPageGUI.input_)+1 < attributes.getRowNum())
                values=((List) Attributes.getAttributeses().get(Integer.parseInt(MainPageGUI.input_)-1).getDatas().clone());

                //v.add(values);
            
            dataset.add(date, BoxAndWhiskerCalculator.calculateBoxAndWhiskerStatistics(values));

        return dataset;
    }

    private JFreeChart createChart(final BoxAndWhiskerXYDataset dataset) {
        JFreeChart chart = ChartFactory.createBoxAndWhiskerChart(
                "Box and Whisker Chart", "Time", "Value", dataset, true);
        chart.setBackgroundPaint(new Color(249, 231, 236));

        return chart;
    }

    public void main() {

        BoxAndWhiskerChart demo = new BoxAndWhiskerChart("Test");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }
}



