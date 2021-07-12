package com.helltf.TBBackend.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Name")
public class Name {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    public int id;

    @Column(name = "Name")
    public String name;

    public Name(){

    }

    public Name(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
