package academy.devdojo.maratonajava.javacore.ZZCjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZCjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZCjdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {
    public static List<Producer> findByNameJdbcRowSet(String name){
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }
}
