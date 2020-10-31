package com.example.srpingbootvalidation.annoation;

import com.example.srpingbootvalidation.bean.Person;
import org.hibernate.validator.spi.group.DefaultGroupSequenceProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname PersonGroupSequenceProvider
 * @Description
 * @Date 2020/10/17 15:55
 * @Created gengxiao
 */
public class PersonGroupSequenceProvider implements DefaultGroupSequenceProvider<Person> {

    @Override
    public List<Class<?>> getValidationGroups(Person person) {
        List<Class<?>> defaultGroupSequence = new ArrayList<>();
        //默认组
        defaultGroupSequence.add(Person.class);
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是耿");        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("asdasdasdas");
        System.out.println("asdasdasdas");
        System.out.println("asdasdasdas");
        System.out.println("asdasdasdas");
        System.out.println("asdasdasdas");
        System.out.println("asdasdasdas");
        System.out.println("asdasdasdas");
        System.out.println("asdasdasdas");

        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");

        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是加王佛那个");
        System.out.println("我是耿");
        //根据年龄进行组选择
        if(person != null){
          Integer age = person.getAge();
          if(age < 5){
              defaultGroupSequence.add(Person.lev1.class);
          }else if(age < 18){
              defaultGroupSequence.add(Person.lev2.class);
          }else{
              defaultGroupSequence.add(Person.lev3.class);
          }
        }
        return defaultGroupSequence;
    }
}
