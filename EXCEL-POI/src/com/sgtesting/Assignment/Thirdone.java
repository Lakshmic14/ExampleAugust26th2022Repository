package com.sgtesting.Assignment;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Thirdone {

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
			sh=wb.createSheet("Cityname");
			row=sh.createRow(0);
			cell=row.createCell(4);
			cell.setCellValue("cityname");
			//1
			row=sh.createRow(1);
			cell=row.createCell(4);
			cell.setCellValue("cityname1");
			//2
			row=sh.createRow(2);
			cell=row.createCell(4);
			cell.setCellValue("cityname2");
			//3
			row=sh.createRow(3);
			cell=row.createCell(4);
			cell.setCellValue("cityname3");
			//4
			row=sh.createRow(4);
			cell=row.createCell(4);
			cell.setCellValue("cityname4");
			//5
			row=sh.createRow(5);
			cell=row.createCell(4);
			cell.setCellValue("cityname5");
			//6
			row=sh.createRow(6);
			cell=row.createCell(4);
			cell.setCellValue("cityname6");
			//7
			row=sh.createRow(7);
			cell=row.createCell(4);
			cell.setCellValue("cityname7");
			//8
			row=sh.createRow(8);
			cell=row.createCell(4);
			cell.setCellValue("cityname8");
			//9
			row=sh.createRow(9);
			cell=row.createCell(4);
			cell.setCellValue("cityname9");
			//10
			row=sh.createRow(10);
			cell=row.createCell(4);
			cell.setCellValue("cityname10");
			//11
			row=sh.createRow(11);
			cell=row.createCell(4);
			cell.setCellValue("cityname11");
			//12
			row=sh.createRow(12);
			cell=row.createCell(4);
			cell.setCellValue("cityname12");
			//13
			row=sh.createRow(13);
			cell=row.createCell(4);
			cell.setCellValue("cityname13");
			//14
			row=sh.createRow(14);
			cell=row.createCell(4);
			cell.setCellValue("cityname14");
			//15
			row=sh.createRow(15);
			cell=row.createCell(4);
			cell.setCellValue("cityname15");
			//16
			row=sh.createRow(16);
			cell=row.createCell(4);
			cell.setCellValue("cityname16");
			//17
			row=sh.createRow(17);
			cell=row.createCell(4);
			cell.setCellValue("cityname17");
			//18
			row=sh.createRow(18);
			cell=row.createCell(4);
			cell.setCellValue("cityname18");
			//19
			row=sh.createRow(19);
			cell=row.createCell(4);
			cell.setCellValue("cityname19");
			//20
			row=sh.createRow(20);
			cell=row.createCell(4);
			cell.setCellValue("cityname20");
			//out create
			fout=new FileOutputStream("D:\\EXCEL\\cityAssign.xlsx");
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
