package com.zykj.utils;

import okhttp3.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class HttpUtil {


    public static final int TYPE_GET = 0;//get请求
    public static final int TYPE_POST_JSON = 1;//post请求参数为json

    private static  OkHttpClient okHttpClient= new OkHttpClient().newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)//设置超时时间10s
                .readTimeout(10, TimeUnit.SECONDS)//设置读取超时时间10s
                .writeTimeout(10, TimeUnit.SECONDS)//设置写入超时时间10s
                .build();



    /**
     *  okHttp同步请求统一入口
     */
    public static String requestSyn(String Url, String token,int requestType, HashMap<String, Object> paramsMap) throws IOException {
        switch (requestType) {
            case TYPE_GET:

                return requestGetBySyn(Url,token, paramsMap);
            case TYPE_POST_JSON:
                return requestPostBySyn(Url,token, paramsMap);
            default: return null;

        }
    }






    /**
     * okHttp get同步请求
     */

    private static String  requestGetBySyn(String Url,String token, HashMap<String, Object> paramsMap) throws IOException {

        StringBuilder tempParams = new StringBuilder();

        String requestUrl="";

        try {

            //get不带参数
            if(paramsMap == null){
                requestUrl =Url;

             //get带参数
            }else{
                //处理参数
                int pos = 0;
                for (String key : paramsMap.keySet()) {
                    if (pos > 0) {
                        tempParams.append("&");
                    }
                    //对参数进行URLEncoder
                    tempParams.append(String.format("%s=%s", key, URLEncoder.encode(paramsMap.get(key).toString(), "utf-8")));
                    pos++;
                }
                //补全请求地址
                requestUrl = String.format("%s?%s", Url, tempParams.toString());
            }

            //创建一个请求


            Request request = new Request.Builder()
                    .url(requestUrl)
                    .header("Authorization",token)
                    .build();

            //创建一个Call
             Call call = okHttpClient.newCall(request);
            //执行请求
             Response response = call.execute();

            return response.body().string();

        } catch (IOException e) {
            throw new IOException("Inner error " +e);
        }
    }


    /**
     * okHttp post同步请求
     */
    private  static String  requestPostBySyn(String Url, String token, HashMap<String, Object> paramsMap) throws IOException {

        Request request = null;

        try {

            //带参数
            if(paramsMap !=null ){

                String params = JsonUtil.toJson(paramsMap);
                MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody  requestBody = RequestBody.create(JSON, params);
                request = new Request.Builder()
                        .url(Url)
                        .header("Authorization",token)
                        .post(requestBody)
                        .build();
            //不带参数
            }else{
                request = new Request.Builder()
                        .url(Url)
                        .header("Authorization",token)
                        .build();
            }


            //创建一个Call
             Call call = okHttpClient.newCall(request);
            //执行请求
             Response response = call.execute();

            return response.body().string();

        } catch (IOException e) {
            throw new IOException("Inner error " +e);
        }
    }






    /**
     * okHttp post同步提交Form-Data数据请求（上传文件）
     */
    public static  String requestPostBySynWithFormData(String url, String type, String project_id, String token,File file) throws IOException {

        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                //可以根据自己的接口需求在这里添加上传的参数
                .addFormDataPart("type",type)
                .addFormDataPart("project_id",project_id)
                .addFormDataPart("file",file.getName(),RequestBody.create(MediaType.parse("application/octet-stream"), file))
                .build();

        Request request = new Request.Builder()
                .url(url)
                .header("Authorization",token)
                .post(requestBody)
                .build();


        Call call = okHttpClient.newCall(request);
        try {

            Response response = call.execute();
            return response.body().string();

        } catch (IOException e) {
            throw new IOException("Inner error " +e);
        }

    }






    /**
     * okHttp post同步下载
     */

        public static String requestGetBySynDownload(String Url,String modle_id,String downlaodToken, String outputPath, String token) throws IOException {

            String requestUrl=Url+"/"+modle_id+"?token="+downlaodToken;

            try {

                Request request = new Request.Builder()
                        .url(requestUrl)
                        .header("Authorization",token)
                        .get()
                        .build();

                //创建一个Call
                 Call call = okHttpClient.newCall(request);
                //执行请求
                 Response response = call.execute();

                InputStream is = response.body().byteStream();
                int len = 0;
                //设置下载图片存储路径和名称
                File file = new File(outputPath,"modelId_"+modle_id+".zip");
                FileOutputStream fos = new FileOutputStream(file);
                byte[] buf = new byte[1024];
                while((len = is.read(buf))!= -1){
                    fos.write(buf,0,len);
                }
                fos.flush();
                fos.close();
                is.close();

            } catch (IOException e) {
                throw new IOException("Inner error " +e);
            }


            return null;
        }
}