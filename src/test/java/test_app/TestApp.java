package test_app;

import app.pom.homepage.Homepage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;

public class TestApp extends BasePage {


    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

    public class UserRegistrationTest {
        private WebDriver driver;

        @BeforeMethod
        public void setUp() {
            // Set up the WebDriver instance (e.g., ChromeDriver)
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @AfterMethod
        public void tearDown() {
            // Quit the WebDriver instance
            driver.quit();
        }

        @Test
        public void userRegistrationTest() {
            // Test Steps
            driver.get("https://magento.softwaretestingboard.com/");
            driver.findElement(By.linkText("Sign In")).click();
            driver.findElement(By.linkText("Create an Account")).click();
            driver.findElement(By.id("firstname")).sendKeys("younes");
            driver.findElement(By.id("lastname")).sendKeys("kaci");
            driver.findElement(By.id("email_address")).sendKeys("roni_cost@example.com");
            driver.findElement(By.id("password")).sendKeys("roni_cost3@exemple.com");
            driver.findElement(By.id("confirmation")).sendKeys("roni_cost3@exemple.com");
            driver.findElement(By.cssSelector("button[title='Register']")).click();

            // Expected Results
            WebElement dashboardHeading = driver.findElement(By.cssSelector("h1.dashboard"));
            Assert.assertTrue(dashboardHeading.isDisplayed());
            Assert.assertEquals(dashboardHeading.getText(), "My Dashboard");
            WebElement welcomeMessage = driver.findElement(By.cssSelector("p.hello"));
            Assert.assertTrue(welcomeMessage.isDisplayed());
            Assert.assertEquals(welcomeMessage.getText(), "Hello, younes kaci!");
        }
    }
    public class UserRegistrationTest {
        private WebDriver driver;

        @BeforeMethod
        public void setUp() {
            // Set up the WebDriver instance (e.g., ChromeDriver)
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }

        @Test
        public void userRegistrationTest() {
            // Test Steps
            driver.get("https://magento.softwaretestingboard.com/");
            driver.findElement(By.linkText("Sign In")).click();
            driver.findElement(By.linkText("Create an Account")).click();
            driver.findElement(By.id("firstname")).sendKeys("younes");
            driver.findElement(By.id("lastname")).sendKeys("kaci");
            driver.findElement(By.id("email_address")).sendKeys("roni_cost@example.com");
            driver.findElement(By.id("password")).sendKeys("roni_cost3@example.com");
            driver.findElement(By.id("confirmation")).sendKeys("roni_cost3@example.com");
            driver.findElement(By.cssSelector("button[title='Register']")).click();

            // Expected Results
            WebElement dashboardHeading = driver.findElement(By.cssSelector("h1.dashboard"));
            Assert.assertTrue(dashboardHeading.isDisplayed());
            Assert.assertEquals(dashboardHeading.getText(), "My Dashboard");
            WebElement welcomeMessage = driver.findElement(By.cssSelector("p.hello"));
            Assert.assertTrue(welcomeMessage.isDisplayed());
            Assert.assertEquals(welcomeMessage.getText(), "Hello, younes kaci");




            public class ItemSearchTest {
                private WebDriver driver;

                @BeforeMethod
                public void setUp() {
                    // Set up the WebDriver instance (e.g., ChromeDriver)
                    System.setProperty("webdriver.chrome.driver", "path/input_id_search");
                    driver = new ChromeDriver();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                }

                @AfterMethod
                public void tearDown() {
                    // Quit the WebDriver instance
                    driver.quit();
                }

                @Test
                public void itemSearchTest() {
                    // Test Steps
                    driver.get("https://magento.softwaretestingboard.com/");
                    driver.findElement(By.id("search")).sendKeys("phone");
                    driver.findElement(By.cssSelector("button[title='Search']")).click();

                    // Expected Results
                    List<WebElement> searchResults = driver.findElements(By.cssSelector("li.product-item"));
                    Assert.assertTrue(searchResults.size() > 0, "Search results are displayed for the keyword 'phone'.");
                }
            }

