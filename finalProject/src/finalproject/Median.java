
package finalproject;

import java.util.ArrayList;

public class Median {
    //ortanca deger
    private static ArrayList<Float> medians = new ArrayList<>();
    private float data;

    public Median() {
    }
    public void medianCalculate(ArrayList<Attributes> attributeses){
        for(int i=0;i<attributeses.get(1).getRowNum()-1;i++){
            if(attributeses.get(i).getRowNum()%2 == 0){
                data = attributeses.get(i).getDatas().get(attributeses.get(i).getRowNum()+1/2);
                medians.add(data);
                attributeses.get(i).setMedian(data);
            }
            else{
                float data2;
                data = attributeses.get(i).getDatas().get((attributeses.get(i).getRowNum()+1/2)+1);
                data2 = attributeses.get(i).getDatas().get((attributeses.get(i).getRowNum()+1/2)-1);
                medians.add((data+data2)/2);      
                attributeses.get(i).setMedian((data+data2)/2);
            }
        }
    }

    public static ArrayList<Float> getMedians() {
        return medians;
    }

    public static void setMedians(ArrayList<Float> medians) {
        Median.medians = medians;
    }

    public float getDatas() {
        return data;
    }

    public void setDatas(float data) {
        this.data = data;
    }
    
    
    
}
