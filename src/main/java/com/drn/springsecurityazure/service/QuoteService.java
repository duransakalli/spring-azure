package com.drn.springsecurityazure.service;

import com.drn.springsecurityazure.members.Member;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuoteService implements Member {

    private static String quotes[] = { "'If people do not believe that mathematics is simple, it is only because they do not realize how complicated life is.' -- John Louis von Neumann ",
            "'Computer science is no more about computers than astronomy is about telescopes' --  Edsger Dijkstra ",
            "'To understand recursion you must first understand recursion..' -- Unknown",
            "'You look at things that are and ask, why? I dream of things that never were and ask, why not?' -- Unknown",
            "'Mathematics is the key and door to the sciences.' -- Galileo Galilei",
            "'Not everyone will understand your journey. Thats fine. Its not their journey to make sense of. Its yours.' -- Unknown" };

    public List<String> getAllMembers() {
            return Arrays.asList(quotes);
    }

    public String getRandomMember() {
        List<String> listOfMembers = new ArrayList<>();
        for(String s : quotes) {
            String[] mem = s.split("\\--");
            if(!mem[1].equals(" Unknown")) {
                listOfMembers.add(mem[1]);
            }
        }
        int index = getRandom(listOfMembers.size());
        return listOfMembers.get(index);
    }

    private int getRandom(int length) {
        Random random = new Random();
        int num = random.nextInt(length);
        return num;
    }

}
