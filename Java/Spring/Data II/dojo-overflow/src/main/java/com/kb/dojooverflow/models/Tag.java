package com.kb.dojooverflow.models;

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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2)
    private String subject;

    @Column(updatable = false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name="tags_questions",
        joinColumns = @JoinColumn(name="tag_id"),
        inverseJoinColumns =  @JoinColumn(name="question_id")
    )
    private List<Question> questions;

    public Tag() {
    }

    public Tag(@Size(min = 2) String subject) {
        this.subject = subject;
    }

    public Tag(Long id, @Size(min = 2) String subject, Date createdAt, Date updatedAt, List<Question> questions) {
        this.id = id;
        this.subject = subject;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.questions = questions;
    }

}
