package chapter20.SimpleIterator;


public interface MyIterator {
    void first();

    void next();

    boolean isLast();

    Object currentItem();
}


interface MyCollection {
    MyIterator createIterator();
}


class NewCollection implements MyCollection {
    private Object[] obj = {"dog", "pig", "cat", "monkey", "pig"};

    @Override
    public MyIterator createIterator() {
        return new MyIterator() {
            private int currentIndex = 0;

            @Override
            public void first() {
                currentIndex = 0;
            }

            @Override
            public void next() {
                if (currentIndex < obj.length) {
                    currentIndex++;
                }
            }

            public void previous() {
                if (currentIndex > 0) {
                    currentIndex--;
                }
            }

            @Override
            public boolean isLast() {
                return currentIndex == obj.length;
            }

            public boolean isFirst() {
                return currentIndex == 0;
            }

            @Override
            public Object currentItem() {
                return obj[currentIndex];
            }
        };

    }

}


class Client {
    public static void process(MyCollection collection) {
        MyIterator i = collection.createIterator();

        while (!i.isLast()) {
            System.out.println(i.currentItem().toString());
            i.next();
        }
    }

    public static void main(String a[]) {
        MyCollection collection = new NewCollection();
        process(collection);
    }
}
