package com.sgtesting.Assignment;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FlowerOne {

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
				sh=wb.createSheet("flowername");
				row=sh.createRow(0);
				cell=row.createCell(0);
				cell.setCellValue("flowername");
				//1
				row=sh.createRow(1);
				cell=row.createCell(0);
				cell.setCellValue("flowername1");
				//2
				row=sh.createRow(2);
				cell=row.createCell(0);
				cell.setCellValue("flowername2");
				//3
				row=sh.createRow(3);
				cell=row.createCell(0);
				cell.setCellValue("flowername3");
				//4
				row=sh.createRow(4);
				cell=row.createCell(0);
				cell.setCellValue("flowername4");
				//5
				row=sh.createRow(5);
				cell=row.createCell(0);
				cell.setCellValue("flowername5");
				//6
				row=sh.createRow(6);
				cell=row.createCell(0);
				cell.setCellValue("flowername6");
				//7
				row=sh.createRow(7);
				cell=row.createCell(0);
				cell.setCellValue("flowername7");
				//8
				row=sh.createRow(8);
				cell=row.createCell(0);
				cell.setCellValue("flowername8");
				//9
				row=sh.createRow(9);
				cell=row.createCell(0);
				cell.setCellValue("flowername9");
				//10
				row=sh.createRow(10);
				cell=row.createCell(0);
				cell.setCellValue("flowername10");
				//11
				row=sh.createRow(11);
				cell=row.createCell(0);
				cell.setCellValue("flowername11");
				//12
				row=sh.createRow(12);
				cell=row.createCell(0);
				cell.setCellValue("flowername12");
				//13
				row=sh.createRow(13);
				cell=row.createCell(0);
				cell.setCellValue("flowername13");
				//14
				row=sh.createRow(14);
				cell=row.createCell(0);
				cell.setCellValue("flowername14");
				//15
				row=sh.createRow(15);
				cell=row.createCell(0);
				cell.setCellValue("flowername15");
				//16
				row=sh.createRow(16);
				cell=row.createCell(0);
				cell.setCellValue("flowername16");
				//17
				row=sh.createRow(17);
				cell=row.createCell(0);
				cell.setCellValue("flowername17");
				//18
				row=sh.createRow(18);
				cell=row.createCell(0);
				cell.setCellValue("flowername18");
				//19
				row=sh.createRow(19);
				cell=row.createCell(0);
				cell.setCellValue("flowername19");
				//20
				row=sh.createRow(20);
				cell=row.createCell(0);
				cell.setCellValue("flowername20");
				//out create
				fout=new FileOutputStream("D:\\EXCEL\\FloweroneAssign.xlsx");
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
