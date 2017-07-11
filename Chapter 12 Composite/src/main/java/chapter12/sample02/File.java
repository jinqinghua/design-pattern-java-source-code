package chapter12.sample02;


// Leaf
public class File extends AbstractFile {

    public File(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println(this.name);

    }
}
