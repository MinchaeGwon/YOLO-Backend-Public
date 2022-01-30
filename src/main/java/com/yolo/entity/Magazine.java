package com.yolo.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="magazine")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Magazine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false)
	private long id;
	
	@Column(name="link")
	private String link;
	
	@Column(name="thumbnail")
	private String thumbnail;
	
	@Column(name="month")
	private int month;
	
}
