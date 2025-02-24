package org.example.presentation;

import org.example.dao.DaoImpl;
import org.example.metier.MetierImpl;

public class DeclDynamique {
    public static void main(String[] args) {
        DaoImpl dao;
        dao = new DaoImpl();
        MetierImpl metier;
        metier = new MetierImpl(dao);
        System.out.println(metier.calculer());
    }
}
