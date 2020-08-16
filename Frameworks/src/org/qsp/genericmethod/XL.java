package org.qsp.genericmethod;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XL {
	public static int getRowCount(String path, String sheet)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		int rc =-1;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			rc = wb.getSheet(sheet).getLastRowNum();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return rc;
	}
	public static int getCellCount(String path, String sheet) 
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		int cc = -1;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			cc = wb.getSheet(sheet).getRow(0).getLastCellNum();
		}catch (Exception e) {
			e.printStackTrace();
			}
		return cc;
	}
	public static String getdata(String path, String sheet, int r, int c)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		String v = " ";
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		v = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		System.out.println("Cell Value " +  v);
		}catch (Exception e) {
			e.printStackTrace();
			}
		return v;
			
		}
	}
	
		
		
		



