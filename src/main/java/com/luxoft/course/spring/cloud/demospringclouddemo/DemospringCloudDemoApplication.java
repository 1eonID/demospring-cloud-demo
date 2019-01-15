package com.luxoft.course.spring.cloud.demospringclouddemo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@RepositoryRestResource
interface CatRepo extends JpaRepository<Cat, Long> {}

@SpringBootApplication
public class DemospringCloudDemoApplication {



	public static void main(String[] args) {
		SpringApplication.run(DemospringCloudDemoApplication.class, args);
	}


}


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
class Cat {

	@Id
	@GeneratedValue
	Long id;

	String name;

	public Cat(String name) {
		this.name = name;
	}
}


