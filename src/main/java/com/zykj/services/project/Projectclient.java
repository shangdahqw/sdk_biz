package com.zykj.services.project;

import com.zykj.modle.ResponseData;
import com.zykj.services.project.modle.Project;
import com.zykj.utils.HttpUtil;

import java.io.IOException;
import java.util.HashMap;

public class Projectclient {



    private static final String  CREATE_URL="http://s0.ebrain.ai:58095/api/v1/projects/create";


    /**
     * 创建工程
     * @param name
     * @param desc
     * @param token
     * @return
     */
    public ResponseData<Project> createProject(String name, String desc, String token){

        HashMap<String ,Object > paramap =new HashMap<String,Object>();

        paramap.put("name",name);
        paramap.put("desc",desc);


        String responsebody = "";

        try {
             responsebody = HttpUtil.requestSyn(CREATE_URL,token,HttpUtil.TYPE_POST_JSON,paramap);

             System.out.println(responsebody);
        } catch (IOException e) {

            e.printStackTrace();
            return null;
        }


        return null;

    }

}


