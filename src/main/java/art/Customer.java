package art;


import java.util.ArrayList;

//Pseudocode
// Customer has 3 attributes
// name, wallet and nftCollection
public class Customer {

    private String name;

    private double wallet;

    private ArrayList<Artwork> nftCollection;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.nftCollection = new ArrayList<>();
    }

    public boolean canBuy(Artwork artwork){
        if(artwork.getPrice() <= this.wallet){
            return true;
        }
        return false;
    }

}
