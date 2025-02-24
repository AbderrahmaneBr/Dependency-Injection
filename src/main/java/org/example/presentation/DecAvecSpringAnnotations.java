package org.example.presentation;

import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DecAvecSpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calculer());
    }
}
