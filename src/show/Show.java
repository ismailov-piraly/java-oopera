import model.Actor;
import model.Director;

import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getActors() {
        return listOfActors;
    }

    public void setActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    @Override
    public String toString() {
        String result = "Show{";

        for (Actor actor : listOfActors) {
            result += actor.toString() + ", ";
        }
        result += '}';

        return result;
    }

    public void addActor(Actor actor) {
        if (actor == null) {
            System.out.println("actor is null");
        } else if (this.listOfActors.contains(actor)) {
            System.out.println("actor already exists");
        } else {
            this.listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor actor, String surname) {

        if (actor == null) {
            System.out.println("actor is null");
        } else if (surname == null) {
            System.out.println("surname is null");
        } else if (this.listOfActors.isEmpty()) {
            System.out.println("actors is empty");
        } else if (this.listOfActors.contains(actor)) {
            Actor actorToReplace = findBySurname(surname);
            if (actorToReplace == null) {
                System.out.println("surname not found");
                return;
            }
            this.listOfActors.remove(actorToReplace);
            this.listOfActors.add(actor);
        }
    }

    public Actor findBySurname(String surname) {
        if (surname == null) return null;

        for (Actor actor : this.listOfActors) {
            if (surname.equals(actor.getSurname())) {
                return actor;
            }
        }
        return null;
    }
}
