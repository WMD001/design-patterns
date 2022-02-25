package com.patterns.builder;

/**
 * @author Qiq
 * @date 2022/2/14
 */
public class Outfit {

    private String hat;
    private String sunglasses;
    private String coat;
    private String pants;
    private String shoe;

    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    public String getSunglasses() {
        return sunglasses;
    }

    public void setSunglasses(String sunglasses) {
        this.sunglasses = sunglasses;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public String getPants() {
        return pants;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    public String getShoe() {
        return shoe;
    }

    public void setShoe(String shoe) {
        this.shoe = shoe;
    }

    @Override
    public String toString() {
        return "Outfit{" +
                "hat='" + hat + '\'' +
                ", sunglasses='" + sunglasses + '\'' +
                ", coat='" + coat + '\'' +
                ", pants='" + pants + '\'' +
                ", shoe='" + shoe + '\'' +
                '}';
    }
}
