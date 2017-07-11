package chapter12.sample02;

// Component
public abstract class AbstractFile {

    protected String name;

    public abstract void display();

    public AbstractFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
