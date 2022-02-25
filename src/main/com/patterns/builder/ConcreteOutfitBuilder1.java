package com.patterns.builder;

/**
 * @author Qiq
 * @date 2022/2/14
 */
public class ConcreteOutfitBuilder1 extends AbstractOutfitBuilder {

    @Override
    public void buildHat() {
        outfit.setHat("西部牛仔帽子");
    }

    @Override
    public void buildSunglasses() {
        // 众所周知，牛仔不戴墨镜
        outfit.setSunglasses(null);
    }

    @Override
    public void buildCoat() {
        outfit.setCoat("西部牛仔外套");
    }

    @Override
    public void buildPants() {
        outfit.setPants("西部牛仔裤子");
    }

    @Override
    public void buildShoe() {
        outfit.setShoe("西部牛仔靴子");
    }
}
