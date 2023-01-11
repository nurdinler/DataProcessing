
package finalproject;

import java.util.ArrayList;

public class IQR {
    private Float Q3;//75
    private Float Q1;//25
    private static ArrayList<Float> IQRs = new ArrayList<>();
    private static ArrayList<Float> Q1s = new ArrayList<>();
    private static ArrayList<Float> Q3s = new ArrayList<>();
  
    public IQR() {
    }
         
    public void IQRcalculate(ArrayList<Attributes> attributeses){
        for(int i=0;i<attributeses.get(1).getRowNum()-1;i++){
            int index = (int) ((0.25)*(attributeses.get(i).getDatas().size()+1));
            Q1 = attributeses.get(i).getDatas().get(index);
            Q1s.add(Q1);
            index = (int) ((0.75)*(attributeses.get(i).getDatas().size()+1));
            Q3 = attributeses.get(i).getDatas().get(index);
            attributeses.get(i).setQ3(Q3);
            IQRs.add(Q3-Q1);
            Q3s.add(Q3);
            
            
        }
      
    }

    public Float getQ3() {
        return Q3;
    }

    public void setQ3(Float Q3) {
        this.Q3 = Q3;
    }

    public Float getQ1() {
        return Q1;
    }

    public void setQ1(Float Q1) {
        this.Q1 = Q1;
    }

    public static ArrayList<Float> getIQRs() {
        return IQRs;
    }

    public static void setIQRs(ArrayList<Float> IQRs) {
        IQR.IQRs = IQRs;
    }

    public static ArrayList<Float> getQ1s() {
        return Q1s;
    }

    public static void setQ1s(ArrayList<Float> Q1s) {
        IQR.Q1s = Q1s;
    }

    public static ArrayList<Float> getQ3s() {
        return Q3s;
    }

    public static void setQ3s(ArrayList<Float> Q3s) {
        IQR.Q3s = Q3s;
    }
    

  
    
}
