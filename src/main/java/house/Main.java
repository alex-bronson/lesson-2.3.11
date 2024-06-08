package house;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Саня либераст","Саня гей", "Саня 20 лет в кс", "Саня патриот");

        System.out.printf("Новость: %s.\nОпыт: %s.\nСплетни: %s.", human.getNews(), human.getExperience(), human.getGossip());
    }
}
