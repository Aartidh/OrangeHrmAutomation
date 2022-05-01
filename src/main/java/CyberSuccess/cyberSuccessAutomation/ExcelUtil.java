package CyberSuccess.cyberSuccessAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
     	private static final Object[][] Excelobject = null;
	  private static Workbook wb=null;
	 static Row row;
	 static String extension;
	 static Sheet sheet;
	 private static void getWorkbookInstance(String filePath, FileInputStream input) throws IOException { 
		 extension =filePath.substring(filePath.indexOf("."));
		 if(extension.equals(".xlsx")) 
			{
				System.out.println(extension);
				wb = new XSSFWorkbook(input);
			}
		  else if (extension.equals(".xlx")) {
				wb = new HSSFWorkbook(input);
			}}
		  
     
		
	 public static Object[][] getExcelData(String filePath,String sheetName)
		 throws IOException {
		  
		  FileInputStream input = new FileInputStream(filePath); extension =
		  filePath.substring(filePath.indexOf(".")); //System.out.println(extension);
		  
		  getWorkbookInstance(filePath,input); Sheet sheet=wb.getSheet(sheetName) ; int
		  totalRow=sheet.getLastRowNum(); System.out.println(totalRow);
		  row=sheet.getRow(0); int totalColumn=row.getPhysicalNumberOfCells();
		  System.out.println(totalColumn); Object[][] excelobject=new
		  Object[totalRow+1][totalColumn]; for(int i=1;i<=totalRow;i++) { for(int
		  j=0;j<totalColumn;j++) { // sheet.getRow(i).getCell(j); //
		  System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()); Cell cell=
		  sheet.getRow(i).getCell(j);
		  excelobject[i][j]=Objects.isNull(cell)?null:getCellData(cell); } }
		  wb.close(); return excelobject;} public static Object getCellData(Cell cell)
		  { switch(cell.getCellType()) { case NUMERIC: return
		  cell.getNumericCellValue();
		  
		  case STRING: return cell.getStringCellValue();
		  
		 case BOOLEAN: return cell.getBooleanCellValue();
		  
		  case BLANK: } return " ";}
		  
		  
		  
		  // System.out.print(excelobject[i][j]); // System.out.print(" ");
		 			public static void setExcelData(String filePath,String sheetName,int rowNum,int colNum,String value) throws IOException {
					FileInputStream input = new FileInputStream(filePath);
					getWorkbookInstance(filePath, input);
					if(Objects.isNull(wb.createSheet(sheetName)))
					{
						 sheet = wb.createSheet(sheetName);
					}else {
						 sheet = wb.getSheet(sheetName);

					}
				Row row=sheet.createRow(rowNum);
				row.createCell(colNum).setCellValue(value);
				FileOutputStream fos=new FileOutputStream(filePath);
				wb.write(fos);
				wb.close();
					
	
				}

	public static void main(String[] args) throws IOException
	{      String filePath = "C:\\Users\\Admin\\Documents\\TestData.xlsx";
	for(int i=0;i<=6;i++) {
		
		for(int j=0;j<=6;j++) {

	setExcelData(filePath, "EmpList1", i, j, "Aarti");
	}}
	}}
