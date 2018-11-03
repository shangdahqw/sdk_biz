package com.ebrain.services.message;

import com.ebrain.services.message.modle.Message;

public class Messageclient {

  public static final String STATUS_A = "";
  public static final String STATUS_B = "";
  public static final String STATUS_C = "";
  public static final String STATUS_D = "";
  public static final String STATUS_FINISH = "";

  /**
   * 工作流，处理后续任务
   *
   * @param message
   */
  public void worklow(Message message) {

    while (message.getStatus() != STATUS_FINISH) {

      // todo 查询接口，并更新parameter

      if (message.getStatus() == STATUS_A) {

        // todo 调用相应client接口，并更新参数
      } else if (message.getStatus() == STATUS_B) {
        // todo 调用相应client接口，并更新参数

      } else if (message.getStatus() == STATUS_C) {
        // todo 调用相应client接口，并更新参数

      }
    }
  }
}
