package com.hillel;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class GradientFileTest
{
    String actual;
    String expected;
    GradientFile gf = new GradientFile();

    @Test
    public void getColumnTest()
    {
        actual = gf.getColumn(128,128,128);
        expected = "    <td width=\"50\" height=\"50\" style='background-color:rgb(128, 128, 128)'></td>"+"\n";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getRowTest(){
        actual = gf.getRow(128);
        expected = "  <tr> \n" +
                   "    <td width=\"50\" height=\"50\" style='background-color:rgb(128, 0, 0)'></td>"+"\n" +
                   "    <td width=\"50\" height=\"50\" style='background-color:rgb(0, 128, 0)'></td>"+"\n" +
                   "    <td width=\"50\" height=\"50\" style='background-color:rgb(0, 0, 128)'></td>"+"\n" +
                   "  </tr> \n";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getTableTest(){
        actual = gf.getTable(10);
        expected = "<table> \n" +
                "  <tr> \n" +
                "    <td width=\"50\" height=\"50\" style='background-color:rgb(10, 0, 0)'></td>"+"\n" +
                "    <td width=\"50\" height=\"50\" style='background-color:rgb(0, 10, 0)'></td>"+"\n" +
                "    <td width=\"50\" height=\"50\" style='background-color:rgb(0, 0, 10)'></td>"+"\n" +
                "  </tr> \n" +
                "  <tr> \n" +
                "    <td width=\"50\" height=\"50\" style='background-color:rgb(0, 0, 0)'></td>"+"\n" +
                "    <td width=\"50\" height=\"50\" style='background-color:rgb(0, 0, 0)'></td>"+"\n" +
                "    <td width=\"50\" height=\"50\" style='background-color:rgb(0, 0, 0)'></td>"+"\n" +
                "  </tr> \n" +
                "</table> \n";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getHeaderTest(){
        actual = gf.getHeader();
        expected =
                "<!DOCTYPE html> \n" +
                        "<html> \n" +
                        "<head></head> \n"+
                        "<body> \n";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getFooterTest(){
        actual = gf.getFooter();
        expected =
                "</body> \n"+
                "</html> \n";
        Assert.assertEquals(expected,actual);
    }

}
