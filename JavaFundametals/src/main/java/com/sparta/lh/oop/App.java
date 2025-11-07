package com.sparta.lh.oop;

import com.sparta.lh.oop.zoo.Animal;

import java.util.ArrayList;
import java.util.List;

public class App {
    static void main(String[] args) {
        Member m1 = new Member("Jane", "Doe", 1999,5,15);
        Member m2 = new BaseballMember("John", "Doe", 2001,4,22,"batter");

        ArrayList<Member> members = new ArrayList<>(List.of(m1,m2));
        for (Member member : members) {
            System.out.println(member.move());
        }


    }
}
