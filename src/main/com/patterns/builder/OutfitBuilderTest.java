package com.patterns.builder;

/**
 * @author Qiq
 * @date 2022/2/14
 */
public class OutfitBuilderTest {

    public static void main(String[] args) {
///        ConcreteOutfitBuilder1 builder1 = new ConcreteOutfitBuilder1();
//        OutfitDirector outfitDirector = new OutfitDirector(builder1);
//        Outfit cowboy = outfitDirector.build();
//        System.out.println("牛仔风: " + cowboy.toString());
//
//        ConcreteOutfitBuilder2 builder2 = new ConcreteOutfitBuilder2();
//        outfitDirector.changeBuilder(builder2);
//        Outfit leisure = outfitDirector.build();
//        System.out.println("休闲风: " + leisure.toString());

        OutFitBuilder outFitBuilder = new OutFitBuilder();
        Outfit outfit = outFitBuilder.buildHat("休闲鸭舌帽")
                .buildCoat("牛仔外套")
                .buildPants("牛仔裤")
                .buildShoe("休闲鞋")
                .build();
        System.out.println("混搭风：" + outfit.toString());
    }

}
