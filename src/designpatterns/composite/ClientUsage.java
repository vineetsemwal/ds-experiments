package designpatterns.composite;

public class ClientUsage {
    public static void main(String[] args) {
        IFile file1 = new File("file1", 100);
        IFile file2 = new File("file2", 200);
        Directory root=new Directory("root");
        root.addFile(file1);
        root.addFile(file2);

        Directory media=new Directory("media");
        IFile file3 = new File("video1.mp4", 30000);
        IFile file4 = new File("video2.mp4", 30000);
        media.addFile(file3);
        media.addFile(file4);
        root.addFile(media);

        root.display();

    }
}
