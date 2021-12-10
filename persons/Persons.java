package persons;

import objects.Objects;
import others.Feeling;
import others.Place;

public class Persons extends APerson {

    public Persons(String name){
        this.name = name;
        this.place = null;
    }


    public String waitForAWhile(){
        return (name + " немного подождал");
    }

    public String addNothing(){
        return (", но поскольку " + name + " ничего больше не добавил, ");
    }

    public String getOut(Objects objects){
        return (name + " вылез из " + objects.getName() + ".");
    }

    public String walkBack(){
        return (name + " зашагал берегом назад" + ".");
    }

    public String sitOn(Objects objects){
        return (name + " сел на " + objects.getName() + ".");
    }

    public String strike(Objects in, Objects on){
        if (feel == Feeling.CAREFUL){
            return (name + " осторожно выбил " + in.getName() + " из " + on.getName() + ".");
        }
        else {
            return (name + " выбил " + in.getName() + " из " + on.getName() + ".");
        }
    }

    public String lean(){
        return (name + " наклонился" + ".");
    }

    public String lookOut(Objects objects){
        return (name + " выглянул из-за " + objects.getName() + ".");
    }

    public String cape(){
        if (feel == Feeling.CONFIDENT){
            return (name + " уверенно держал курс вперед" + ".");
        }
        else {
            return (name + " держал курс вперед" + ".");
        }
    }

    public String beSeen(Place place){
        return (name + " был отчетливо виден на " + place.getName() + ".");
    }

    public String laugh(){
        if (feel == Feeling.CALM){
            return (name + " тихонько рассмеялся" + ".");
        }
        else {
            return (name + " рассмеялся" + ".");
        }
    }

    public String startedFilling(Objects objects){
        return (name + " начал набивать свою " + objects.getName() + ".");
    }
}