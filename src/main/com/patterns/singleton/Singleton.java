package com.patterns.singleton;

/**
 * @author Qiq
 * @date 2021/12/14
 */
public class Singleton {

    /**
     * 静态成员变量缓存单例
     */
    public static Singleton instance;

    private String value;

    public String getValue() {
        return this.value;
    }

    /**
     * 构造方法私有
     * @param value value
     */
    private Singleton(String value) {
        this.value = value;
    }

    /**
     * 静态方法替代构造函数
     * @param value value
     * @return Singleton
     */
    public static Singleton getInstance(String value) {
        // 初次调用时初始化
        if (instance == null) {
            instance = new Singleton(value);
        }
        // 返回缓存对象
        return instance;
    }
}
