package com.bridgelabz.Day20;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class TestCase extends UserRegistration{

    @Test
    public void NameTest(){
        Assert.assertEquals(true, Name("Shubham") );
    }

    @Test
    public void LastNameTest(){
        Assert.assertEquals(true, Last("Agrawal") );

    }

    @Test
    public void EmailTest(){
        Assert.assertEquals(true, Email("shubhamag937@gmail.com") );
    }
}