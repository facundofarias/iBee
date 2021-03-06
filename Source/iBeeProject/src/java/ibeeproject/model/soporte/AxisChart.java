package ibeeproject.model.soporte;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * AxisChart is the backend bean that supplies all the data for the axis
 * chart.
 *
 * @since 1.5
 */
public class AxisChart {
    
    //list of the Labels for the x axis of the chart
    private List labels = new ArrayList(Arrays.asList(
            new String[]{"2000", "2001", "2002", "2003", "2004", "2005",
                         "2006"}));

    //The list of the legend label for the chart
    private List legendLabels = new ArrayList(Arrays.asList(
            new String[]{"Bugs", "Enhancements", "Fixed"}));

    //The list of the data used by the chart
    private List data = new ArrayList(
            Arrays.asList(new double[][]{new double[]{350, 50, 400},
                                         new double[]{45, 145, 50},
                                         new double[]{-36, 6, 98},
                                         new double[]{66, 166, 74},
                                         new double[]{145, 105, 55},
                                         new double[]{80, 110, 4},
                                         new double[]{10, 90, 70}}));

    //The list of the colors used by the chart
    private List paints =
            new ArrayList(Arrays.asList(new Color[]{new Color(26, 86, 138),
                                                    new Color(76, 126, 167),
                                                    new Color(148, 179, 203)}));

    /**
     * @param aLabels the labels to set
     */
    public void setLabels(List aLabels) {
        labels = aLabels;
    }

    /**
     * @param aLegendLabels the legendLabels to set
     */
    public void setLegendLabels(List aLegendLabels) {
        legendLabels = aLegendLabels;
    }

    /**
     * @param aData the data to set
     */
    public void setData(List aData) {
        data = aData;
    }

    /**
     * @param aPaints the paints to set
     */
    public void setPaints(List aPaints) {
        paints = aPaints;
    }


    public List getLabels() {

        return labels;
    }


    public List getLegendLabels() {

        return legendLabels;
    }


    public List getData() {

        return data;
    }


    public List getPaints() {

        return paints;
    }

}
