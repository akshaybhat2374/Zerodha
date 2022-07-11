package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Prametrization { 
	public static String  Getsheet(int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("D:\\JAVA_Eclipse\\KiteZerodha\\src\\test\\resources\\A.B.xlsx");
String value=WorkbookFactory.create(file).getSheet("Input").getRow(row).getCell(cell).getStringCellValue();
		return value;
		
		
	}

	}





