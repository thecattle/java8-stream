package com.sunp;

import com.sunp.data.Data;
import com.sunp.data.PersonModel;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MapTest {
    public static void main(String[] args) {
        getUserNameList();
    }


    /**
     * 取出所有的用户名字
     */
    public static void getUserNameList(){
        List<PersonModel> data = Data.getData();

        //old
        List<String> list=new ArrayList<>();
        for (PersonModel persion:data) {
            list.add(persion.getName());
        }
        System.out.println(list);

        //new 1
        List<String> collect = data.stream().map(person -> person.getName()).collect(toList());
        System.out.println(collect);

        //new 2
        List<String> collect1 = data.stream().map(PersonModel::getName).collect(toList());
        System.out.println(collect1);

        //new 3
        List<String> collect2 = data.stream().map(person -> {
            System.out.println(person.getName());
            return person.getName();
        }).collect(toList());
    }

}
