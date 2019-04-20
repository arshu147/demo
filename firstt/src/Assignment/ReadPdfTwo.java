package Assignment;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadPdfTwo {
	public static void main(String[] args) throws Exception {
		File file = new File("F:\\RANJU\\RedMi Y2\\Documents\\The Fault In Our Stars.pdf");
		PDDocument doc = PDDocument.load(file);
		PDFTextStripper stripper = new PDFTextStripper();
		String text = stripper.getText(doc);
		System.out.println(text);
		doc.close();
	}
}
