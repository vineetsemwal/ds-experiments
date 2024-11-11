package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Directory objects represents in our composite demo as Composite Objects
 */
public class Directory implements IFile {
    private String name;
    private List<IFile> children=new ArrayList<>();

    public Directory(final String name) {
        this.name = name;
    }

    public void addFile(final IFile file) {
        this.children.add(file);
    }

    public void removeFile(final IFile file) {
        this.children.remove(file);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public long getSize() {
        long size = 0;
        for (IFile file : this.children) {
            size += file.getSize();
        }
        return size;
    }

    @Override
    public void display() {
        System.out.println("Directory name: " + name);
        for (IFile file : this.children) {
            file.display();
        }
    }
}
