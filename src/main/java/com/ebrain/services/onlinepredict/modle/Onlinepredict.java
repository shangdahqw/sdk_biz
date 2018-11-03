package com.ebrain.services.onlinepredict.modle;

import com.alibaba.fastjson.annotation.JSONField;

public class Onlinepredict {

  /**
   * { "model_id": "141", "project_id": null, "task_id": null, "feature_list_id": null,
   * "feature_list_name": null, "algorithm": null, "algorithm_name": null, "algorithm_desc": null,
   * "created_at": null, "duration": null, "percentage": null, "logloss": null, "status": null,
   * "valid_status": null, "cv_status": null, "test_status": null, "indicator": null,
   * "valid_indicator_value": null, "cv_indicator_value": null, "test_indicator_value": null,
   * "model_status": 1 }
   */
  @JSONField(name = "model_id")
  private long modelId;

  @JSONField(name = "project_id")
  private long projectId;

  @JSONField(name = "task_id")
  private long taskId;

  @JSONField(name = "feature_list_id")
  private String featureListId;

  @JSONField(name = "feature_list_name")
  private String featureListName;

  @JSONField(name = "algorithm")
  private String algorithm;

  @JSONField(name = "algorithm_name")
  private String algorithmName;

  @JSONField(name = "algorithm_desc")
  private String algorithmDesc;

  @JSONField(name = "logloss")
  private String logloss;

  @JSONField(name = "status")
  private String status;

  @JSONField(name = "valid_status")
  private String validStatus;

  @JSONField(name = "cv_status")
  private String cvStatus;

  @JSONField(name = "test_status")
  private String testStatus;

  @JSONField(name = "indicator")
  private String indicator;

  @JSONField(name = "valid_indicator_value")
  private String validIndicatorValue;

  @JSONField(name = "cv_indicator_value")
  private String cvIndicatorValue;

  @JSONField(name = "test_indicator_value")
  private String testIndicatorValue;

  @JSONField(name = "model_status")
  private String modelStatus;

  @JSONField(name = "created_at")
  private String createdAt;

  @JSONField(name = "duration")
  private String duration;

  @JSONField(name = "percentage")
  private String percentage;

  @Override
  public String toString() {
    return "Onlinepredict{"
        + "modelId="
        + modelId
        + ", projectId="
        + projectId
        + ", taskId="
        + taskId
        + ", featureListId='"
        + featureListId
        + '\''
        + ", featureListName='"
        + featureListName
        + '\''
        + ", algorithm='"
        + algorithm
        + '\''
        + ", algorithmName='"
        + algorithmName
        + '\''
        + ", algorithmDesc='"
        + algorithmDesc
        + '\''
        + ", logloss='"
        + logloss
        + '\''
        + ", status='"
        + status
        + '\''
        + ", validStatus='"
        + validStatus
        + '\''
        + ", cvStatus='"
        + cvStatus
        + '\''
        + ", testStatus='"
        + testStatus
        + '\''
        + ", indicator='"
        + indicator
        + '\''
        + ", validIndicatorValue='"
        + validIndicatorValue
        + '\''
        + ", cvIndicatorValue='"
        + cvIndicatorValue
        + '\''
        + ", testIndicatorValue='"
        + testIndicatorValue
        + '\''
        + ", modelStatus='"
        + modelStatus
        + '\''
        + ", createdAt='"
        + createdAt
        + '\''
        + ", duration='"
        + duration
        + '\''
        + ", percentage='"
        + percentage
        + '\''
        + '}';
  }
}
