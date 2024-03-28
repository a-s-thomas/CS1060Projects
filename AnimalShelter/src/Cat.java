public class Cat extends AdoptableAnimal{

    String name;

    String description;

    int price;

    Cat(String name, String description, int price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
