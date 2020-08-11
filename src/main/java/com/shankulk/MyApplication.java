package com.shankulk;

import com.shankulk.feature.AbstractFeature;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyApplication {

	@Autowired
	private List<AbstractFeature> features;

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

	@PostConstruct
	public void run() {
		features.stream().forEach(f -> f.display());
	}
}
