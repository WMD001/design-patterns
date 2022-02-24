package com.patterns;

import com.patterns.singleton.Singleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSingleton {

    @Test
    public void testSingleton() {
        Singleton king = Singleton.getInstance("king");
        Singleton queen = Singleton.getInstance("queen");
        Assertions.assertEquals(king, queen);
    }

}
