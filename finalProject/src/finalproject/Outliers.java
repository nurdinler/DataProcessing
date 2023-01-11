
package finalproject;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Outliers {
    private ArrayList<Float> outliners = new ArrayList<>();
    private float upValue;
    private float downValue;
    IQR iqr = new IQR();
    Attributes attributes = new Attributes();

    public Outliers() {
    }
    
    public void findOutliners(ArrayList<Attributes> attributeses){   
        for(int i=0;i<attributeses.get(1).getRowNum()-1;i++){           
           float value;        
           value = (float) IQR.getIQRs().get(i) * (float) 1.5;
           upValue = value + attributeses.get(i).getQ3();
      
           downValue = value + attributeses.get(i).getQ1();
            for(int j = 0;j<attributeses.get(i).getDatas().size();j++){
               if(attributeses.get(i).getDatas().get(j) > upValue){
                   outliners.add( attributeses.get(i).getDatas().get(j));
               }
           }      
            outliners = (ArrayList<Float>) outliners.stream().distinct().collect(Collectors.toList());
        }
        
    }

    public ArrayList<Float> getOutliners() {
        return outliners;
    }

    public void setOutliners(ArrayList<Float> outliners) {
        this.outliners = outliners;
    }

    public float getUpValue() {
        return upValue;
    }

    public void setUpValue(float upValue) {
        this.upValue = upValue;
    }

    public float getDownValue() {
        return downValue;
    }

    public void setDownValue(float downValue) {
        this.downValue = downValue;
    }

    public IQR getIqr() {
        return iqr;
    }

    public void setIqr(IQR iqr) {
        this.iqr = iqr;
    }
    
    
    
}
