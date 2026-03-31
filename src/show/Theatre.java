import model.Actor;
import model.Director;
import model.Gender;

public class Theatre {

    public  static void main(String[] args) {

        Actor actor1 = new Actor("Джейсон", "Стейтем", Gender.MALE, 178);
        Actor actor2   = new Actor("Джеки", "Чан", Gender.MALE, 177);
        Actor actor3 = new Actor("Джеймс", "Гандольфини", Gender.MALE, 180);

        Director director1  = new Director("Майкл", "Бэй", Gender.MALE, 3);
        Director director2  = new Director("Квентин", "Тарантино", Gender.MALE, 5);

        Person musicAuthor = new Person("Людвиг", "Бетховен", Gender.MALE);
        Person choreographer = new Person("Марта", "Грэм", Gender.FEMALE);



    }
}
