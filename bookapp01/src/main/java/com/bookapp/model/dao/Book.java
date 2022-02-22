package com.bookapp.model.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//@Getter
//@Setter
//@EqualsAndHashCode
////@ToString(exclude= {"id"})
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
@Data
@Entity
@Table(name="book_table")
public class Book {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private Double price;
	private String author;

	
}
