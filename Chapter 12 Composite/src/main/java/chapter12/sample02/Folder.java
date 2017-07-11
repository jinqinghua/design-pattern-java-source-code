package chapter12.sample02;

import java.util.ArrayList;
import java.util.List;

// Compsite
public class Folder extends AbstractFile {
    private List<AbstractFile> files = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void add(AbstractFile file) {
        files.add(file);
    }

    public void remove(AbstractFile file) {
        files.remove(file);

    }

    public AbstractFile getChild(int i) {
        return files.get(i);
    }

    @Override
    public void display() {
        System.out.println("Folder:=" + this.name);
        for (AbstractFile file : files) {
            file.display();
        }

    }

}
