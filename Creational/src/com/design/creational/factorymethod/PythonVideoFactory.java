package com.design.creational.factorymethod;

/**
 * @author LiuZX liuzhixiang
 * DATE   2018/10/30
 */

public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
