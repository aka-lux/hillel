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
    public static void main( String[] args )
    {
       new GradientFile().createGradientFile();

    }

    public void createGradientFile()
    {
        String outputFileName = "gradient.html";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName))) {
            writeHeader(bw);
            writeTable(bw);
            writeFooter(bw);

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeHeader(BufferedWriter bw) throws IOException
    {
        bw.write("<!DOCTYPE html>" + "\n");
        bw.write("<html>" + "\n");
        bw.write("<head></head>" + "\n");
        bw.write("<body>" + "\n");
    }

    public void writeFooter(BufferedWriter bw) throws IOException
    {
        bw.write("</body>" + "\n");
        bw.write("</html>" + "\n");
    }

    public void writeTable(BufferedWriter bw) throws IOException
    {
        bw.write("<table>" + "\n");
        for (int i = 255; i >= 0; i-=10) {
            writeRow(bw,i);
        }
        bw.write("</table>" + "\n");
    }

    public void writeRow(BufferedWriter bw, int i) throws IOException
    {
        bw.write("  <tr>" + "\n");
        writeColumn(bw, i,0,0);
        writeColumn(bw,0,i,0);
        writeColumn(bw,0,0,i);
        bw.write("  </tr>" + "\n");
    }

    public void writeColumn(BufferedWriter bw, int r, int g, int b) throws IOException
    {
        bw.write("    <td width=\"50\" height=\"50\" style='background-color:rgb("+ r +", "+ g +", "+ b +")'></td>" + "\n");
    }

}