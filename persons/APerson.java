package persons;

import others.Place;
import others.Feeling;

import java.util.Objects;

public abstract class APerson implements IPerson {
    protected String name;
    protected Feeling feel;
    protected Place place;

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        APerson aPerson = (APerson) object;
        return Objects.equals(name, aPerson.name);
    }

    @Override
    public String toString(){
        return "Persons: " +
                "name = " + name;
    }

    public String getName(){
        return this.name = name;
    }

    public Feeling setFeel(Feeling feeling){
        return this.feel = feeling;
    }

    public Place getPlace(){
        return place;
    }

    public Place setPlace(Place place) {
        return this.place = place;
    }

    @Override
    public String walk(Place place){
        return this.name + " перемещается в " + place.getName();
    }
}