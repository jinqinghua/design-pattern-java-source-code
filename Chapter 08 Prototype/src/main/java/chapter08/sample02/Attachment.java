package chapter08.sample02;

import java.io.Serializable;

public class Attachment implements Serializable {
    public void download() {
        System.out.println("下载附件");
    }
}
