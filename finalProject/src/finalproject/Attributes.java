
package finalproject;

import java.util.ArrayList;

public class Attributes {
    private String attributeName;
    private static int rowNum;
    private float Q3;
    private float Q1;
    private float mode;
    private float median;
     static ArrayList<Float> IQRs = new ArrayList<>();
    private ArrayList<Float> datas = new ArrayList<Float>();
    private static ArrayList<Attributes> attributeses = new ArrayList<>();
    private ArrayList<Integer> frequencies = new ArrayList<>();
    

    public Attributes(String attributeName) {
        this.attributeName = attributeName;
    }
    public Attributes() {        
    }

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }
    
    
    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public ArrayList<Float> getDatas() {
        return datas;
    }

    public void setDatas(float data) {
        datas.add(data);
    }

    public static ArrayList<Attributes> getAttributeses() {
        return attributeses;
    }

    public static void setAttributeses(ArrayList<Attributes> attributeses) {
        Attributes.attributeses = attributeses;
    }

    public ArrayList<Integer> getFrequencies() {
        return frequencies;
    }

    public void setFrequencies(ArrayList<Integer> frequencies) {
        this.frequencies = frequencies;
    }

    public float getQ3() {
        return Q3;
    }

    public void setQ3(float Q3) {
        this.Q3 = Q3;
    }

    public float getQ1() {
        return Q1;
    }

    public void setQ1(float Q1) {
        this.Q1 = Q1;
    }

    public float getMode() {
        return mode;
    }

    public void setMode(float mode) {
        this.mode = mode;
    }

    public float getMedian() {
        return median;
    }

    public void setMedian(float median) {
        this.median = median;
    }

    public static ArrayList<Float> getIQRs() {
        return IQRs;
    }

    public static void setIQRs(ArrayList<Float> IQRs) {
        Attributes.IQRs = IQRs;
    }

    
    

 
    
    
    
}
