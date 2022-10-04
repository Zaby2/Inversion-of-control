package ru.example.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer mp = context.getBean("playerBean", MusicPlayer.class);
        mp.playMusic();
        context.close();
    }
}