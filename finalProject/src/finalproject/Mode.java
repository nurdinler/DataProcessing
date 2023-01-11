
package finalproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.RowFilter.Entry;

public class Mode {
    //en cok tekrarlayan deger
    private static ArrayList<Float> modes = new ArrayList<>();
    private float data;

    public Mode() {
    }

    public void modeCalculate(ArrayList<Attributes> attributeses){
        for(int i=0;i<attributeses.get(1).getRowNum()-1;i++){
            ArrayList<Float> sortedArr = attributeses.get(i).getDatas();
            Collections.sort(sortedArr);		
            float mode = 0;
            // If our array's length is even, then we need to find the average of the two centered values
            if (sortedArr.size() % 2 == 0)
            {
		int indexA = (sortedArr.size() - 1) / 2;
		int indexB = sortedArr.size() / 2;
		mode = ((float) (sortedArr.get(indexA) + sortedArr.get(indexB))) / 2;
                modes.add(mode);
                attributeses.get(i).setMode(mode);
            }
            // Else if our array's length is odd, then we simply find the value at the center index
            else  
            {
                int index = (sortedArr.size() - 1) / 2;
		mode= sortedArr.set(index, sortedArr.get(index));
                modes.add(mode);
                attributeses.get(i).setMode(mode);
            }		
            
        }
        
      
    }

    public static ArrayList<Float> getModes() {
        return modes;
    }

    public static void setModes(ArrayList<Float> modes) {
        Mode.modes = modes;
    }

    public float getData() {
        return data;
    }

    public void setData(float data) {
        this.data = data;
    }
    
    
}
