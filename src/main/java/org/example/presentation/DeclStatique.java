package org.example.presentation;

import org.example.dao.DaoImpl;
import org.example.metier.MetierImpl;

public class DeclStatique {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println(metier.calculer());
    }
}