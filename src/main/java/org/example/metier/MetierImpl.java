package org.example.metier;

import org.example.dao.DaoImpl;

import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {
    DaoImpl dao;

    public MetierImpl(DaoImpl dao) {
        this.dao = dao;
    }

    public void setDao(DaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public double calculer() {
        double data = dao.getData();
        return data * 5;
    }
}
