package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConverNumTest {
    @Test
    public void shuold_return_1_when_number_is_1() {
        //given
        int number = 1;
        ConverNum converNum = new ConverNum();

        //when
        String actual = converNum.convertNum(number);

        //then
        assertThat(actual, is("1"));
    }
    @Test
    public void shuold_return_2_when_number_is_2() {
        //given
        int number = 2;
        ConverNum converNum = new ConverNum();

        //when
        String actual = converNum.convertNum(number);

        //then
        assertThat(actual, is("2"));
    }
    @Test
    public void shuold_return_Fizz_when_number_is_3() {
        //given
        int number = 3;
        ConverNum converNum = new ConverNum();

        //when
        String actual = converNum.convertNum(number);

        //then
        assertThat(actual, is("Fizz"));
    }
    @Test
    public void shuold_return_Fizz_when_number_is_6() {
        //given
        int number = 6;
        ConverNum converNum = new ConverNum();

        //when
        String actual = converNum.convertNum(number);

        //then
        assertThat(actual, is("Fizz"));
    }
    @Test
    public void shuold_return_Buzz_when_number_is_5() {
        //given
        int number = 5;
        ConverNum converNum = new ConverNum();

        //when
        String actual = converNum.convertNum(number);

        //then
        assertThat(actual, is("Buzz"));
    }
    @Test
    public void shuold_return_Buzz_when_number_is_10() {
        //given
        int number = 10;
        ConverNum converNum = new ConverNum();

        //when
        String actual = converNum.convertNum(number);

        //then
        assertThat(actual, is("Buzz"));
    }
    @Test
    public void shuold_return_Buzz_when_number_is_7() {
        //given
        int number = 7;
        ConverNum converNum = new ConverNum();

        //when
        String actual = converNum.convertNum(number);

        //then
        assertThat(actual, is("Whizz"));
    }
    @Test
    public void shuold_return_Buzz_when_number_is_14() {
        //given
        int number = 14;
        ConverNum converNum = new ConverNum();

        //when
        String actual = converNum.convertNum(number);

        //then
        assertThat(actual, is("Whizz"));
    }
    @Test
    public void shuold_return_Buzz_when_number_is_15() {
        //given
        int number = 15;
        ConverNum converNum = new ConverNum();

        //when
        String actual = converNum.convertNum(number);

        //then
        assertThat(actual, is("FizzBuzz"));
    }
    @Test
    public void shuold_return_Buzz_when_number_is_21() {
        //given
        int number = 21;
        ConverNum converNum = new ConverNum();

        //when
        String actual = converNum.convertNum(number);

        //then
        assertThat(actual, is("FizzWhizz"));
    }
    @Test
    public void shuold_return_Buzz_when_number_is_35() {
        //given
        int number = 35;
        ConverNum converNum = new ConverNum();

        //when
        String actual = converNum.convertNum(number);

        //then
        assertThat(actual, is("BuzzWhizz"));
    }



}
