public class TVShow {
    private String name;
    private int episodes;
    private String genre;

    public TVShow(String episodeName, int numberOfepisodes, String genre) {
        this.name = episodeName;
        this.episodes = numberOfepisodes;
        this.genre = genre;
    }

    public TVShow(String episodeName, int numberOfepisodes) {
        this.name = episodeName;
        this.episodes = numberOfepisodes;
    }

    public TVShow(String episodeName, String genre) {
        this.name = episodeName;
        this.genre = genre;
    }

    public TVShow(int numberOfepisodes, String genre) {
        this.episodes = numberOfepisodes;
        this.genre = genre;
    }

    public TVShow(String episodeName) {
        this.name = episodeName;
    }

    public String getEpisodeName() {
        return name;
    }
    public void setShowName(String EpisodeName) { 
        this.name = EpisodeName; }

    public int getNumberOfepisodes() {
        return episodes;
    }
    public void setNumberOfepisode(int NumberOfepisode) { 
        this.episodes = NumberOfepisode; }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre; }

        @Override
    public String toString(){
        return "The name of the show is " + getEpisodeName() + " with " + getNumberOfepisodes() + " number of episodes. The genre is " + getGenre();

   }
}