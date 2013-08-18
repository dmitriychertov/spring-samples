package com.karmanov.shm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Deman
 * Date: 17.08.13
 * Time: 10:11
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "actor")
public class Actor {

    @Id
    @Column(name = "actor_id")
    private Integer id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "last_update", nullable = false)
    private Date lastUpdatedOn;


    public Actor() {
    }

    public Actor(Integer id, String firstName, String lastName, Date lastUpdatedOn) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Date lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;

        if (firstName != null ? !firstName.equals(actor.firstName) : actor.firstName != null) return false;
        if (id != null ? !id.equals(actor.id) : actor.id != null) return false;
        if (lastName != null ? !lastName.equals(actor.lastName) : actor.lastName != null) return false;
        if (lastUpdatedOn != null ? !lastUpdatedOn.equals(actor.lastUpdatedOn) : actor.lastUpdatedOn != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (lastUpdatedOn != null ? lastUpdatedOn.hashCode() : 0);
        return result;
    }
}
