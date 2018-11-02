package com.zykj.services.account;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountClientTest {

    @Test
    public void getToken() {

        AccountClient accountClient =new AccountClient();
        accountClient.getToken("Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NDM0MDYxNjYsInVzZXJfaWQiOjExLCJuaWNrbmFtZSI6Imh1YW5ncWlhbmd3ZW4ifQ.pwiEIfCkei4wl7Nnp3BR3DhW4QAJXEOJpp8BfUopn84");

    }
}