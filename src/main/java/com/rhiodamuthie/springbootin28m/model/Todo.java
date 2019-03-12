package com.rhiodamuthie.springbootin28m.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Todo{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

//    private User user;

    private String user;

    @Size(min = 8 ,max = 255 ,message = "Must between 8-255 character")
    private String desc;

    private Date targetDate;

    private boolean isDone;



}
