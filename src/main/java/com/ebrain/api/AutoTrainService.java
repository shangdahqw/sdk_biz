package com.ebrain.api;

import com.ebrain.api.param.AutoTrainParam;

public interface AutoTrainService {

    /**
     * 新增训练任务
     *
     * @param param 参数
     * @return 返回唯一的训练任务ID
     */
    long addAutoTrain(AutoTrainParam param);

    /**
     * 查询训练任务的状态.true 训练完成
     *
     * @param id 新增接口的训练任务ID
     * @return
     */
    boolean queryAutoTrain(long id);

    /**
     * 删除训练任务
     *
     * @param id 新增接口的训练任务ID
     * @return
     */
    boolean delAutoTrain(long id);

    /**
     * 下载模型
     *
     * @param path path写入到本地的目录,用于预估的输入
     * @return
     */
    boolean downloadTrain(String path);

}
