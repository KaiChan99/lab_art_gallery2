package art;




//Pseudocode
//  Artwork has 4 attributes
// title, artist, price, nft

public class Artwork {

    private String title;
    private Artist artist;
    private double price;
    private int nft;



    public Artwork(String title, Artist artist, double price, int nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
    }

    //    GETTERS & SETTERS
    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }

    public int getNft() {
        return nft;
    }

}