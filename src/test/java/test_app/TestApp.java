package test_app;

import app.pom.homepage.Homepage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;

pbpublic class TestApp extends BasePage {

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


            public class AddItemToCartTest {
                private WebDriver driver;

                @BeforeMethod
                public void setUp() {
                    // Set up the WebDriver instance (e.g., ChromeDriver)
                    System.setProperty("webdriver.chrome.driver", "<button type=\"submit\" title=\"Add to Cart\");
                    driver = new ChromeDriver();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                }

                @AfterMethod
                public void tearDown() {
                    // Quit the WebDriver instance
                    driver.quit();
                }

                @Test
                public void addItemToCartTest() {
                    // Test Steps
                    driver.get("https://magento.softwaretestingboard.com/");
                    driver.findElement(By.id("search")).sendKeys("phone");
                    driver.findElement(By.cssSelector("button[title='Search']")).click();
                    WebElement itemLink = driver.findElement(By.cssSelector("a.product-item-link"));
                    String itemName = itemLink.getText();
                    itemLink.click();
                    driver.findElement(By.cssSelector("button.tocart")).click();

                    // Expected Results
                    WebElement cartIcon = driver.findElement(By.cssSelector("span.counter-number"));
                    Assert.assertTrue(cartIcon.isDisplayed(), "Cart icon is displayed");
                    String cartItemCount = cartIcon.getText();
                    Assert.assertEquals(cartItemCount, "1", "Cart item count is updated");


                    public class ModifyCartItemQuantityTest {
                        private WebDriver driver;

                        @BeforeMethod
                        public void setUp() {
                            // Set up the WebDriver instance (e.g., ChromeDriver)
                            System.setProperty("webdriver.chrome.driver", <span class="counter-number">);
                            driver = new ChromeDriver();
                            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        }

                        @AfterMethod
                        public void tearDown() {
                            // Quit the WebDriver instance
                            driver.quit();
                        }

                        @Test
                        public void modifyCartItemQuantityTest() {
                            // Test Steps
                            driver.get("https://magento.softwaretestingboard.com/");
                            addItemsToCart();
                            driver.findElement(By.cssSelector("a.action.showcart")).click();
                            WebElement quantityField = driver.findElement(By.cssSelector("input.cart-item-qty"));
                            quantityField.clear();
                            quantityField.sendKeys("3");
                            driver.findElement(By.cssSelector("button.update-cart-item")).click();

                            // Expected Results
                            String updatedQuantity = quantityField.getAttribute("value");
                            Assert.assertEquals(updatedQuantity, "3", "The quantity of the selected item in the cart is updated to 3");
                        }


                    }

                }
            }


            public class RemoveItemFromCartTest {
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
                public void removeItemFromCartTest() {
                    // Test Steps
                    driver.get("https://magento.softwaretestingboard.com/");
                    addItemToCart();
                    driver.findElement(By.cssSelector("a.action.showcart")).click();
                    WebElement removeButton = driver.findElement(By.cssSelector("a.action.delete"));
                    removeButton.click();

                    // Expected Results
                    WebElement emptyCartMessage = driver.findElement(By.cssSelector("div.message.empty-cart"));
                    Assert.assertTrue(emptyCartMessage.isDisplayed(), "The selected item is successfully removed from the cart");
                }


            }





            public class ProceedToCheckoutTest {
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
                    /
                    driver.quit();
                }

                @Test
                public void proceedToCheckoutTest() {
                    // Test Steps
                    driver.get("https://magento.softwaretestingboard.com/");
                    addItemToCart();
                    driver.findElement(By.cssSelector("a.action.showcart")).click();
                    driver.findElement(By.cssSelector("button.action.primary.checkout")).click();

                    // Expected Results
                    WebElement checkoutPageTitle = driver.findElement(xpath /*[@id="top-cart-btn-checkout"]"));
                    Assert.assertEquals(checkoutPageTitle.getText(), "Checkout", "The user is directed to the checkout process");
                }


            }



public class CheckoutAsGuestTest {
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
    public void checkoutAsGuestTest() {
        // Test Steps
        driver.get("https://magento.softwaretestingboard.com/");
        addItemToCart();
        driver.findElement(By.cssSelector("a.action.showcart")).click();
        driver.findElement(By.cssSelector("button.action.primary.checkout")).click();

        // Fill in guest checkout details
        fillGuestCheckoutDetails();

        // Click on the "Continue" button
        driver.findElement(By.cssSelector("button#guest-next-step")).click();

        // Expected Results
        WebElement orderSummaryPageTitle = driver.findElement(By.cssSelector("h1.page-title"));
        Assert.assertEquals(orderSummaryPageTitle.getText(), "Order Summary", "The guest checkout process is successful");
    }


    }

    private void fillGuestCheckoutDetails() {
        // Fill in the guest checkout details
        driver.findElement(By.id("customer-email")).sendKeys("roni_cost@example.com");
        driver.findElement(By.id("customer-firstname")).sendKeys("younes");
        driver.findElement(By.id("customer-lastname")).sendKeys("kaci");
        driver.findElement(By.id("customer-street")).sendKeys("8525 main street");
        driver.findElement(By.id("customer-city")).sendKeys("denver");
        driver.findElement(By.id("customer-country")).sendKeys("United States");
        driver.findElement(By.id("customer-region_id")).sendKeys("colorado");
        driver.findElement(By.id("customer-postcode")).sendKeys("80205");
        driver.findElement(By.id("customer-telephone")).sendKeys("3031234565");
    }
}


public class OrderConfirmationTest {
    // Test data
    private String email = "roni_cost@example.com";
    private String password = "roni_cost3@example.com";

    // Set up before the test class
    @BeforeClass
    public void setUp() {
        // Navigate to the Magento website
        // Perform necessary setup steps (e.g., launch browser, open URL)
    }

    // Tear down after the test class
    @AfterClass
    public void tearDown() {
        // Perform necessary cleanup steps (e.g., close browser)
    }

    // Test case to verify order confirmation message
    @Test
    public void verifyOrderConfirmationMessage() {
        // Sign in with valid user credentials
        signIn(email, password);

        // Add an item to the cart
        addItemToCart();

        // Go through the checkout process
        checkoutProcess();

        // Complete the payment process
        completePayment();

        // Verify the order confirmation message is displayed
        Assert.assertTrue(isOrderConfirmationMessageDisplayed(), "Order confirmation message is not displayed");

        // Verify the user received an order confirmation email
        Assert.assertTrue(isOrderConfirmationEmailReceived(email), "Order confirmation email is not received");
    }

    // Helper methods (implement as per your application's functionality)

    private void signIn(String email, String password) {
        // Implement sign-in functionality using the provided credentials
    }

    private void addItemToCart() {
        // Implement adding an item to the cart
    }

    private void checkoutProcess() {
        // Implement the steps required for the checkout process
    }

    private void completePayment() {
        // Implement the payment process (e.g., enter payment details, complete transaction)
    }

    private boolean isOrderConfirmationMessageDisplayed() {
        // Implement logic to check if the order confirmation message is displayed on the page
        return false;
    }

    private boolean isOrderConfirmationEmailReceived(String email) {
        // Implement logic to check if the user received an order confirmation email
        return false;
    }
}

