package com.patterns.builder;

/**
 * @author Qiq
 * @date 2022/2/14
 */
public class OutfitDirector {

    AbstractOutfitBuilder builder;

    public OutfitDirector(AbstractOutfitBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(AbstractOutfitBuilder builder) {
        this.builder = builder;
    }

    public Outfit build() {
        builder.buildOutfit();
        builder.buildHat();
        builder.buildSunglasses();
        builder.buildCoat();
        builder.buildPants();
        builder.buildShoe();
        return builder.outfit;
    }

}
