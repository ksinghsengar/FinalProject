package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by krishan on 7/15/2017.
 */
@Entity
public class DocumentResource extends Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer id;
     private String filePath;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "DocumentResource{" +
                "id=" + id +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
