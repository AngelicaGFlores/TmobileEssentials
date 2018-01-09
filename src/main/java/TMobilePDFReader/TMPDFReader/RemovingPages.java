package TMobilePDFReader.TMPDFReader;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
public class RemovingPages {
   public static void main(String args[]) throws IOException {
      //Loading an existing document
      File file = new File("C:/CSWorkspace/pdffiles/Sample.pdf");
      PDDocument document = PDDocument.load(file);
       
      //Listing the number of existing pages
      int noOfPages= document.getNumberOfPages();
      System.out.print(noOfPages);
       
      //Removing the pages
      document.removePage(1);
      
      System.out.println("page removed");
      //Saving the document
      document.save("C:/CSWorkspace/pdffiles/Sample.pdf");
      //Closing the document
      document.close();
   }
}