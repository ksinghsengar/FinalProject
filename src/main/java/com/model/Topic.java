
package com.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TopicId")
    private int id;
    private String name;
    private Date datecreated;
    private Date lastupdated;
    @Enumerated(EnumType.STRING)
    private Visibility visibility;

  @ManyToMany(mappedBy = "topicList")
  List <User> userList = new ArrayList<>();


    public enum Visibility{
        PUBLIC,PRIVATE;
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

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Date getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Date lastupdated) {
        this.lastupdated = lastupdated;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", datecreated=" + datecreated +
                ", lastupdated=" + lastupdated +
                ", visibility=" + visibility +
                ", userList=" + userList +
                '}';
    }
}
