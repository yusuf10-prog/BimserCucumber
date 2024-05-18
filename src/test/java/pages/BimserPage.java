package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BimserPage {

    public BimserPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//b[@class='navbar__title text--truncate']")
    public WebElement bimser;


    @FindBy(xpath = "//a[normalize-space()='Documentation']")
    public WebElement documentation;

    @FindBy(partialLinkText = "Bimser Blog")
    public WebElement bimserBlog;

    @FindBy(xpath = "//div[@class='navbar__item dropdown dropdown--hoverable dropdown--right']")
    public WebElement dilSecimi;

    @FindBy(xpath = "//div[@class='navbar__item dropdown dropdown--hoverable dropdown--right']")
    public WebElement dropdownMenu;
}
