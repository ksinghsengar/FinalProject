package com.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ResourceId")
     private Integer id;
     private String description;
     @ManyToOne
     private User user;
     @ManyToOne
     private Topic topic;
     private Date dateCreated;
     private Date lastUpdated;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", user=" + user +
                ", topic=" + topic +
                ", dateCreated=" + dateCreated +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
