package de.example.web.controller;

import de.example.hibernate.dao.MyEntityDao;
import de.example.hibernate.repositories.MyEntityRepository;
import de.example.hibernate.entity.MyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/example")
public class ExampleController {

    @Autowired
    private MyEntityDao myEntityDao;

    @Autowired
    private MyEntityRepository myEntityRepository;


    @RequestMapping("/find/{id}")
    @ResponseBody
    public MyEntity find(@PathVariable("id") long id) {
        return myEntityRepository.findOne(id);

    }

    @RequestMapping("/all")
    @ResponseBody
    public Iterable<MyEntity> findAll() {
        return myEntityRepository.findAll();

    }

    @RequestMapping("/create/")
    @ResponseBody
    public MyEntity create() {

        MyEntity myEntity = new MyEntity();
        myEntity.setCreated(new Date());
        myEntity.setName("Beispiel:" + ((int) (1000000 * Math.random())));

        return myEntityRepository.save(myEntity);

    }


}
