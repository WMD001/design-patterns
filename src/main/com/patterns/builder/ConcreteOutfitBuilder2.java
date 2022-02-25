package com.patterns.builder;

/**
 * @author Qiq
 * @date 2022/2/14
 */
public class ConcreteOutfitBuilder2 extends AbstractOutfitBuilder {

    @Override
    public void buildHat() {
        outfit.setHat("休闲鸭舌帽");
    }

    @Override
    public void buildSunglasses() {
        outfit.setSunglasses("休闲墨镜");
    }

    @Override
    public void buildCoat() {
        outfit.setCoat("休闲外套");
    }

    @Override
    public void buildPants() {
        outfit.setPants("休闲长裤");
    }

    @Override
    public void buildShoe() {
        outfit.setShoe("休闲鞋");
    }
}
