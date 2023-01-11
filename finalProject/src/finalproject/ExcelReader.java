package finalproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader{
    String data;
    int holder=0;
    int rownum=0;
    int iter=0;
    static ArrayList<Attributes> attributeses = new ArrayList<>();
    public void excelRead() {
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
                        attributeses.add(attribute);
                        rownum++;
                        break;
                    case Cell.CELL_TYPE_NUMERIC:    //field that represents number cell type     
                            if(iter>=rownum){
                                iter=0;
                            }
                            float dataFloat= (float) cell.getNumericCellValue();          
                          //  System.out.println(dataDouble);
                            attributeses.get(iter).getDatas().add(dataFloat);
                            iter++;
                            break;                          
                          
                      }
                }
        }
        fins.close(); 
        }
        catch (IOException e) {
        }
    Attributes attributes = new Attributes();
        //System.out.println(attributeses.get(1).getDatas().size());
    attributes.setRowNum(rownum);

        
}
    
}

