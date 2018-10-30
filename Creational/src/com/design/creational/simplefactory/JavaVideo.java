package com.design.creational.simplefactory;

/**
 * @author LiuZX liuzhixiang
 * DATE   2018/10/30
 */

public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
