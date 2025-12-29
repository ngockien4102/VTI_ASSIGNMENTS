package ex1_Abstraction.Q1;

public class News implements INews{
    private int ID;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    private float[] rates;

    public News() {
    }

    public News(int ID, String title, String publishDate, String author, String content, float[] rates) {
        this.ID = ID;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
        this.rates = rates;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }


    @Override
    public void display() {
        System.out.println("title: " + title  + " publishDate: " + publishDate + " author: " + author + " content: " + content + " averageRate: " + calculate());
    }

    @Override
    public float calculate() {
        return (rates[0] + rates[1] + rates[2])/3;
    }
}
