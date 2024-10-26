package TruuTuong;

public class Media {
    public static void main(String[] args) {
        Item mp3 = new MP3("Em cua ngay hom qua", "Son Tung", "1123", 200000, 4);
        Item book = new Book("Thep Moi", "Chien Tranh", "123", 200000, "Hoang", 200, "Tieu thuyet");

        mp3.showInfo();
        book.showInfo();

    }
}
abstract class Item{
    public String name;
    private String description;
    protected String ID;
    int price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    abstract void showInfo();

    public Item(String name, String description, String ID, int price) {
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.price = price;
    }
}

class MP3 extends Item{
    int duration;

    public MP3(String name, String description, String ID, int price, int duration) {
        super(name, description, ID, price);
        this.duration = duration;
    }

    @Override
    void showInfo() {
        System.out.println("MP3");
        System.out.println(name);
        System.out.println(getDescription());
        System.out.println(ID);
        System.out.println(price);
        System.out.println(duration);

    }
}

class Book extends Item {
    String author;
    int numberOfPages;
    String genre;

    public Book(String name, String description, String ID, int price, String author, int numberOfPages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    @Override
    void showInfo() {
        System.out.println("Book:");
        System.out.println(name);
        System.out.println(getDescription());
        System.out.println(ID);
        System.out.println(price);
        System.out.println(author);
        System.out.println(numberOfPages);
        System.out.println(genre);
    }
}

