package de.example.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "MyEntity")
public class MyEntity extends AbstractEntity {

    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public MyEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
