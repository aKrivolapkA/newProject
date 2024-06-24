package src.main.java.lesson6;

public class CreatureProject {

    public static void main(String[] args) {

        Creature creature = new Creature();
        Human human = new Human();
        Get get = new Get();

        System.out.println(creature instanceof Creature);//экземляр класса принадлежит ли классу Creature
        System.out.println(human instanceof Creature);// instanceof ключевое слово
        System.out.println(creature instanceof Human);
        System.out.println(get instanceof Object);
        // System.out.println(human instanceof Get);классы потомки не связаны друг  с другом


        creature.identifyCreater(get);


    }
}

