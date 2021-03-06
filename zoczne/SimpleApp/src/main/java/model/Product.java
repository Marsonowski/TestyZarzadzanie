package model;

import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private String imgFile;
    private double price;

    public Product(){}

    public Product(int id, String name, String imgFile, double price) {
        this.id = id;
        this.name = name;
        this.imgFile = imgFile;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgFile() {
        return imgFile;
    }

    public void setImgFile(String imgFile) {
        this.imgFile = imgFile;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Double.compare(product.price, price) == 0 &&
                name.equals(product.name) &&
                imgFile.equals(product.imgFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, imgFile, price);
    }
}
