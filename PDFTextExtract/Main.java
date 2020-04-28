package Udemy_Course;

/*
Version: 1.0
Program to read a pdf and extract text with regular expression as a csv file.
pdfbox-app-2.0.19.jar   https://pdfbox.apache.org/download.cgi#20x

 */

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) throws IOException {

        PDDocument pdDoc = null;
        PDFTextStripper pdfStripper;
        String parsedText;

        String folderName = "/Users/anku/Documents/PDFFiles/";                              // PDF files source directory
        File outFile = new File("/Users/anku/Documents/PDFFiles/report.csv");     // Report file
        BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
        writer.write("File-Name,Page-No,Found-String\n");                               // Report file column set

        File folder = new File(folderName);
        File[] listOfFiles = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".pdf"));

        for (File listOfFile : listOfFiles) {
            String fileName = listOfFile.getName();
            String fullFilePath = listOfFile.getAbsolutePath();

            pdDoc = PDDocument.load(new File(fullFilePath));
            int totalPages = pdDoc.getNumberOfPages();

            for (int a = 1; a <= totalPages; a++) {
                System.out.println("== File: " + fileName + " Page No: " + a + " ==");

                pdfStripper = new PDFTextStripper();
                pdfStripper.setStartPage(a);
                pdfStripper.setEndPage(a);
                parsedText = pdfStripper.getText(pdDoc);
                Matcher m = Pattern.compile("\\((.*?)\\)").matcher(parsedText);

                while (m.find()) {
                    System.out.println(fileName + "," + a + "," + m.group(1));
                    writer.write(fileName + "," + a + "," + m.group(1) + "\n");
                }
            }
        }
        pdDoc.close();
        writer.close();
    }
}
