package org.todolist.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


/*
@ConfigurationProperties 를 사용하려면, Component annotation 이 필요함.

 */
@Data
@Component
@ConfigurationProperties("fruit")
public class FruitProperty {
	private List<Map> list;
}
