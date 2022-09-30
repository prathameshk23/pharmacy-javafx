package Models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Drug {

    private  SimpleIntegerProperty price_1 ;
    private SimpleIntegerProperty idDrug;
    private  SimpleStringProperty name_1;

    public int getPrice_1() {
        return price_1.get();
    }

    public SimpleIntegerProperty price_1Property() {
        return price_1;
    }

    public void setPrice_1(int price_1) {
        this.price_1.set(price_1);
    }

    public int getIdDrug() {
        return idDrug.get();
    }

    public SimpleIntegerProperty idDrugProperty() {
        return idDrug;
    }

    public void setIdDrug(int idDrug) {
        this.idDrug.set(idDrug);
    }

    public String getName_1() {
        return name_1.get();
    }

    public SimpleStringProperty name_1Property() {
        return name_1;
    }

    public void setName_1(String name_1) {
        this.name_1.set(name_1);
    }

    public int getExpiry_Date() {
        return expiry_Date.get();
    }

    public SimpleIntegerProperty expiry_DateProperty() {
        return expiry_Date;
    }

    public void setExpiry_Date(int expiry_Date) {
        this.expiry_Date.set(expiry_Date);
    }

    public int getSize_1() {
        return size_1.get();
    }

    public SimpleIntegerProperty size_1Property() {
        return size_1;
    }

    public void setSize_1(int size_1) {
        this.size_1.set(size_1);
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    private SimpleIntegerProperty expiry_Date;
    private SimpleIntegerProperty size_1;
    private String name;
    private  Integer expiryDate;
    private Integer size;
    private String description;
    private Integer price;

    public void setName(String name){ this.name = name;}
    public void setExpiryDate(Integer date){this.expiryDate = date;}
    public void setDescription(String description){this.description = description;}
    public void setSize(Integer size){this.size = size;}
    public Integer getPrice(){return price;}
    public String getName(){return name;}
    public  Integer getExpiryDate(){return expiryDate;}
    public Integer getSize(){return size;}






    public Drug(String name, int expiryDate, int size){

        this.name = name;
        this.expiryDate = expiryDate;
        this.size = size;

    }

    public Drug(String name, int expiryDate, int size, String description){
        this(name,expiryDate,size);
        this.description = description;
    }

    public Drug(String name, int expiryDate, int size, String description, int price){
        this(name,expiryDate,size,description);
        this.price = price;
    }
    public Drug(Integer idDrug, String name_1,Integer expiry_Date,Integer size_1,Integer price_1){
        this.idDrug = new SimpleIntegerProperty(idDrug);
        this.name_1 = new SimpleStringProperty(name_1);
        this.expiry_Date = new SimpleIntegerProperty(expiry_Date);
        this.size_1 = new SimpleIntegerProperty(size_1);
        this.price_1 = new SimpleIntegerProperty(price_1);

    }



    public void increaseDrugSize(int number){

        size = size + number;
    }

    public void sellDrug(int number){

        size = size - number;
    }

    @Override

    public String toString(){

        return "Drug Name :  " + name + "\n" + "Drug Size :  " + size +  "\n" + "Drug Description :  " + description + "\n" + "Price :  $" + price;

    }


}
