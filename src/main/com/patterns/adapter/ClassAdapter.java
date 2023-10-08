package com.patterns.adapter;

/**
 * @author Qiq
 * @date 2022/2/15
 */
public class ClassAdapter extends Service implements ClientInterface {

    @Override
    public void method(String data) {
        specificMethod(data);
    }
}
