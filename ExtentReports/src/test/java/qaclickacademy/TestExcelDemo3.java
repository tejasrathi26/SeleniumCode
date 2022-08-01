package qaclickacademy;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class TestExcelDemo3{

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("D:\\Test.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        int sheets = workbook.getNumberOfSheets();
        for(int i=0;i<sheets;i++){
            if(workbook.getSheetName(i).equalsIgnoreCase("DiffData")){
                //System.out.println(workbook.getSheetAt(i));
                XSSFSheet sheet = workbook.getSheetAt(i);

                Iterator<Row> row = sheet.iterator();
                Row firstRow = row.next();
                Iterator<Cell> cell = firstRow.cellIterator();
                int index = 0;
                while(cell.hasNext()) {
                    Cell ce = cell.next();
                    if(ce.getStringCellValue().equalsIgnoreCase("Test Cases")){
                        index = ce.getColumnIndex();
                        System.out.println(index);
                    }
                }
                while(row.hasNext()){
                    Row rw = row.next();
                    if(rw.getCell(index).getStringCellValue().equalsIgnoreCase("Sign out")){
                        cell = rw.cellIterator();
                        while(cell.hasNext()){
                            Cell c = cell.next();
                            System.out.println(c.getStringCellValue());
                        }
                    }
                }
            }
        }
    }
}
