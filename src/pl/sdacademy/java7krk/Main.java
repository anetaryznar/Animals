package pl.sdacademy.java7krk;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<SoundMaker> sounds = new LinkedList<>();


        SoundMaker cat = new Cat();
        SoundMaker dog = new Dog();
        SoundMaker giraffe = new Giraffe();

        sounds.add(cat);
        sounds.add(dog);
        sounds.add(giraffe);



        for (SoundMaker sound : sounds) {
            sound.makeSound();
        }



    }
}
