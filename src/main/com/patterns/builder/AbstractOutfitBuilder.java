package com.patterns.builder;

/**
 * @author Qiq
 * @date 2022/2/14
 */
public abstract class AbstractOutfitBuilder {

    Outfit outfit;

    public void buildOutfit(){
        outfit = new Outfit();
    }

    public abstract void buildHat();
    public abstract void buildSunglasses();
    public abstract void buildCoat();
    public abstract void buildPants();
    public abstract void buildShoe();

}
