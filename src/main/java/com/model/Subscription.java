package com.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SubscriptionId")
    private Integer id;
    @ManyToOne
    private  Topic topic;
    @ManyToOne
    private User user;
    @Enumerated(EnumType.STRING)
   private Seriousness seriousness;
    Date dateCreated;

    public enum Seriousness{
        SERIOUS, VERY_SERIOUS, CASUAL;
    }

    public Seriousness getSeriousness() {
        return seriousness;
    }

    public void setSeriousness(Seriousness seriousness) {
        this.seriousness = seriousness;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", topic=" + topic +
                ", user=" + user +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
