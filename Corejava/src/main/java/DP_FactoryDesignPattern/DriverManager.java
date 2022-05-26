package DP_FactoryDesignPattern;
import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
    WebDriver driver;

    public abstract WebDriver getDriver();

}
