package finalproject;

import java.util.ArrayList;

public class ortalama {
    //Attributes attributes = new Attributes();
    private static ArrayList<Float> averages = new ArrayList<>();
    private  float datas;
    public ortalama() {        
        
        }
    public void averageCalculater(ArrayList<Attributes> attributeses){
        for(int i=0;i<attributeses.get(1).getRowNum()-1;i++){
            for(int j=0;j<attributeses.get(i).getDatas().size();j++){
                   datas += attributeses.get(i).getDatas().get(j);
                
                
            }
            averages.add(datas/attributeses.get(i).getDatas().size());
        }        



    }

    public static ArrayList<Float> getAverages() {
        return averages;
    }

    public static void setAverages(ArrayList<Float> averages) {
        ortalama.averages = averages;
    }

    public float getDatas() {
        return datas;
    }

    public void setDatas(float datas) {
        this.datas = datas;
    }

   
}
    
    

