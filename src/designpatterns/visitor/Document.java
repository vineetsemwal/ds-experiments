package designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * document/Data Structure created, All opreations are done on this data structure
 * but All operation as part of different requirements need not be part of this class
 * This class is only responsible for adding elements and visiting them
 * Different operations are done by different IVisitor implementations foreg: ExportToFileVisitor
 *
 */
public class Document {

    private List<DocumentElement>elements=new ArrayList<>();

    public void add(final DocumentElement element){
        elements.add(element);
    }

    public void visit(final IVisitor visitor) throws VisitException{
        for (DocumentElement element:elements){
            if (element instanceof ParagraphElement){
                visitor.visit((ParagraphElement)element);
            }else if (element instanceof ImageElement){
                visitor.visit((ImageElement)element);
            }
        }
    }



    static interface IVisitor{
        void visit(ParagraphElement paragraph) throws VisitException;
        void visit(ImageElement image) throws VisitException;
    }

    static class VisitException extends Exception{
        public VisitException(final String message) {
            super(message);
        }
        public VisitException(final String message, final Throwable cause) {
            super(message, cause);
        }

    }

    static class ParagraphElement implements DocumentElement{
        private String text;
        public ParagraphElement(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    static class ImageElement implements DocumentElement{
        private String url;
        private String caption;
        public ImageElement(String url, String caption) {
            this.url = url;
            this.caption = caption;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }
    }

    static interface DocumentElement{

    }
}
