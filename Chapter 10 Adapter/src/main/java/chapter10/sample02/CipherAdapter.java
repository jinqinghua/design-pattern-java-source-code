package chapter10.sample02;

// Object Adapter
public class CipherAdapter extends DataOperation {
    private Caesar cipher;

    public CipherAdapter() {
        cipher = new Caesar();
    }

    @Override
    public String doEncrypt(int key, String ps) {
        return cipher.doEncrypt(key, ps);
    }
}
