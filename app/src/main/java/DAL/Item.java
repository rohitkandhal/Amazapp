package DAL;

/**
 * Created by Rohit on 3/19/14.
 */
public class Item {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String name;
    private String description;

    public Item(){

    }

    public Item(String name, String description){
        this.name = name;
        this.description = description;
    }

}
