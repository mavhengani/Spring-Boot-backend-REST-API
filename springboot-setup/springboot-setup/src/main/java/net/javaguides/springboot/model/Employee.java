package net.javaguides.springboot.model;

import jakarta.persistence.*;
import  lombok.AllArgsConstructor;
import  lombok.Getter;
import  lombok.Setter;
import  lombok.NoArgsConstructor;

//dependences
// we use jpi notation
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(name ="first_name")
    private  String firstname;
    @Column(name ="last_name")
    private String lastName;
    @Column(name ="email")
    private String email;
}
