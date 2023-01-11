
package finalproject;

import java.util.ArrayList;

public class Variance {
    private ArrayList<Float> variances = new ArrayList<>();

    public Variance() {
    }
    
    public void varianceCalculate(ArrayList<Attributes> attributeses,ArrayList<Float> averages){
        //{{{ sample variance of a double array
        float sumSquare = 0;
        float avg;
        for(int i=0; i<attributeses.get(1).getRowNum()-1;i++){
            avg = averages.get(i);
            for(int j=0;j<attributeses.get(i).getDatas().size();j++){
                sumSquare += (attributeses.get(i).getDatas().get(j) - avg) * (attributeses.get(i).getDatas().get(j) - avg);
            }
            variances.add(sumSquare / (attributeses.get(i).getDatas().size() - 1));
            
            
            
        }
        
        
    }

    public ArrayList<Float> getVariances() {
        return variances;
    }

    public void setVariances(ArrayList<Float> variances) {
        this.variances = variances;
        
    }
    
    
}
