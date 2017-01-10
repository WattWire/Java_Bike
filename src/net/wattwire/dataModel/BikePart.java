package net.wattwire.dataModel;

/**
 * Created by dave on 1/8/17.
 */
public class BikePart {

    private int partNumber;
    private String description;
    private float price;

    public BikePart(int partNumber, String description, float price) {

        this.partNumber = partNumber;
        this.description = description;
        this.price = price;
    }
//----------------------------------------------------------------------

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


}
