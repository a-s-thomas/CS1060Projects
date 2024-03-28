public abstract class Dog extends AdoptableAnimal {

    String name;

    String description;

    int price;

    Dog(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    abstract String getBreed();
}
