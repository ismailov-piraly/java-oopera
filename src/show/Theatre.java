package show;

import model.*;

import java.util.ArrayList;

public class Theatre {

    public  static void main(String[] args) {

        Actor actor1 = new Actor("Джейсон", "Стейтем", Gender.MALE, 178);
        Actor actor2   = new Actor("Джеки", "Чан", Gender.MALE, 177);
        Actor actor3 = new Actor("Джеймс", "Гандольфини", Gender.MALE, 180);

        Director director1  = new Director("Майкл", "Бэй", Gender.MALE, 3);
        Director director2  = new Director("Квентин", "Тарантино", Gender.MALE, 5);

        Person musicAuthor = new Person("Людвиг", "Бетховен", Gender.MALE);
        Person choreographer = new Person("Марта", "Грэм", Gender.FEMALE);

        Show show = new Show( "Обычное шоу", 60, director1, new ArrayList<Actor>());
        Opera opera = new Opera("Опера", 80, director2, new ArrayList<Actor>(), musicAuthor, "Libretto Text Opera", 10);
        Ballet ballet = new Ballet("Баллет", 100, director1, new ArrayList<Actor>(), musicAuthor, "Libretto Text Ballet", choreographer);

        show.addActor(actor1);
        show.addActor(actor3);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        System.out.println(show.toString());

        System.out.println();
        System.out.println(opera.toString());

        System.out.println();
        System.out.println(ballet.toString());

        System.out.println();
        show.replaceActor(actor2, "Гандольфини");
        System.out.println(show.toString());

        System.out.println();
        opera.replaceActor(actor1, "no name");

        System.out.println();
        System.out.println(opera.getLibrettoText());
        System.out.println(ballet.getLibrettoText());
    }
}
