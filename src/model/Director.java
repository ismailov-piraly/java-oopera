public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    //Распечатать информацию о режиссёре спектакля — должны выводиться его имя и фамилия.
    @Override
    public String toString() {
        return "Director{" +
                "name=" + this.getName() +
                ", surname=" + this.getSurname() +
                '}';
    }
}
