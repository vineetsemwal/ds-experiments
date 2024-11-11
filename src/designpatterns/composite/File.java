package designpatterns.composite;

/**
 * File objects Represents individual/Leaf Object in Composite Pattern in our File system hierarchy
 */
public class File implements IFile {
    private String name;
    private long size;

    public File(final String name, final long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void display() {
        System.out.println("File name: " + name + ", File size: " + size);
    }
}
