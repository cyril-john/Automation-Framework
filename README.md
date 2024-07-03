# Automation Framework with Java-Selenium-TestNG-Cucumber approach

## Setup

### Prerequisites

- Java Development Kit (JDK)
- Apache Maven
- Google Chrome
- ChromeDriver

### Installing Dependencies

1. **Clone the repository**

    ```sh
    git clone https://github.com/cyril-john/Automation-Framework.git
    cd your-repo-name
    ```

2. **Set up ChromeDriver**

    - Download ChromeDriver from [here](https://sites.google.com/chromium.org/driver/downloads).
    - Place the `chromedriver.exe` file in the `utilities` directory inside your user directory.

3. **Update WebDriver path in your test class**

   Make sure your test class `YourTestClass.java` has the following setup:

    ```java
    import org.junit.Before;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class YourTestClass {
        private WebDriver driver;

        @Before
        public void setup() {
            // Set the path to the ChromeDriver executable in the user's directory
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.home") + "/utilities/chromedriver.exe");
            
            driver = new ChromeDriver();
        }
        
        // Your test methods will go here
    }
    ```

### Build and Run Tests

1. **Install the dependencies and build the project**

    ```sh
    mvn install
    ```

2. **Run the tests**

    ```sh
    mvn test
    ```

## Additional Information

- Make sure that Google Chrome is installed and up to date on your system.
- Ensure that the version of ChromeDriver matches the version of Google Chrome installed on your system.
- For more detailed information about using Selenium with Maven, visit the [Selenium documentation](https://www.selenium.dev/documentation/).

