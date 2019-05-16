package com.dmartynov;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserValidatorTest {

    @Test
    public void checkEmail() {
        assertFalse(UserValidator.checkEmail("adsasda"));
        assertFalse(UserValidator.checkEmail("asdas da@.com"));
        assertFalse(UserValidator.checkEmail("asdasdasdasdasd@.com asdasdasdasd"));
        assertFalse(UserValidator.checkEmail(null));
        assertTrue(UserValidator.checkEmail("asf@.com"));
        assertTrue(UserValidator.checkEmail("pokemon@gmail.com"));
    }

    @Test
    public void checkPassword() {
        assertFalse(UserValidator.checkPassword("E@bd1@>"));
        assertFalse(UserValidator.checkPassword("nbmdqdwqihqwd1@wqdkwqbdigiwqidgwigdigwdigqiw"));
        assertFalse(UserValidator.checkPassword("nbvwd1@>"));
        assertFalse(UserValidator.checkPassword("ghgdqdwqASDi wd1@"));
        assertFalse(UserValidator.checkPassword("bvndqdw3123fdgfdasfdasf qihqwd(?SA"));
        assertFalse(UserValidator.checkPassword("wdqkhjfkehqwd1"));
        assertFalse(UserValidator.checkPassword("jhghqdSWqывwd1@>"));
        assertTrue(UserValidator.checkPassword("asdefySd12(?}"));
    }
}