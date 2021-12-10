package objects;

import others.Place;

public abstract class AObject implements IObject {
    protected String name;
    protected Place place;

    public String getName() {
        return this.name = name;
    }

    public Place setPlace(Place place){
        return this.place = place;
    }

    @Override
    public String setNear(Objects objects){
        return this.name + " находится возле " + objects.getName();
    }
}