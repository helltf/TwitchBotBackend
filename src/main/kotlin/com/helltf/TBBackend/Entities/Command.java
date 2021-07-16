package com.helltf.TBBackend.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commands")
public class Command {
    @Id
    @Column(name = "ID")
    public int id;

    @Column(name = "NAME")
    public String name;

    @Column(name = "COUNTER")
    public int counter;

    @Column(name = "REQUIRED_PERMISSIONS")
    public byte requiredPermissions;

    @Column(name = "DESCRIPTION", columnDefinition = "LONGTEXT")
    public String description;

    @Column(name = "REQUIRED_PARAMETERS")
    public String requiredParameters;

    @Column(name = "OPTIONAL_PARAMETERS")
    public String optionalParameters;
}
