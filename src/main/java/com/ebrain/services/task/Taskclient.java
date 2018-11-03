package com.ebrain.services.task;

import com.ebrain.modle.ResponseData;
import com.ebrain.services.task.modle.Task;
import com.ebrain.utils.HttpUtil;

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
     * @param projectId
     * @param token
     * @param file
     * @return
     */

    public ResponseData<Task> createDatasetFromFile(String type, String projectId, String token,File file){

        String responsebody = "";

        try {
            responsebody = HttpUtil.requestPostBySynWithFormData(UPLOAD_URL,type,projectId,token,file);

            System.out.println(responsebody);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


        return null;

    }


    /**
     * 画像
     * @param projectId
     * @param token
     * @return
     */
    public ResponseData<Task> protrait(String projectId, String token){

        HashMap<String ,Object > paramap =new HashMap<String,Object>();
        paramap.put("projectId",projectId);

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
     * @param featureListId
     * @param projectId
     * @param targetFeatureId
     * @param token
     * @return
     */
    public ResponseData<Task> aotuTrain(String featureListId,String projectId,
                                         String targetFeatureId,String token ){

//        String requestjson ="{\"featureListId\": "+featureListId+
//                ", \"projectId\": "+projectId+
//                ", \"targetFeatureId\": " +targetFeatureId+
//                ",\"config\":{\"split_method\":1,\"cross_valid_fold\":2,\"test_ratio\":20}}";

        HashMap<String ,Object > paramap =new HashMap<String,Object>();

        HashMap<String ,Integer > paramap2 =new HashMap<String,Integer>();

        paramap2.put("split_method",1);
        paramap2.put("cross_valid_fold",2);
        paramap2.put("test_ratio",3);

        paramap.put("featureListId",featureListId);
        paramap.put("projectId",projectId);
        paramap.put("targetFeatureId",targetFeatureId);
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

