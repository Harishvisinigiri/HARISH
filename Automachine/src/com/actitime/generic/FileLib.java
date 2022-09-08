/**
 * this is generic class for data driven testing
 * @author Harish
 */

package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
/**
 * this is a generic for reading the data from property file
 * @param key
 * @return String
 * @throws IOException 
 */
	public String getpropertData(String key) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./data/commandata.property");
		Properties p=new Properties();
		p.load(fis);
        String data=p.getProperty(key);
		return data;
	}
	/**
	 * this is a generic for reading the data from excel file
	 * @param sheet1
	 * @param row
	 * @param cell
	 * @param data
	 * @return String
	 * @throws EncryptedDocumentException
	 * @author althi
	 * @throws IOException 
	 */
	public String getExcelData(String sheet1,int row,int cell)throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./data/createCustomer.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
        String data = wb.getSheet("sheet1").getRow(row).getCell(cell).getStringCellValue();
        return data;
	}
	/**
	 * this is a generic for reading the data from excel file
	 * @param sheet1
	 * @param row
	 * @param cell
	 * @param data
	 * @throws EncryptedDocumentException
	 * throws Exception
	 */

}