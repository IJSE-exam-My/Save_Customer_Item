package model;
/**
 * @author Sanduni Wijesinghe <nipunisandunikaw@gmail.com>
 * @since 10/9/2021
 * /


/*
 * ----------------------------------------------------------------------
 *  Copyright(c) GDSE-Gangsterss.All Right Reserved.
 *  Licenced under the Sri Lankan Information Licence.
 * -----------------------------------------------------------------------
 */
public class Item {
    private String itemID;
    private String itenDescription;
    private String packSize;
    private double unitPrice;
    private int qtyOnHand;

    public Item() {
    }

    public Item(String itemID, String itenDescription, String packSize, double unitPrice, int qtyOnHand) {
        this.itemID = itemID;
        this.itenDescription = itenDescription;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemID='" + itemID + '\'' +
                ", itenDescription='" + itenDescription + '\'' +
                ", packSize='" + packSize + '\'' +
                ", unitPrice=" + unitPrice +
                ", qtyOnHand=" + qtyOnHand +
                '}';
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItenDescription() {
        return itenDescription;
    }

    public void setItenDescription(String itenDescription) {
        this.itenDescription = itenDescription;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }
}
