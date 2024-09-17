package pages;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class BasePage {
    ChromeDriverManager driverManager;

    public ChromeDriverManager getDriverManager(){
        driverManager = new ChromeDriverManager();
        return driverManager;
    }
}
