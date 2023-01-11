
package finalproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Frequency {

    public Frequency() {
    }
    
    public void findFrequency(ArrayList<Attributes> attributeses){
        for(int i=0;i<attributeses.get(1).getRowNum()-1;i++){
            for(int j=0;j<attributeses.get(i).getDatas().size();j++){
                attributeses.get(i).getFrequencies().add(Collections.frequency(attributeses.get(i).getDatas(), attributeses.get(i).getDatas().get(j)));

            }
        }
    }
   
    }
    
