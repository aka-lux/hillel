package com.hillel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class GradientFile
{
   void createGradientFile()
    {
        String outputFileName = "gradient.html";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName))) {
            bw.write(getHeader());
            bw.write(getTable(255));
            bw.write(getFooter());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

     String  getHeader()
    {
        String str =
        "<!DOCTYPE html> \n" +
        "<html> \n" +
        "<head></head> \n"+
        "<body> \n";

        return str;
    }

     String getFooter()
    {
        String str =
        "</body> \n"+
        "</html> \n";
        return str;
    }

     String  getTable(int k)
    {
        StringBuffer strBuf = new StringBuffer();
        strBuf.append("<table> \n");
        for (int i = k; i >= 0; i-=10) {
            strBuf.append(getRow(i));
        }
        strBuf.append("</table> \n");

        return strBuf.toString();

    }

     String  getRow( int i)
    {
        StringBuffer strBuf = new StringBuffer();
        strBuf.append("  <tr> \n");
        strBuf.append(getColumn( i,0,0));
        strBuf.append(getColumn(0,i,0));
        strBuf.append(getColumn(0,0,i));
        strBuf.append("  </tr> \n");

        return strBuf.toString();
    }

     String getColumn(int r, int g, int b)
    {
        String str = "    <td width=\"50\" height=\"50\" style='background-color:rgb("+ r +", "+ g +", "+ b +")'></td>" + "\n";
        return str;
    }

}