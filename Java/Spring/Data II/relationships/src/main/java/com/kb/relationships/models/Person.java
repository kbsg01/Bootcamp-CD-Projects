package com.kb.relationships.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="persons")
@Getter
@Setter
@NoArgsConstructor
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 5, max = 50, message = "The name must be between 5 and 50 characters long")
    private String firstName;

    @NotNull
    @Size(min = 5, max = 50, message = "The last name must be between 5 and 50 characters long")
    private String lastName;

    @Column(updatable=false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    @OneToOne(mappedBy="person", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private License license;
        

    @PrePersist
    public void onCreate(){
        this.createdAt = new Date();
    }

    @PreUpdate
    public void onUpdate(){
        this.updatedAt = new Date();
    }
}

