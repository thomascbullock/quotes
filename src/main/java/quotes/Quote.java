package quotes;

import java.util.Arrays;

public class Quote {

    private final String[] tags;
    private final String author;
    private final String likes;
    private final String text;


    public Quote (String[] tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public String quoteAndAuthorString() {
        return text + "\n" + " - " + author;
    }


    @Override
    public String toString() {
        return "Quote{" +
                "tags=" + Arrays.toString(tags) +
                ", author='" + author + '\'' +
                ", likes='" + likes + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
