/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.verma.Calculator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author verma
 */
public class CalculatorTest {

    Calculator cal;                                             // 1st declare your class
    private static WebDriver driver;
    private String baseUrl;

    public CalculatorTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        cal = new Calculator();
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testAdd() {
        assertEquals(cal.add(2, 2), 4);
    }

    @Test
    public void testMul() {
        assertEquals(cal.mul(8, 2), 16);
    }

    @Test
    public void testIndeed() throws Exception {
        driver.get("http://indeed.com");
        Thread.sleep(1000);
        driver.close();
    }
}
