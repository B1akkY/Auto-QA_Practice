package TestProject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProject {

    WebDriver driver = new ChromeDriver();

    private By login = By.xpath("example_login_path");
    private By password = By.xpath("example_password_path");
    private By loginBtn = By.xpath("example_looginBtn_path");
    private By getErrorText = By.xpath("example_getErrorText_path");

    @BeforeEach
    public void setUp() {

        driver.get("https://example.ru/login");
    }

    @Test
    public void R_1(){

        driver.manage().window().maximize();
        driver.findElement(login).click();
        driver.findElement(login).sendKeys("example@gmail.com");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("123Example");
        driver.findElement(loginBtn).click();
        String url = driver.getCurrentUrl();
        Assertions.assertEquals("https://user-room/", url);

    }

    @Test
    public void R_2(){

        driver.manage().window().maximize();
        driver.findElement(login).click();
        driver.findElement(login).sendKeys("example@gmail.com");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("124Example");
        driver.findElement(loginBtn).click();
        String url = driver.getCurrentUrl();
        Assertions.assertEquals("https://example.ru/login", url);

    }

    @Test
    public void R_3(){

        driver.manage().window().maximize();
        driver.findElement(loginBtn).click();
        String getError = driver.findElement(getErrorText).getText();
        Assertions.assertEquals("Введите логин и пароль", getError);

    }

    @Test
    public void R_4() {

        driver.manage().window().maximize();
        driver.findElement(login).click();
        driver.findElement(login).sendKeys("example@gmail.com");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("124Example");
        driver.findElement(loginBtn).click();
        String getError = driver.findElement(getErrorText).getText();
        Assertions.assertEquals("Логин или пароль введены неверно", getError);

    }

    @Test
    public void R_5() {

        driver.manage().window().maximize();
        driver.findElement(login).click();
        driver.findElement(login).sendKeys("example@gmail.com");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("123 Example");
        driver.findElement(loginBtn).click();
        String getError = driver.findElement(getErrorText).getText();
        Assertions.assertEquals("Логин или пароль введены неверно", getError);

    }

    @Test
    public void R_6() {

        driver.manage().window().maximize();
        driver.findElement(login).click();
        driver.findElement(login).sendKeys("example@gmail.com");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("124Example");
        driver.findElement(loginBtn).click();
        String getError = driver.findElement(getErrorText).getText();
        Assertions.assertEquals("Логин или пароль введены неверно", getError);
        int n = 0;
        while(n < 5){
            driver.findElement(loginBtn).click();
            n++;
        }
        WebElement getError2 = driver.findElement(By.xpath("example_getError2_path"));
        Assertions.assertEquals("Возможность авторизации временно заблокирована", getError2.getText());

    }

    @Test
    public void R_7() {

        driver.manage().window().maximize();
        driver.findElement(login).click();
        driver.findElement(login).sendKeys("example@gmail.com");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("1Ex");
        driver.findElement(loginBtn).click();
        WebElement getError3 = driver.findElement(By.xpath("example_getError3_path"));
        Assertions.assertEquals("Пароль должен содержать не менее 6 символов", getError3.getText());

    }

    @Test
    public void R_8() {

        driver.manage().window().maximize();
        driver.findElement(login).click();
        driver.findElement(login).sendKeys("example@gmail.com");
        driver.findElement(password).click();
        String s = "123Example";
        StringBuilder n = new StringBuilder();
        while (n.length() < 129) {
            n.append(s);
            driver.findElement(password).sendKeys("123Example");
        }
        driver.findElement(loginBtn).click();
        WebElement getError4 = driver.findElement(By.xpath("example_getError4_path"));
        Assertions.assertEquals("Пароль не должен содержать более 128 символов", getError4.getText());

    }

    @Test
    public void R_11_1() {

        driver.manage().window().maximize();
        driver.findElement(login).click();
        driver.findElement(login).sendKeys("example@gmail.com");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("Example");
        driver.findElement(loginBtn).click();
        String getError = driver.findElement(getErrorText).getText();
        Assertions.assertEquals("Логин или пароль введены неверно", getError);

    }

    @Test
    public void R_11_2() {

        driver.manage().window().maximize();
        driver.findElement(login).click();
        driver.findElement(login).sendKeys("example@gmail.com");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("123EXAMPLE");
        driver.findElement(loginBtn).click();
        String getError = driver.findElement(getErrorText).getText();
        Assertions.assertEquals("Логин или пароль введены неверно", getError);

    }

    @Test
    public void R_11_3() {

        driver.manage().window().maximize();
        driver.findElement(login).click();
        driver.findElement(login).sendKeys("example@gmail.com");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("123example");
        driver.findElement(loginBtn).click();
        String getError = driver.findElement(getErrorText).getText();
        Assertions.assertEquals("Логин или пароль введены неверно", getError);

    }

    @Test
    public void R_11_4() {

        driver.manage().window().maximize();
        driver.findElement(login).click();
        driver.findElement(login).sendKeys("example@gmail");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("Example");
        driver.findElement(loginBtn).click();
        String getError = driver.findElement(getErrorText).getText();
        Assertions.assertEquals("Логин или пароль введены неверно", getError);

    }

    @Test
    public void R_11_5() {

        driver.manage().window().maximize();
        driver.findElement(login).click();
        driver.findElement(login).sendKeys("example@gmail.com");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("Ex@mpl&");
        driver.findElement(loginBtn).click();
        String getError = driver.findElement(getErrorText).getText();
        Assertions.assertEquals("Логин или пароль введены неверно", getError);

    }

    @Test
    public void R_12(){

        driver.manage().window().maximize();
        driver.findElement(login).click();
        driver.findElement(login).sendKeys("notexample@gmail.com");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("123Example");
        driver.findElement(loginBtn).click();
        WebElement getError5 = driver.findElement(By.xpath("example_getError5_path"));
        Assertions.assertEquals("Аккаунта с указанным адресом не существует", getError5.getText());

    }

    @Test
    public void R_13(){

        driver.manage().window().maximize();
        driver.findElement(login).click();
        driver.findElement(login).sendKeys("example@gmail.com");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("123Example");
        WebElement checkbox = driver.findElement(By.xpath("example_checkbox_path"));
        checkbox.click();
        Assertions.assertTrue(checkbox.isSelected());
        driver.findElement(loginBtn).click();
        WebElement logOut = driver.findElement(By.xpath("example_logOut_path"));
        logOut.click();
        WebElement authorizeForm = driver.findElement(By.xpath("example_authorizeForm_path"));
        authorizeForm.click();
        String url = driver.getCurrentUrl();
        Assertions.assertEquals("https://user-room/", url);

    }

    @Test
    public void R_14(){

        driver.manage().window().maximize();
        driver.findElement(login).click();
        driver.findElement(login).sendKeys("exampleman");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("123Example");
        driver.findElement(loginBtn).click();
        String url = driver.getCurrentUrl();
        Assertions.assertEquals("https://user-room/", url);

    }

    @Test
    public void R_15(){

        driver.manage().window().maximize();
        driver.findElement(login).click();
        driver.findElement(login).sendKeys("8999009900");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("123Example");
        driver.findElement(loginBtn).click();
        String url = driver.getCurrentUrl();
        Assertions.assertEquals("https://user-room/", url);

    }

    @AfterEach
    public void close(){

        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

        driver.quit();

    }

}
