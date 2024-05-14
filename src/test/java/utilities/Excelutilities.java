package utilities;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excelutilities {
	public static String getCellData(String xlfile, String xlsheet, int rownum, int colnum) throws IOException {
        FileInputStream fi = new FileInputStream(xlfile);
        Workbook wb = new XSSFWorkbook(fi);
        Sheet ws = wb.getSheet(xlsheet);
        Row row = ws.getRow(rownum);
        Cell cell = row.getCell(colnum);        
        String data;
        if (cell != null) {
            data = cell.toString();
        } else {
            data = "";
        }        
        wb.close();
        fi.close();
        return data;
    }
    public static String[] getCellDataRange(String xlfile, String xlsheet, int rownum, int startCol, int endCol) throws IOException {
        FileInputStream fi = new FileInputStream(xlfile);
        Workbook wb = new XSSFWorkbook(fi);
        Sheet ws = wb.getSheet(xlsheet);
        Row row = ws.getRow(rownum);
        String[] data = new String[endCol - startCol + 1];
        for (int i = startCol; i <= endCol; i++) {
            Cell cell = row.getCell(i);
            if (cell != null) {
                data[i - startCol] = cell.toString();
            } else {
                data[i - startCol] = "";
            }
        }
        
        wb.close();
        fi.close();
        
        return data;
    }
    public static void setCellData(String xlfile, String xlsheet, int rownum, int colnum, String data) throws IOException {
        FileInputStream fi = new FileInputStream(xlfile);
        Workbook wb = new XSSFWorkbook(fi);
        Sheet ws = wb.getSheet(xlsheet);
        Row row = ws.getRow(rownum);
        if (row == null) {
            row = ws.createRow(rownum);
        }
        Cell cell = row.getCell(colnum);
        if (cell == null) {
            cell = row.createCell(colnum);
        }
        cell.setCellValue(data);
        FileOutputStream fo = new FileOutputStream(xlfile);
        wb.write(fo);
        fo.flush();
        wb.close();
        fo.close();
    }
}