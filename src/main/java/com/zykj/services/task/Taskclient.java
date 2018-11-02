package com.zykj.services.task;

import com.zykj.modle.ResponseData;
import com.zykj.services.task.modle.Task;
import com.zykj.utils.HttpUtil;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Taskclient {



    //上传文件url
    private static  final String  UPLOAD_URL="http://s0.ebrain.ai:58095/api/v1/tasks/create_dataset_from_file";

    //上传画像url
    private static  final String  PORTRAIT_URL="http://s0.ebrain.ai:58095/api/v1/tasks/portrait";

    //自动训练url
    private static  final String AUTO_TRAIN_URL = "http://s0.ebrain.ai:58095/api/v1/tasks/auto_train";


    /**
     * 上传文件
     * @param type
     * @param project_id
     * @param token
     * @param file
     * @return
     */

    public ResponseData<Task> create_dataset_from_file(String type, String project_id, String token,File file){

        String responsebody = "";

        try {
            responsebody = HttpUtil.requestPostBySynWithFormData(UPLOAD_URL,type,project_id,token,file);

            System.out.println(responsebody);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


        return null;

    }


    /**
     * 画像
     * @param project_id
     * @param token
     * @return
     */
    public ResponseData<Task> protrait(String project_id, String token){

        HashMap<String ,Object > paramap =new HashMap<String,Object>();
        paramap.put("project_id",project_id);

        String responsebody = "";

        try {
            responsebody = HttpUtil.requestSyn(PORTRAIT_URL,token,HttpUtil.TYPE_POST_JSON,paramap);

            System.out.println(responsebody);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


        return null;

    }

    /**
     * 自动训练
     * @param feature_list_id
     * @param project_id
     * @param target_feature_id
     * @param token
     * @return
     */
    public ResponseData<Task> aotu_train(String feature_list_id,String project_id,
                                         String target_feature_id,String token ){

//        String requestjson ="{\"feature_list_id\": "+feature_list_id+
//                ", \"project_id\": "+project_id+
//                ", \"target_feature_id\": " +target_feature_id+
//                ",\"config\":{\"split_method\":1,\"cross_valid_fold\":2,\"test_ratio\":20}}";

        HashMap<String ,Object > paramap =new HashMap<String,Object>();

        HashMap<String ,Integer > paramap2 =new HashMap<String,Integer>();

        paramap2.put("split_method",1);
        paramap2.put("cross_valid_fold",2);
        paramap2.put("test_ratio",3);

        paramap.put("feature_list_id",feature_list_id);
        paramap.put("project_id",project_id);
        paramap.put("target_feature_id",target_feature_id);
        paramap.put("config",paramap2);

        String responsebody = "";

        try {
            responsebody = HttpUtil.requestSyn(AUTO_TRAIN_URL,token,HttpUtil.TYPE_POST_JSON,paramap);

            System.out.println(responsebody);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


        return null;


    }







}

