public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        double dog=8;
        System.out.println(dog);
        var cat=3.6;
        System.out.println(cat);
        var peper=763789;
        System.out.println(peper);

        System.out.println("Задача 2");
        dog=dog+4;
        System.out.println(dog);
        cat=cat+4;
        System.out.println(cat);
        peper=peper+4;
        System.out.println(peper);

        System.out.println("Задача 3");
        dog=dog-3.5;
        System.out.println(dog);
        cat=cat-1.6;
        System.out.println(cat);
        peper=peper-7639;
        System.out.println(peper);

        System.out.println("Задача 4");
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        System.out.println("Задача 5");
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);


        System.out.println("Задача 6");
        var oneBoxer=78.2;
        var twoBoxer=82.7;
        System.out.println("Общий вес двух бойцов: "+(oneBoxer+twoBoxer));
        System.out.println("Разница весов двух бойцов: "+(twoBoxer-oneBoxer));

        System.out.println("Задача 7");
        System.out.println("Разница весов двух бойцов:(1 способ) "+(twoBoxer-oneBoxer));
        System.out.println("Разница весов двух бойцов:(2 способ) "+(twoBoxer%oneBoxer));

        System.out.println("Задача 8");
        var workingHours=640;
        var hours=8;
        var summaElit=workingHours/hours;
        System.out.println("Всего работников в компании "+summaElit+" человек");
        summaElit=summaElit+94;
        var summaHours=summaElit*hours;
        System.out.println("Если в компании работает "+summaElit+" человек, то всего "+summaHours+" часов работы может быть поделено между сотрудниками");
    }
}