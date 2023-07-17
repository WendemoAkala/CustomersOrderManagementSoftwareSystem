public class Cat extends  Animal implements Pet{
private  String name;
    public Cat(int legs,String name) {
        super(legs);
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String setName() {
        return null;
    }

    @Override
    public void play() {

    }
}
