package com.panda;

import com.panda.po.Classes;
import com.panda.po.Person;
import com.panda.responsiry.ClassesRepository;
import com.panda.responsiry.PersonResposiry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpademoApplicationTests {

	@Autowired
	private PersonResposiry personResposiry;
	@Autowired
	private ClassesRepository classesRepository;
	@Test
	public void contextLoads() {
		/*Classes classes1 = new Classes(1,"信息科学与技术");
		Classes classes2 = new Classes(2,"数字媒体与技术");
		Classes classes3 = new Classes(3,"软件工程");
		List<Classes> list = new ArrayList<>();
		list.add(classes1);
		list.add(classes2);
		list.add(classes3);
		classesRepository.save(list);*/
		/*Person person1 = new Person("陈天雄","男",1);
		Person person2 = new Person("张逸杰","男",1);
		Person person3 = new Person("沈城","男",1);
		List<Person> list = new ArrayList<>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		personResposiry.save(list);*/
		/*Iterable<Person> iterable = personResposiry.findByCid(1);
		for (Person p : iterable)
			System.out.println(p);*/

		System.out.println(classesRepository.updateClasses("电子信息与技术",1));
	}

}
