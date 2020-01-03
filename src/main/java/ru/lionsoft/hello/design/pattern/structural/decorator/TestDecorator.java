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
 *
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

        System.out.println("#### Static ####");
        Business business = new BusinessDecoratorImpl(new BusinessImpl());
        business.method1();
        business.method2();
        business.method3();
        business.method4();
        System.out.println(business.func1("S"));
        System.out.println(business.func2("S"));
        System.out.println(business.func3("S"));

        System.out.println("#### Dynamic ####");
        business = BusnisessDecoratorDynamic.createDecorator(new BusinessImpl());
        business.method1();
        business.method2();
        business.method3();
        business.method4();
        System.out.println(business.func1("S"));
        System.out.println(business.func2("S"));
        System.out.println(business.func3("S"));

//        System.out.println("#### Generic ####");
//        business = GenericDecorator.createDecorator(Business.class, new BusinessImpl(), BusinessDecoratorAbstract.class);
//        business.method1();
//        business.method2();
//        business.method3();
//        business.method4();
//        System.out.println(business.func1("S"));
//        System.out.println(business.func2("S"));
//        System.out.println(business.func3("S"));
    }
}
