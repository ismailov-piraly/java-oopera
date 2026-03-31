import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //Распечатать список всех актёров, участвующих в спектакле. Для каждого актёра при этом должны выводиться имя и фамилия, а также в скобках его рост.
    @Override
    public String toString() {
        return "Actor{" +
                "name=" + this.getName() +
                ", surname=" + this.getSurname() +
                ", (height=" + this.getHeight() +
                ")}";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) return false;
        Actor actor = (Actor) object;
        return this.getName() == actor.getName() && this.getSurname() == actor.getSurname() && this.getHeight() == actor.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getSurname(), this.getHeight());
    }
}
