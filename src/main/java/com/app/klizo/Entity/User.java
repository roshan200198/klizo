package com.app.klizo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user")
public class User {
	
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    
    @Column(length=40)
    private String firstName;
    @Column(length=40)
    private String lastName;
    @Column(length=40)
    private String userName;
    @Column(length=45)
    private String password;

}
