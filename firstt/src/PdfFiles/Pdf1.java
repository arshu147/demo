package PdfFiles;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;


import org.apache.pdfbox.text.PDFTextStripper;

public class Pdf1 {
	public static void main(String[] args) throws IOException  {
		File f=new File("F:\\Resume\\resumeTCS.pdf");
		PDDocument doc= PDDocument.load(f);
		PDFTextStripper text =new PDFTextStripper();
		String pdfText=text.getText(doc);
		System.out.println(pdfText);
		
		
	}

}
