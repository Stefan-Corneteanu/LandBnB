package com.upb.rsf.LandBnB.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Estate {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private List<String> imgs = new ArrayList<>();
    private double price;
    private String phoneNo;
    private String description;

    public Estate(String title, double price, String phoneNo, String description) {
        this.title = title;
        this.price = price;
        this.phoneNo = phoneNo;
        this.description = description;
    }

    public void addImg(String img){
        imgs.add(img);
    }
}
