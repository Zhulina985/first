package uplevel;
public class method {
    String book;
    String label;
    String type;

    public method() {
    }
    public method(String book, String label, String type) {
        this.book = book;
        this.label = label;
        this.type = type;
    }
    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}