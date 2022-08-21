package AdactinProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataReader {
	
	
	
	
	

	public static void main(String[] args) throws Throwable {
		File f =new File("C:\\Users\\vijay\\OneDrive\\Pictures\\vj\\adactinHotel\\src\\dataReader\\adatin project.xlsx");
		FileInputStream fo=new FileInputStream(f);
		Workbook wb =new XSSFWorkbook(fo);
		Sheet s= wb.getSheet("Sheet1");
	int r = s.getPhysicalNumberOfRows();
	
	for (int i = 0; i <r; i++) {
		Row row = s.getRow(i);
		int c = row.getPhysicalNumberOfCells();
		
		for (int j = 0; j < c; j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			
			if (cellType.equals(CellType.STRING)) {
				String sv = cell.getStringCellValue();
				System.out.println(sv);
			}else if (cellType.equals(cellType.NUMERIC)) {
				double Value = cell.getNumericCellValue();
				int a=(int)Value;
				System.out.println(a);
				
			}
		}
	}
		

	}

}
