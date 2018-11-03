package com.ebrain.services.project;

import org.junit.Test;

public class ProjectclientTest {

    @Test
    public void createProject() {


        Projectclient projectclient = new Projectclient();

        projectclient.createProject("20181102_2","test","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NDM0MDYxNjYsInVzZXJfaWQiOjExLCJuaWNrbmFtZSI6Imh1YW5ncWlhbmd3ZW4ifQ.pwiEIfCkei4wl7Nnp3BR3DhW4QAJXEOJpp8BfUopn84");

    }
}