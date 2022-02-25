package com.patterns.builder;

/**
 * @author Qiq
 * @date 2022/2/14
 */
public class OutFitBuilder {

    private Outfit outfit;

    public OutFitBuilder() {
        this.outfit = new Outfit();
    }

    public OutFitBuilder buildHat(String hat){
        outfit.setHat(hat);
        return this;
    }

    public OutFitBuilder buildSunglasses(String sunglasses) {
        outfit.setSunglasses(sunglasses);
        return this;
    }

    public OutFitBuilder buildCoat(String coat) {
        outfit.setCoat(coat);
        return this;
    }

    public OutFitBuilder buildPants(String pants) {
        outfit.setPants(pants);
        return this;
    }

    public OutFitBuilder buildShoe(String shoe) {
        outfit.setShoe(shoe);
        return this;
    }

    public Outfit build() {
        return this.outfit;
    }

}
