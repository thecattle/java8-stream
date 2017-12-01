package com.sunp;

import com.sunp.data.Data;
import com.sunp.data.PersonModel;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Fiter {
    public static void main(String[] args) {
        fiterSex();
    }

    /**
     * 过滤所有的男性
     */
    public static void fiterSex(){
        List<PersonModel> data = Data.getData();

        //old
        List<PersonModel> temp=new ArrayList<>();
        for (PersonModel person:data) {
            if ("男".equals(person.getSex())){
                temp.add(person);
            }
        }
        System.out.println(temp);
        //new
        List<PersonModel> collect = data
                .stream()
                .filter(person -> "男".equals(person.getSex()))
                .collect(toList());
        System.out.println(collect);
    }

    /**
     * 过滤所有的男性 并且小于20岁
     */
    public static void fiterSexAndAge(){
        List<PersonModel> data = Data.getData();

        //old
        List<PersonModel> temp=new ArrayList<>();
        for (PersonModel person:data) {
            if ("男".equals(person.getSex())&&person.getAge()<20){
                temp.add(person);
            }
        }

        //new 1
        List<PersonModel> collect = data
                .stream()
                .filter(person -> {
                    if ("男".equals(person.getSex())&&person.getAge()<20){
                        return true;
                    }
                    return false;
                })
                .collect(toList());
        //new 2
        List<PersonModel> collect1 = data
                .stream()
                .filter(person -> ("男".equals(person.getSex())&&person.getAge()<20))
                .collect(toList());

    }
}
