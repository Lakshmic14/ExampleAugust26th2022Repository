package com.sgtesting.Assignment;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FourthTwoColumns {

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
			sh=wb.createSheet("Credentials");
			//First Row
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//2
			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//2
			row=sh.createRow(2);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//3
			row=sh.createRow(3);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//4
			row=sh.createRow(4);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//5
			row=sh.createRow(5);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//6
			row=sh.createRow(6);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//7
			row=sh.createRow(7);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//8
			row=sh.createRow(8);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//9
			row=sh.createRow(9);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//10
			row=sh.createRow(10);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//11
			row=sh.createRow(11);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//12
			row=sh.createRow(12);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//13
			row=sh.createRow(13);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//14
			row=sh.createRow(14);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//15
			row=sh.createRow(15);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//16
			row=sh.createRow(16);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//17
			row=sh.createRow(17);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//18
			row=sh.createRow(18);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//19
			row=sh.createRow(19);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//20
			row=sh.createRow(20);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			//21
			row=sh.createRow(21);
			cell=row.createCell(0);
			cell.setCellValue("flowername");
			cell=row.createCell(1);
			cell.setCellValue("colourname");
			fout=new FileOutputStream("D:\\EXCEL\\atwocolumnFifth.xlsx");
			wb.write(fout);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
