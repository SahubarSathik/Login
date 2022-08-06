package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelWrite {
	public static void main(String[] args) throws Exception {
		File f = new File("./test_data.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet sheet = book.createSheet("Regression");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Bala");
		FileOutputStream fo = new FileOutputStream(f);
		book.write(fo);

	}
}
