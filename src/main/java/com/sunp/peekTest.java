package com.sunp;

import com.sunp.data.Data;
import com.sunp.data.PersonModel;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class peekTest {
    public static void main(String[] args) {
        peekTest();
    }

    private static void peekTest() {
        List<PersonModel> data = Data.getData();

        //peek打印出遍历的每个per
        data.stream().map(per->per.getName()).peek(p->{
            System.out.println(p);
        }).collect(toList());
    }
}
