package Assignment;

import java.io.File;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadPdf {
	public static void main(String[] args) throws Exception {
		File f = new File("F:\\RANJU\\RedMi Y2\\Documents\\Story of Her.pdf");
		PDDocument doc = PDDocument.load(f);
		PDFTextStripper txt = new PDFTextStripper();
		String read = txt.getText(doc);
		System.out.println(read);
		doc.close();
	}
}
