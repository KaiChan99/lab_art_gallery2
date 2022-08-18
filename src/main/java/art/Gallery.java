package art;


import java.util.ArrayList;

//Pseudocode
// Gallery has 3 attributes
// name, till, artStorage
public class Gallery {

    private String name;

    private double till;

    private ArrayList<Artwork> artStorage;

    public Gallery(String name) {
        this.name = name;
        this.artStorage = new ArrayList<>();
        this.till = 0;
    }

    
}
