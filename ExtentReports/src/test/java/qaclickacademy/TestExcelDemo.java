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

public class TestExcelDemo{

    public static void main(String[] args) throws IOException {

        ArrayList<String> arr = new ArrayList<String>();
        FileInputStream fis = new FileInputStream("D:\\Test.xlsx");
        XSSFWorkbook sheets = new XSSFWorkbook(fis);

        System.out.println(sheets.getNumberOfSheets());
        int sheetsCount = sheets.getNumberOfSheets();
        for (int i = 0; i < sheetsCount; i++) {
            if (sheets.getSheetName(i).equalsIgnoreCase("testData")) {
                System.out.println(sheets.getSheetIndex("testData"));

                XSSFSheet sheet = sheets.getSheetAt(i);
                Iterator<Row> row = sheet.iterator();
                Row firstRow = row.next();
                Iterator<Cell> ce = firstRow.cellIterator();
                int index = 0;
                while (ce.hasNext()) {
                    Cell value = ce.next();
                    if (value.getStringCellValue().equalsIgnoreCase("Test Cases")) {
                        index = value.getColumnIndex();
                        System.out.println(index);
                    }
                }
                while (row.hasNext()){
                    Row rw = row.next();
                    if(rw.getCell(index).getStringCellValue().equalsIgnoreCase("Sign in")){
                        Iterator<Cell> c = rw.cellIterator();
                        while(c.hasNext()){
                            Cell c1 = c.next();
                            if(c1.getCellType()== CellType.STRING) {
                                arr.add(c1.getStringCellValue());
                            }else{
                                arr.add(NumberToTextConverter.toText(c1.getNumericCellValue()));
                            }
                        }
                    }
                }
                System.out.println(arr);
            }
        }
    }
}

