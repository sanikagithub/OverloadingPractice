public class Books {
    private String title;
    private int numberofpages;
    private int publicationyear;

    public Books(String title, int numberofpages, int publicationyear) {
        this.title = title;
        this.numberofpages = numberofpages;
        this.publicationyear = publicationyear;
    }

    public Books(String title, int numberOfPages) {
        this.title = title;
        this.numberofpages = numberOfPages;
    }

    public Books(String title) {
        this.title = title;
    }

    public Books(int publicationYear) {
        this.publicationyear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberofpages() {
        return numberofpages;
    }

    public int getPublicationyear() {
        return publicationyear;
    }

    @Override
    public String toString(){
        return getTitle() + "," + getNumberofpages() + "," + getPublicationyear();

   }
}