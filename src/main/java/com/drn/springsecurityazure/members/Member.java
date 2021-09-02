package com.drn.springsecurityazure.members;

import java.util.List;

public interface Member {

    public List<String> getAllMembers();

    public String getRandomQuote();

    public String getRandomMember();

}
