package com.zykj.services.onlinepredict;

import com.zykj.modle.ResponseData;
import com.zykj.services.onlinepredict.modle.Onlinepredict;
import com.zykj.utils.HttpUtil;

import java.io.IOException;
import java.util.HashMap;

public class Onlinepredictclient {


    private static  final String  PUBLISH_URL="http://s0.ebrain.ai:58095/api/v1/onlinepredict/publish";


    /**
     * 发布
     * @param lazy
     * @param model_id
     * @param token
     * @return
     */
    public ResponseData<Onlinepredict> publish(boolean lazy, long model_id, String token){

        HashMap<String ,Object > paramap =new HashMap<String,Object>();
        paramap.put("lazy",lazy);
        paramap.put("model_id",model_id);

        String responsebody = "";

        try {
            responsebody = HttpUtil.requestSyn(PUBLISH_URL,token,HttpUtil.TYPE_POST_JSON,paramap);

            System.out.println(responsebody);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


        return null;

    }
}
