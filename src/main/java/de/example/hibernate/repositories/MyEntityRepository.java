package de.example.hibernate.repositories;

import de.example.hibernate.entity.MyEntity;
import org.springframework.data.repository.CrudRepository;

public interface MyEntityRepository extends CrudRepository<MyEntity, Long> {


}
