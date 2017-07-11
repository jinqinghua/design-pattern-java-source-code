package chapter12.sample02;

public class Client {

    public static void main(String[] args) {
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");

        // 文件夹中有三个文件
        Folder folder1 = new Folder("folder1");
        folder1.add(file1);
        folder1.add(file2);
        folder1.add(file3);

        // 子文件中也有三个文件
        Folder folder11 = new Folder("subfolder1");
        File file11 = new File("file11");
        File file12 = new File("file12");
        File file13 = new File("file13");
        folder11.add(file11);
        folder11.add(file12);
        folder11.add(file13);

        // 子文件夹放到文件夹中
        folder1.add(folder11);

        // 显示folder1内容
        folder1.display();
    }

}
