package test_case.codes;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
public class Linkedin {
     WebDriver driver;

    public Linkedin() {
        WebDriverManager.chromeDriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();
    }

    public void testcase03() {
        System.out.println("Start Test case: testCase03");
        driver.get("https://in.linkedin.com/");
        WebElement userName = driver.findElement(By.xpath("//*[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        Actions action = new Actions(driver); // Initialize Actions

        action.sendKeys(userName, "ghuletanupriya@gmail.com").sendKeys(Keys.TAB).sendKeys(password, "Tanulinkedin@1998").perform();

        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'ember948\'']/div[3]/ul/li[1]/div/div[2]/div/a/div/div/div/div/span[1]")));

        driver.findElement(By.xpath("//span[text()='Start a post']/../parent::button")).click();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='text-body-medium-bold pr1 text-heading-large']")));

        driver.findElement(By.xpath("//span[text()='Start a post']/../parent::button")).click();
        driver.findElement(By.xpath("//*[@id=\'ember2474\']/span")).click();
        driver.findElement(By.xpath("//*[@id=\"ember2516\"]")).click();

        // Click the Add Media Button (corrected the XPath)
        driver.findElement(By.xpath("//*[@id=\"ember2576\"]/button/span")).click();

        // Upload the picture (corrected the XPath and file path)
        WebElement uploadImage = driver.findElement(By.xpath("//*[@id=\'ember2604\']/div/div/div[1]/div/div[2]/div/label"));
        uploadImage.sendKeys("C:\\Users\\admin\\Pictures\\Camera Roll\\istockphoto-1258156435-612x612.jpg");

        driver.findElement(By.xpath("//*[@id=\'ember2608\']/span")).click();
        driver.findElement(By.xpath("//*[@id=\'ember2664\']/span")).click();

        // Check if the image is displayed
        boolean status = driver.findElement(By.xpath("//img[@alt='Image preview']")).isDisplayed();
        System.out.println("Image is displayed on the timeline: " + status);

        System.out.println("End Test case: testcase03");
    }
}