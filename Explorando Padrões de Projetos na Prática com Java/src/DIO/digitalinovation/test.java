package DIO.digitalinovation;

import DIO.digitalinovation.Facade.Facade;
import DIO.digitalinovation.Singleton.SingletonEager;
import DIO.digitalinovation.Singleton.SingletonLazy;
import DIO.digitalinovation.Singleton.SingletonLazyHolder;
import DIO.digitalinovation.Strategy.*;

public class test {
    public static void main(String[] args){
        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        // Strategy
        Comportament defensivo = new ComportamentDefensivo();
        Comportament normal = new ComportamentNormal();
        Comportament agressive = new ComportamentAgressive();

        Robot robot = new Robot();
        robot.setComportament(normal);
        robot.mover();
        robot.mover();
        robot.setComportament(defensivo);
        robot.mover();
        robot.setComportament(agressive);
        robot.mover();

        // Facade
        Facade facade = new Facade();
        facade.migrarCliente("Lucineide", "25520391");


    }
}
