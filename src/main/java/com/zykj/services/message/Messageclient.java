package com.zykj.services.message;

import com.zykj.services.message.modle.Message;
import java.util.ArrayList;

public class Messageclient {

    public static final String STATUS_A ="";
    public static final String STATUS_B ="";
    public static final String STATUS_C ="";
    public static final String STATUS_D ="";
    public static final String STATUS_FINISH ="";


    /**
     * 工作流，处理后续任务
     * @param messageList
     */


    public void worklow(ArrayList<Message> messageList){

        while(messageList.size()>0){

            for(Message message : messageList){

                //todo 查询接口，并更新parameter


                if(message.getStatus() == STATUS_A){

                    //todo 调用相应client接口，并更新参数
                }else if(message.getStatus() == STATUS_B){
                    //todo 调用相应client接口，并更新参数

                }else if(message.getStatus() == STATUS_C){
                    //todo 调用相应client接口，并更新参数


                }else if(message.getStatus() == STATUS_FINISH){

                    messageList.remove(message);

                }
            }
        }

    }

}
