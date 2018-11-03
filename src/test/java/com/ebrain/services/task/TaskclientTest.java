package com.ebrain.services.task;

import org.junit.Test;


import java.io.File;

public class TaskclientTest {

    @Test
    public void create_dataset_from_file() {


        Taskclient taskclient = new Taskclient();
        taskclient.create_dataset_from_file("1","192","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NDM0MDYxNjYsInVzZXJfaWQiOjExLCJuaWNrbmFtZSI6Imh1YW5ncWlhbmd3ZW4ifQ.pwiEIfCkei4wl7Nnp3BR3DhW4QAJXEOJpp8BfUopn84",
                new File("/Users/huangqiangwen/Desktop/train.csv"));
    }

    @Test
    public void protrait() {

        Taskclient taskclient = new Taskclient();
        taskclient.protrait("164","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NDM0MDYxNjYsInVzZXJfaWQiOjExLCJuaWNrbmFtZSI6Imh1YW5ncWlhbmd3ZW4ifQ.pwiEIfCkei4wl7Nnp3BR3DhW4QAJXEOJpp8BfUopn84");


    }

    @Test
    public void aotu_train() {
        Taskclient taskclient = new Taskclient();

        taskclient.aotu_train("-1","147","23334","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NDM0MDYxNjYsInVzZXJfaWQiOjExLCJuaWNrbmFtZSI6Imh1YW5ncWlhbmd3ZW4ifQ.pwiEIfCkei4wl7Nnp3BR3DhW4QAJXEOJpp8BfUopn84");




    }
}