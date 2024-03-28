public class Akita extends Dog{
    Akita(String name, String description, int price) {
        super(name, description, price);
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public String getDescription(){
        return this.description;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getBreed() {
        return "Akita";
    }
}
