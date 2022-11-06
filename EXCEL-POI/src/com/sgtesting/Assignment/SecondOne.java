package com.sgtesting.Assignment;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SecondOne {

	public static void main(String[] args) {
		writeContent();
	}
	private static void writeContent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("cloursname");
			row=sh.createRow(9);
			cell=row.createCell(0);
			cell.setCellValue("coloursname");
			//1
			cell=row.createCell(1);
			cell.setCellValue("red");
			//2
		
			cell=row.createCell(2);
			cell.setCellValue("yellow");
			//3
			
			cell=row.createCell(3);
			cell.setCellValue("green");
			//4
			
			cell=row.createCell(4);
			cell.setCellValue("peech");
			//5
			
			cell=row.createCell(5);
			cell.setCellValue("darkgreen");
			//6
			
			cell=row.createCell(6);
			cell.setCellValue("lightgreen");
			//7
			
			cell=row.createCell(7);
			cell.setCellValue("peech1");
			//8
			
			cell=row.createCell(8);
			cell.setCellValue("blue");
			//9
			
			cell=row.createCell(9);
			cell.setCellValue("lightblue");
			//10
			
			cell=row.createCell(10);
			cell.setCellValue("darkblue");
			//11
			
			cell=row.createCell(11);
			cell.setCellValue("pink");
			//12
		
			cell=row.createCell(12);
			cell.setCellValue("lightpink");
			//13
			
			cell=row.createCell(13);
			cell.setCellValue("darkpink");
			//14
			
			cell=row.createCell(14);
			cell.setCellValue("color");
			//15
			
			cell=row.createCell(15);
			cell.setCellValue("colour1");
			//16
			
			cell=row.createCell(15);
			cell.setCellValue("colour2");
			//17
			
			cell=row.createCell(16);
			cell.setCellValue("colur3");
			//18
			
			cell=row.createCell(17);
			cell.setCellValue("colour4");
			//19
			
			cell=row.createCell(18);
			cell.setCellValue("colour5");
			//20
		
			cell=row.createCell(19);
			cell.setCellValue("colour5");
			//out create
			fout=new FileOutputStream("D:\\EXCEL\\ColorTwoAssign.xlsx");
			wb.write(fout);
									
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
