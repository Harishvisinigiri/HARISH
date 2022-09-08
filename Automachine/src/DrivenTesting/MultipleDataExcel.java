package DrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./data/Invalidlogin.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount=wb.getSheet("Invalidlogin").getLastRowNum();
		for (int i = 0; i <=rowcount; i++) 
		{
			String un = wb.getSheet("Invalidlogin").getRow(i).getCell(0).toString();
			String pw = wb.getSheet("Invalidlogin").getRow(i).getCell(1).toString();
			System.out.println(un+"\t"+pw);
		}
		/*FileInputStream fis=new FileInputStream("./data/createCustomer.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
		*/
}
}
