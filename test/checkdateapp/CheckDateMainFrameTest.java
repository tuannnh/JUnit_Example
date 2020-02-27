/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkdateapp;

import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author tuannnh
 */
public class CheckDateMainFrameTest {

    private FrameFixture main;

    public CheckDateMainFrameTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        main = new FrameFixture(new CheckDateMainFrame());
    }

    @After
    public void tearDown() {
        main.cleanUp();
    }

    @Test
    public void TestCase2() {
        try {
            main.textBox("day").setText("29");
            Thread.sleep(500);
            main.textBox("month").setText("2");
            Thread.sleep(500);

            main.textBox("year").setText("2020");
            Thread.sleep(500);

            main.button("check").click();

            main.optionPane().requireInformationMessage().requireMessage("29/02/2020 is Not correct date, time");
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        @Test
    public void TestCase3() {
        try {
            main.textBox("day").setText("29");
            Thread.sleep(500);
            main.textBox("month").setText("2");
            Thread.sleep(500);

            main.textBox("year").setText("2020");
            Thread.sleep(500);

            main.button("check").click();

            main.optionPane().requireInformationMessage().requireMessage("29/02/2020 is Not correct date, time");
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        @Test
    public void TestCase1() {
        try {
            main.textBox("day").setText("29");
            Thread.sleep(500);
            main.textBox("month").setText("2");
            Thread.sleep(500);

            main.textBox("year").setText("2020");
            Thread.sleep(500);

            main.button("check").click();

            main.optionPane().requireInformationMessage().requireMessage("29/02/2020 is Not correct date, time");
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
