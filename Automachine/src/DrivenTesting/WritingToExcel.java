package DrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./data/createCustomer.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
        wb.getSheet("sheet1").getRow(1).getCell(1).setCellValue("pass");
        FileOutputStream fos=new FileOutputStream("./data/createCustomer.xlsx");
        wb.write(fos);
        wb.close();
	}

}
