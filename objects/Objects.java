package objects;

import others.Place;

public class Objects extends AObject {

    public Objects(String name, Place place){
        this.name = name;
        this.place = place;
    }

    public Objects(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Place getPlace(){
        return place;
    }

    @Override
    public String toString(){
        Place place = getPlace();
        return "Objects: " +
                "name = " + name + ", "+
                "place = " + place.getName();
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }

    @Override
    public boolean equals(Object objects){
        if (this == objects) return true;
        if (objects == null || getClass() != objects.getClass()) return false;
        AObject aObject = (AObject) objects;
        return java.util.Objects.equals(name, aObject.name);
    }
}