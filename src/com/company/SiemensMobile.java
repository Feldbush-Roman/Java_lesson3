package com.company;

public abstract class SiemensMobile implements Mobile {
    private Integer price;
    private Integer model;
    private Integer hd;
    private Integer screen;
    private Integer ram;

    public SiemensMobile(Integer price, Integer model, Integer hd, Integer screen, Integer ram) {
        this.price = price;
        this.model = model;
        this.hd = hd;
        this.screen = screen;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "SiemensMobile{" +
                "price=" + price +
                ", model=" + model +
                ", hd=" + hd +
                ", screen=" + screen +
                ", ram=" + ram +
                '}';
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getModel() {
        return model;
    }

    public Integer getHd() {
        return hd;
    }

    public Integer getScreen() {
        return screen;
    }

    public Integer getRam() {
        return ram;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public void setHd(Integer hd) {
        this.hd = hd;
    }

    public void setScreen(Integer screen) {
        this.screen = screen;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }
}
