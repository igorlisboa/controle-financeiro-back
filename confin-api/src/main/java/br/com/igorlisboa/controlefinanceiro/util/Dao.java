package br.com.igorlisboa.controlefinanceiro.util;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

        Optional<T> get(Integer id);

        List<T> getAll();

        Boolean save(T t);

        T update(T t);

        Boolean delete(T t);

}
