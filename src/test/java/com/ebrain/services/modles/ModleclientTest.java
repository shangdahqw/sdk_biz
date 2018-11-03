package com.ebrain.services.modles;

import org.junit.Test;

public class ModleclientTest {

    @Test
    public void download() {
        Modleclient modleclient =new Modleclient();
        modleclient.download("174","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NDEwNzgxMTAsInVzZXJfaWQiOjExLCJuaWNrbmFtZSI6IiJ9.ywPycpf6f2VSqbm-82e-V-R1EPkNxmqHzE6Wx0z8Am4","/Users/huangqiangwen/Desktop",
                "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NDM0MDYxNjYsInVzZXJfaWQiOjExLCJuaWNrbmFtZSI6Imh1YW5ncWlhbmd3ZW4ifQ.pwiEIfCkei4wl7Nnp3BR3DhW4QAJXEOJpp8BfUopn84");


    }
}