package com.spring.springbootadmin.entities;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
@Data
@Entity
public class UserEntity implements Serializable {

    private static  final Long serialVersionUID=1L;
    @Id @GeneratedValue
    private Integer userId;
    private String username;
    private String phoneNumbers;
}
