package com.design.creational.factorymethod;

/**
 * @author LiuZX liuzhixiang
 * DATE   2018/10/30
 */

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
