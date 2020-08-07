/*
 * File:    TestDecorator.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.decorator;

/**
 * Тестирование Декораторов (Decorator)
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestDecorator {

    public static void main(String[] args) throws Exception {
        Car sportCar = new SportCar();
        Car blueUnknownCar = new BlueCarDecorator(new UnknownCar());
        sportCar.draw();
        System.out.println("####");
        blueUnknownCar.draw();

        System.out.println("####");
        Wine redWine = new HtmlColorWineDecorator(new HtmlNameWineDecorator(new RedWine()));
        Wine whiteWine = new HtmlColorWineDecorator(new WhiteWine());
        System.out.println(redWine.getName() + " -> " + redWine.getColor());
        System.out.println(whiteWine.getName() + " -> " + whiteWine.getColor());
        /*        
        InputStream in = new GZIPInputStream(
                                new BufferedInputStream(
                                    new FileInputStream(new File("test.bin"))
                                )
                          );
        in.read();
         */

    }
}
