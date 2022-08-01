package qaclickacademy;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class TestExcelDemo2{

    public static void main(String[] args) throws IOException {

        ArrayList<String> arr = new ArrayList<String>();
        FileInputStream fis = new FileInputStream("D:\\Test.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        int sheets = workbook.getNumberOfSheets();
        System.out.println(sheets);
        for(int i=0;i<sheets;i++){
            if(workbook.getSheetName(i).equalsIgnoreCase("DemoData")){
                System.out.println(workbook.getSheetIndex("DemoData"));

                XSSFSheet sheet = workbook.getSheetAt(i);
                Iterator<Row> row = sheet.iterator();
                Row firstRow = row.next();
                Iterator<Cell> cell = firstRow.cellIterator();
                System.out.println(cell.next().getStringCellValue());
                int index = 0;
                while(cell.hasNext()){
                    Cell cellName = cell.next();
                    if(cellName.getStringCellValue().equalsIgnoreCase("TestCase")){
                        System.out.println(cellName.getColumnIndex());
                        index = cellName.getColumnIndex();
                    }
                }
                while(row.hasNext()){
                    Row newRow = row.next();
                    if(newRow.getCell(index).getStringCellValue().equalsIgnoreCase("Sign up")){
                        System.out.println(newRow.getRowNum());
                        cell = newRow.cellIterator();
                        for(int j = 1;j<index;j++){
                            Cell ce = cell.next();
                            if(ce.getCellType()== CellType.STRING) {
                                arr.add(ce.getStringCellValue());
                            }else{
                                arr.add(NumberToTextConverter.toText(ce.getNumericCellValue()));
                            }
                        }
                        System.out.println(arr);
                    }
                }

            }
        }
    }
}
