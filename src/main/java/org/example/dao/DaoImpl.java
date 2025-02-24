package org.example.dao;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        double data = 121.65;

        return data;
    }
}
