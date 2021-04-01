package org.pom;

import java.io.IOException;

import org.generics.Autoconstant2;
import org.generics.Basepage;
import org.generics.ExcelLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrameworkPOM extends Basepage implements Autoconstant2
{

	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstnameTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastnameTextfield;
	
	@FindBy(xpath="//select[@name='countrycode']")
	private WebElement countrycodeDropdownlist;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement mobilenoTextfield;
	
	public FrameworkPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void submit() throws IOException
	{
		firstnameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_path, sheet_name, 0, 0));
		lastnameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_path, sheet_name, 0, 1));
		selectbyvisbiletext(countrycodeDropdownlist, "+1");
		mobilenoTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_path, sheet_name, 0, 2));
	}

}
