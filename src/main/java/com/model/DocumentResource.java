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

     private String filePath;


    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "DocumentResource{" +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
