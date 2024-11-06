package designpatterns.visitor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DocumentUsage {
    public static void main(String[] args) throws Exception {
        Document document = new Document();
        document.add(new Document.ImageElement("http://example.com/image1.jpg", "Image 1"));
        document.add(new Document.ParagraphElement("This is a paragraph"));
        document.add(new Document.ImageElement("http://example.com/image2.jpg", "Image 2"));
        document.add(new Document.ParagraphElement("This is another paragraph"));
        ExportToFileVisitor visitorImplFileWrite = new ExportToFileVisitor(new File("exported_document.txt"));
        document.visit(visitorImplFileWrite);
        visitorImplFileWrite.close();
        System.out.println("Document exported to file exported_document.txt");
    }


    /**
     * IVisitor implementation that exports document elements to a file
     */
    static class ExportToFileVisitor implements Document.IVisitor {
        private File file;
        private BufferedWriter writer;

        public ExportToFileVisitor(File file) throws IOException {
            this.file = file;
            writer = new BufferedWriter(new FileWriter(file));
        }

        @Override
        public void visit(final Document.ParagraphElement paragraph) throws Document.VisitException {
            try {
                writer.write(paragraph.getText());
                writer.newLine();
            } catch (IOException e) {
                throw new Document.VisitException("Error writing to file", e);
            }
        }

        @Override
        public void visit(final Document.ImageElement image) throws Document.VisitException {
            try {
                writer.write(image.getUrl() + "-" + image.getCaption());
                writer.newLine();
            } catch (IOException e) {
                throw new Document.VisitException("Error writing to file", e);
            }
        }

        public void close() throws IOException {
            writer.flush();
            writer.close();
        }
    }


    /*
    IVisitor implementation that writes document elements to console
     */
    static class VisitorImplConsoleWrite implements Document.IVisitor {

        @Override
        public void visit(final Document.ParagraphElement paragraph) throws Document.VisitException {
            System.out.println("Visiting paragraph: " + paragraph.getText());
        }

        @Override
        public void visit(final Document.ImageElement image) throws Document.VisitException {
            System.out.println("Visiting image: " + image.getUrl() + "-" + image.getCaption());
        }

    }
}
