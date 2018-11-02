package com.zykj.services.modles;

import com.zykj.modle.ResponseData;
import com.zykj.utils.HttpUtil;

import java.io.IOException;

public class Modleclient {


    private  static  String DOWNLOAD_URL = "http://s0.ebrain.ai:58095/api/v1/models/download";

    /**
     * 下载
     * @param modle_id
     * @param downloadToken
     * @param outputPath
     * @param token
     * @return
     */
    public ResponseData<String> download(String modle_id,String downloadToken, String outputPath,String token){


        String result="";
        try {
            result = HttpUtil.requestGetBySynDownload(DOWNLOAD_URL,modle_id,downloadToken,outputPath,token);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return  null;


    }


}
