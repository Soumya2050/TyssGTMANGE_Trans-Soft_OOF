package apractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.GTMange.TransSoft.genericutility.BaseClass;

public class Test1 extends BaseClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\srjen\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		DataFormatter format = new DataFormatter();

		String value = format.formatCellValue(wb.getSheet("Sheet1").getRow(1).getCell(1));

//			 = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();

		System.out.println(value);

		wb.close();
	}

}
