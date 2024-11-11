package designpatterns.composite;

/**
 * Component Contract in Our Composite demo
 */
public interface IFile {
    String getName();
    long getSize();
    void display();
}
