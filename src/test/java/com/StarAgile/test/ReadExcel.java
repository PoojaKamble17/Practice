package com.StarAgile.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadExcel {
	
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	
	@Test
	
	public void fblogin() throws IOException {
		
		System.setProperty("webdriver.chorme.Driver", "C:\\Users\\DELL\\Documents\\Drivers\\chromedriver-mac-x64\\chromedriver-mac-x64\\chormedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		// import the excel from the file system
		
		// open the workbook
		
		// open the sheet
		
		// get the row and column and iterate to get cell value
		
		File src = new File("C:\\Users\\DELL\\eclipse-workspace-staragile\\StarAgile\\TestData.xlsx");
		
		// loading the file
		FileInputStream fis = new FileInputStream(src);
		
		// load the work book
		
		workbook = new XSSFWorkbook(fis);
		
		//go to sheet at 0 index - this will pick the sheet1 
		
		sheet = workbook.getSheetAt(0);
		
		for (int i = 1; i <=sheet.getLastRowNum() ; i++) {
			
			// import the data from the cell to load username
			
			cell = sheet.getRow(i).getCell(0);
			
			driver.findElement(By.xpath("//input[@name = 'email']")).clear();
			
			driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys(cell.getStringCellValue());
			
			// import the data from the cell to load password
			
			cell = sheet.getRow(i).getCell(1);
			
			driver.findElement(By.xpath("//input[@name = 'pass']")).clear();
			
			driver.findElement(By.xpath("//input[@name = 'pass']")).sendKeys(cell.getStringCellValue());
			
			// writing operation
			
			String title = driver.getTitle();
			System.out.println(title);

			// writing this title to excel sheet
			
			FileOutputStream fos = new FileOutputStream(src);
			
			sheet.getRow(i).createCell(2).setCellValue(title);
			
			workbook.write(fos);
			
			
			
			
			
			
			
		
	}

	}
}
