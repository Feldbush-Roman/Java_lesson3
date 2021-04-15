package com.company;

public class Model extends SiemensMobile{
    public Model(Integer price, Integer model, Integer hd, Integer screen, Integer ram) {
        super(price, model, hd, screen, ram);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void call() {

    }

    @Override
    public Integer getPrice() {
        return super.getPrice();
    }

    @Override
    public Integer getModel() {
        return super.getModel();
    }

    @Override
    public Integer getHd() {
        return super.getHd();
    }

    @Override
    public Integer getScreen() {
        return super.getScreen();
    }

    @Override
    public Integer getRam() {
        return super.getRam();
    }

    @Override
    public void setPrice(Integer price) {
        super.setPrice(price);
    }

    @Override
    public void setModel(Integer model) {
        super.setModel(model);
    }

    @Override
    public void setHd(Integer hd) {
        super.setHd(hd);
    }

    @Override
    public void setScreen(Integer screen) {
        super.setScreen(screen);
    }

    @Override
    public void setRam(Integer ram) {
        super.setRam(ram);
    }
}
