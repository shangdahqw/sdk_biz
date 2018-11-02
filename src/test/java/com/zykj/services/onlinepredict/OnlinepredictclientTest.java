package com.zykj.services.onlinepredict;

import org.junit.Test;


public class OnlinepredictclientTest {

    @Test
    public void publish() {


        Onlinepredictclient onlinepredictclient = new Onlinepredictclient();
        onlinepredictclient.publish(false,174,"Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NDM0MDYxNjYsInVzZXJfaWQiOjExLCJuaWNrbmFtZSI6Imh1YW5ncWlhbmd3ZW4ifQ.pwiEIfCkei4wl7Nnp3BR3DhW4QAJXEOJpp8BfUopn84");

    }
}