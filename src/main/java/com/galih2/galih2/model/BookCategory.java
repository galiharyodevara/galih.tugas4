package com.galih2.galih2.model;

import javax.persistence.*;

@Entity
@Table
public class BookCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    @OneToMany(mappedBy = "bookcategory", cascade = CascadeType.ALL, fetch = FetchType.LAZY)

//    public BookCategory() {
//    }

//    public BookCategory(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }

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
