package seleniumBasic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class Excelpractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C://Users//Passion//Desktop//CheckExcel.xlsx");
		
		FileInputStream fi = new FileInputStream(file);
		
		HSSFWorkbook wb = new HSSFWorkbook(fi);
		
		
		HSSFSheet sheet = wb.getSheetAt(0);
		
		
		
		

	}

}
