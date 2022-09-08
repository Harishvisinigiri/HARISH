package DrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib 
{
	public String getpropertyData(String Key) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./data/commandata.property");
		Properties p=new Properties();
		p.load(fis);
        String data=p.getProperty(Key);
		return data;
	}
	public String getExelData(String sheet1,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/createCustomer.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("sheet1").getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	}
}
