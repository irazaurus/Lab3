import objects.*;
import persons.*;
import others.*;

/** Он немного подождал, но поскольку Снусмумрик ничего больше не добавил,
 * Муми-тролль вылез из лодки и зашагал берегом назад.
 * Снусмумрик сел на корму и осторожно выбил пепел из трубки, он наклонился и выглянул из-за камышей.
 * Хемуль уверенно держал курс вперед. Он был отчетливо виден на лунной дорожке.
 * Снусмумрик тихонько рассмеялся и начал набивать свою трубку.
 **/


public class Main {

    public static void main(String[] args) {

            //создаем персонажей
        Persons Snufkin = new Persons("Снусмумрик");
        Persons MoomyTroll = new Persons("Муми-тролль");
        Persons Hemul = new Persons("Хемуль");
            //создаем места
        Place Coast = new Place("Берег");
        Place MoonPath = new Place("Лунная дорожка");
            //создаем объекты
        Objects Boat = new Objects("Лодка", Coast);
        Objects Stern = new Objects("Корма");
        Objects Ash = new Objects("Пепел");
        Objects Pipe = new Objects("Трубка");
        Objects Canes = new Objects("Камыши");


        System.out.println(MoomyTroll.waitForAWhile() + Snufkin.addNothing() + MoomyTroll.getOut(Boat));
        System.out.println(MoomyTroll.walkBack());
        System.out.println(Snufkin.sitOn(Stern));
            Snufkin.setFeel(Feeling.CAREFUL);
        System.out.println(Snufkin.strike(Ash, Pipe));
        System.out.println(Snufkin.lean());
        System.out.println(Snufkin.lookOut(Canes));
            Hemul.setFeel(Feeling.CONFIDENT);
        System.out.println(Hemul.cape());
        System.out.println(Hemul.beSeen(MoonPath));
            Snufkin.setFeel(Feeling.CALM);
        System.out.println(Snufkin.laugh());
        System.out.println(Snufkin.startedFilling(Pipe));

    }
}