package com.zykj.services.onlinepredict.modle;

public class Onlinepredict {

    /**

     {
     "model_id": "141",
     "project_id": null,
     "task_id": null,
     "feature_list_id": null,
     "feature_list_name": null,
     "algorithm": null,
     "algorithm_name": null,
     "algorithm_desc": null,
     "created_at": null,
     "duration": null,
     "percentage": null,
     "logloss": null,
     "status": null,
     "valid_status": null,
     "cv_status": null,
     "test_status": null,
     "indicator": null,
     "valid_indicator_value": null,
     "cv_indicator_value": null,
     "test_indicator_value": null,
     "model_status": 1
     }


     */


     String model_id;
     String project_id;
     String task_id;
     String feature_list_id;
     String feature_list_name;
     String algorithm;
     String algorithm_name;
     String algorithm_desc;
     String logloss;
     String status;
     String valid_status;
     String cv_status;
     String test_status;
     String indicator;
     String valid_indicator_value;
     String cv_indicator_value;
     String test_indicator_value;
     String model_status;
     String created_at;
     String duration;
     String percentage;

 public String getModel_id() {
  return model_id;
 }

 public void setModel_id(String model_id) {
  this.model_id = model_id;
 }

 public String getProject_id() {
  return project_id;
 }

 public void setProject_id(String project_id) {
  this.project_id = project_id;
 }

 public String getTask_id() {
  return task_id;
 }

 public void setTask_id(String task_id) {
  this.task_id = task_id;
 }

 public String getFeature_list_id() {
  return feature_list_id;
 }

 public void setFeature_list_id(String feature_list_id) {
  this.feature_list_id = feature_list_id;
 }

 public String getFeature_list_name() {
  return feature_list_name;
 }

 public void setFeature_list_name(String feature_list_name) {
  this.feature_list_name = feature_list_name;
 }

 public String getAlgorithm() {
  return algorithm;
 }

 public void setAlgorithm(String algorithm) {
  this.algorithm = algorithm;
 }

 public String getAlgorithm_name() {
  return algorithm_name;
 }

 public void setAlgorithm_name(String algorithm_name) {
  this.algorithm_name = algorithm_name;
 }

 public String getAlgorithm_desc() {
  return algorithm_desc;
 }

 public void setAlgorithm_desc(String algorithm_desc) {
  this.algorithm_desc = algorithm_desc;
 }

 public String getCreated_at() {
  return created_at;
 }

 public void setCreated_at(String created_at) {
  this.created_at = created_at;
 }

 public String getDuration() {
  return duration;
 }

 public void setDuration(String duration) {
  this.duration = duration;
 }

 public String getPercentage() {
  return percentage;
 }

 public void setPercentage(String percentage) {
  this.percentage = percentage;
 }

 public String getLogloss() {
  return logloss;
 }

 public void setLogloss(String logloss) {
  this.logloss = logloss;
 }

 public String getStatus() {
  return status;
 }

 public void setStatus(String status) {
  this.status = status;
 }

 public String getValid_status() {
  return valid_status;
 }

 public void setValid_status(String valid_status) {
  this.valid_status = valid_status;
 }

 public String getCv_status() {
  return cv_status;
 }

 public void setCv_status(String cv_status) {
  this.cv_status = cv_status;
 }

 public String getTest_status() {
  return test_status;
 }

 public void setTest_status(String test_status) {
  this.test_status = test_status;
 }

 public String getIndicator() {
  return indicator;
 }

 public void setIndicator(String indicator) {
  this.indicator = indicator;
 }

 public String getValid_indicator_value() {
  return valid_indicator_value;
 }

 public void setValid_indicator_value(String valid_indicator_value) {
  this.valid_indicator_value = valid_indicator_value;
 }

 public String getCv_indicator_value() {
  return cv_indicator_value;
 }

 public void setCv_indicator_value(String cv_indicator_value) {
  this.cv_indicator_value = cv_indicator_value;
 }

 public String getTest_indicator_value() {
  return test_indicator_value;
 }

 public void setTest_indicator_value(String test_indicator_value) {
  this.test_indicator_value = test_indicator_value;
 }

 public String getModel_status() {
  return model_status;
 }

 public void setModel_status(String model_status) {
  this.model_status = model_status;
 }

 @Override
 public String toString() {
  return "Onlinepredict{" +
          "model_id='" + model_id + '\'' +
          ", project_id='" + project_id + '\'' +
          ", task_id='" + task_id + '\'' +
          ", feature_list_id='" + feature_list_id + '\'' +
          ", feature_list_name='" + feature_list_name + '\'' +
          ", algorithm='" + algorithm + '\'' +
          ", algorithm_name='" + algorithm_name + '\'' +
          ", algorithm_desc='" + algorithm_desc + '\'' +
          ", created_at='" + created_at + '\'' +
          ", duration='" + duration + '\'' +
          ", percentage='" + percentage + '\'' +
          ", logloss='" + logloss + '\'' +
          ", status='" + status + '\'' +
          ", valid_status='" + valid_status + '\'' +
          ", cv_status='" + cv_status + '\'' +
          ", test_status='" + test_status + '\'' +
          ", indicator='" + indicator + '\'' +
          ", valid_indicator_value='" + valid_indicator_value + '\'' +
          ", cv_indicator_value='" + cv_indicator_value + '\'' +
          ", test_indicator_value='" + test_indicator_value + '\'' +
          ", model_status='" + model_status + '\'' +
          '}';
 }


}
