package com.ebrain.services.account;

import com.ebrain.modle.ResponseData;
import com.ebrain.utils.HttpUtil;

import java.io.IOException;

public class AccountClient {



    private static  final String  TOKEN_URL="http://s0.ebrain.ai:58095/api/v1/account/token";


    /**
     * 获取下载token
     * @param token
     * @return
     */
    public  ResponseData<String> getToken(String token){

        String responsebody = "";

        try {
            responsebody= HttpUtil.requestSyn(TOKEN_URL,token,HttpUtil.TYPE_GET,null);

            System.out.println(responsebody);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return  null;
    }




}
