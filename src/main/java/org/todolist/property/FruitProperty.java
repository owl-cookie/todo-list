package org.todolist.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


/*
@ConfigurationProperties 를 사용하려면, Component annotation 이 필요함.

 */

@Component
@ConfigurationProperties("fruit")
@Data
public class FruitProperty {
	private List<Map> list;
}
