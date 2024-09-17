package searchTest;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

public class BaseSearchTest extends BasePage {
    // эту логику нужно вынести в BasePage
    protected static WebDriver driver;
    @BeforeAll
      public static void initDriver(){
driver = new ChromeDriver();// здесь мы выбираем драйвер и задаем options

    }
}
