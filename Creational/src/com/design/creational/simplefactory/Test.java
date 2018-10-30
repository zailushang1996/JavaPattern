package com.design.creational.simplefactory;

import javax.swing.text.ViewFactory;

/**
 * @author LiuZX liuzhixiang
 * DATE   2018/10/30
 */

public class Test {
    public static void main(String[] args) {
      /*  VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        video.produce();*/

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }

        video.produce();
    }
}
