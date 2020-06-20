package com.vincent.appstart;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    ArrayList<String> list=new ArrayList<>();
    @Test
    public void addition_isCorrect() {
//        assertEquals(4, 2 + 2);

        list.add(0,"aaa");
        list.add(1,"bbb");
        System.out.println(list.toString());
    }


}