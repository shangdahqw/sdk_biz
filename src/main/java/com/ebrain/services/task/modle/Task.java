package com.ebrain.services.task.modle;


import java.util.List;

/**

{
    "task": {
        "task_id": "588",
        "project_id": "133",
        "dataset_id": "0",
        "type": 5,
        "status": 1,
        "failed_reason": null,
        "failed_error": null,
        "percentage": "0",
        "duration": "0",
        "stages": [],
        "dataset_info": null,
        "preprocess_info": null,
        "train_info": null,
        "predict_info": null,
        "next_task": null
    }
}




 */
public class Task {

    String taskId;
    String projectId;
    String datasetId;
    String type;
    String status;
    String failedReason;
    String failedError;
    String percentage;
    String duration;
    List   stages;
    String datasetInfo;
    String preprocessInfo;
    String trainInfo;
    String predictInfo;
    String nextTask;


    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public String getFailedError() {
        return failedError;
    }

    public void setFailedError(String failedError) {
        this.failedError = failedError;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List getStages() {
        return stages;
    }

    public void setStages(List stages) {
        this.stages = stages;
    }

    public String getDatasetInfo() {
        return datasetInfo;
    }

    public void setDatasetInfo(String datasetInfo) {
        this.datasetInfo = datasetInfo;
    }

    public String getPreprocessInfo() {
        return preprocessInfo;
    }

    public void setPreprocessInfo(String preprocessInfo) {
        this.preprocessInfo = preprocessInfo;
    }

    public String getTrainInfo() {
        return trainInfo;
    }

    public void setTrainInfo(String trainInfo) {
        this.trainInfo = trainInfo;
    }

    public String getPredictInfo() {
        return predictInfo;
    }

    public void setPredictInfo(String predictInfo) {
        this.predictInfo = predictInfo;
    }

    public String getNextTask() {
        return nextTask;
    }

    public void setNextTask(String nextTask) {
        this.nextTask = nextTask;
    }


    @Override
    public String toString() {
        return "Task{" +
                "taskId='" + taskId + '\'' +
                ", projectId='" + projectId + '\'' +
                ", datasetId='" + datasetId + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", failedReason='" + failedReason + '\'' +
                ", failedError='" + failedError + '\'' +
                ", percentage='" + percentage + '\'' +
                ", duration='" + duration + '\'' +
                ", stages=" + stages +
                ", datasetInfo='" + datasetInfo + '\'' +
                ", preprocessInfo='" + preprocessInfo + '\'' +
                ", trainInfo='" + trainInfo + '\'' +
                ", predictInfo='" + predictInfo + '\'' +
                ", nextTask='" + nextTask + '\'' +
                '}';
    }

}
