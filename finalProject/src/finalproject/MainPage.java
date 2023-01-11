package finalproject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MainPage {
    ortalama average = new ortalama();  
    int holder=0;    
        
    public static void main(String[] args) throws IOException, FileNotFoundException, InterruptedException, RejectedExecutionException, ExecutionException {        
        
        ExcelReader();
        new MainPageGUI().setVisible(true);
       

        }
    public static void ExcelReader(){
        Attributes attributes = new Attributes();
        Frequency freq = new Frequency();
        String data;
        int rownum=0;
        int iter=0;
        try{
            FileInputStream fins = new FileInputStream(new File("D:/AirQualityUCI.xlsx") );
            XSSFWorkbook wb = new XSSFWorkbook(fins); 
            XSSFSheet sheet = wb.getSheetAt(0); 
            Iterator<Row> itr = sheet.iterator();    //iterating over excel file
        // Print line break
        System.out.println(" ");
            while (itr.hasNext()){
                Row column = itr.next();
                Iterator<Cell> cellIterator = column.cellIterator();   //iterating over each column
                while (cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()){      
                        case Cell.CELL_TYPE_STRING:    //field that represents string cell type
                            data = cell.getStringCellValue();
                            //System.out.println(data);
                            Attributes attribute = new Attributes(data);                            
                            attributes.getAttributeses().add(attribute);
                            rownum++;
                            break;
                        case Cell.CELL_TYPE_NUMERIC:    //field that represents number cell type     
                                if(iter>=rownum){
                                    iter=0;
                                }
                                Float dataFloat = (float) cell.getNumericCellValue(); 
                                if(dataFloat != -200){
                                    //  System.out.println(dataDouble);
                                    attributes.getAttributeses().get(iter).getDatas().add(dataFloat);
                                    iter++;
                                }                              
                                break;                          
                          }
                    }
            }
            fins.close(); 
            }
            catch (IOException e) {
            }
            attributes.setRowNum(rownum);
            freq.findFrequency(attributes.getAttributeses());
            attributes.getAttributeses().get(5).getDatas().add((float)500);
        
    }
    
   

    
}
