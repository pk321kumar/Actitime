package com.actime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addNewBtn;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCustomerBtn;
@FindBy(xpath="//input[@placeholder='Enter Customer Name'and @class]")
private WebElement enterCustomerNameTxtbox;
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement enterCustomerDescriptionTxtbox;
@FindBy(xpath="//div[text()='- Select Customer -'and @class='emptySelection']")
private WebElement selectCustomerDropDownbox;
@FindBy(xpath="//div[@class='searchItemList']/div[text()='Our company']")
private WebElement ourCompanyOption;
@FindBy(xpath="//div[text()='Create Customer']")
private WebElement createCustomerBtn;

public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getSelectCustomerDropDownbox() {
	return selectCustomerDropDownbox;
}
public WebElement getAddNewBtn() {
	return addNewBtn;
}
public WebElement getNewCustomerBtn() {
	return newCustomerBtn;
}
public WebElement getEnterCustomerNameTxtbox() {
	return enterCustomerNameTxtbox;
}
public WebElement getEnterCustomerDescriptionTxtbox() {
	return enterCustomerDescriptionTxtbox;
}
public WebElement getOurCompanyOption() {
	return ourCompanyOption;
}
public WebElement getCreateCustomerBtn() {
	return createCustomerBtn;
}

}
