package com.easybytes.sec26streamsapi.p12terminalopeartions;

import java.util.List;

public class P13_GetAllPersonAgeSum {

    public static void main(String[] args) {

        List<P13_PersonPojo> personObjList = List.of(
                new P13_PersonPojo(10),
                new P13_PersonPojo(10),
                new P13_PersonPojo(20),
                new P13_PersonPojo(30)
        );

        /*
        get total sum of all person objects
        personObjList is collection of person objects

         */
        Double totalage = personObjList.stream()
                .map(P13_PersonPojo::getAge)
                .reduce(0.0, Double::sum);

        System.out.println("total age sum - " + totalage);

    }
}
