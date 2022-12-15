package com.kb.events.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be blank" )
    @Size(min=4, message="Name must be more than 4 characters")
    private String name;

    @FutureOrPresent
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date date;

    @NotBlank(message = "Location cannot be blank")
    @Size(min = 2, message = "Location must be more than 2 characters!")
    private String location;

    private String state;

    @Column(updatable = false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;


    @ManyToMany( fetch=FetchType.LAZY)
    @JoinTable(
        name = "users_events",
        joinColumns= @JoinColumn(name="event_id"),
        inverseJoinColumns = @JoinColumn(name ="user_id")
    )
    private List<User> joinedUsers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY)
    private List<Message> messages;

    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updatedAt=new Date();
    }

    public Event() {
    }


}
