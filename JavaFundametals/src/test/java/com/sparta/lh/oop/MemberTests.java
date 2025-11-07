package com.sparta.lh.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class MemberTests {

    @Test
    @DisplayName("getMemberDays returns the correct number of days since joining")
    public void getMemberDaysTest(){
        var today = LocalDate.now();
        var joinDate = today.minusDays(45);
        Member sut = new Member("Nish", "Mandal", joinDate.getYear(), joinDate.getMonth().getValue(), joinDate.getDayOfMonth());
        var result = sut.getMemberDays();
        Assertions.assertEquals(45, result);
    }

    // Write tests for getFirstName, getFullName, getLastName - cover edge cases.

    @Test
    @DisplayName("getFirstName returns the correct first name")
    public void getFirstNameTest(){
        Member sut = new Member("Jane", "Doe");
        Assertions.assertEquals("Jane", sut.getFirstName());
    }

    @Test
    @DisplayName("getFullName returns the correct full name")
    public void getFullNameTest(){
        Member sut = new Member("Jane", "Doe");
        Assertions.assertEquals("Jane Doe", sut.getFullName());
    }

    @Test
    @DisplayName("getFullName returns the correct last name")
    public void getLastNameTest(){
        Member sut = new Member("Jane", "Doe");
        Assertions.assertEquals("Doe", sut.getLastName());
    }

    @Test
    @DisplayName("getFirstName returns the correct first name even if its exclamation marks")
    public void getFirstNameTestEdge(){
        Member sut = new Member("!!!!!!!", "!!!!!!!!");
        Assertions.assertEquals("!!!!!!!", sut.getFirstName());
    }

    @Test
    @DisplayName("getMemberDays returns the correct number of days even if negative")
    public void getJoinDateFutureTest(){
        var today = LocalDate.now();
        var joinDate = today.plusDays(45);
        Member sut = new Member("Jane", "Doe", joinDate.getYear(), joinDate.getMonth().getValue(), joinDate.getDayOfMonth());
        var result = sut.getMemberDays();
        Assertions.assertEquals(-45, result);
    }

    @Test
    @DisplayName("getMemberDays returns the correct number of days even if 0")
    public void getJoinDateTodayTest(){
        var joinDate = LocalDate.now();
        Member sut = new Member("Jane", "Doe", joinDate.getYear(), joinDate.getMonth().getValue(), joinDate.getDayOfMonth());
        var result = sut.getMemberDays();
        Assertions.assertEquals(0, result);
    }

}
