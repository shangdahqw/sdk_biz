package com.zykj.services.task.modle;


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

    String  task_id;
    String project_id;
    String dataset_id;
    String type;
    String status;
    String failed_reason;
    String failed_error;
    String percentage;
    String  duration;
    List stages;
    String dataset_info;
    String preprocess_info;
    String train_info;
    String predict_info;
    String next_task;


    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getDataset_id() {
        return dataset_id;
    }

    public void setDataset_id(String dataset_id) {
        this.dataset_id = dataset_id;
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

    public String getFailed_reason() {
        return failed_reason;
    }

    public void setFailed_reason(String failed_reason) {
        this.failed_reason = failed_reason;
    }

    public String getFailed_error() {
        return failed_error;
    }

    public void setFailed_error(String failed_error) {
        this.failed_error = failed_error;
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

    public String getDataset_info() {
        return dataset_info;
    }

    public void setDataset_info(String dataset_info) {
        this.dataset_info = dataset_info;
    }

    public String getPreprocess_info() {
        return preprocess_info;
    }

    public void setPreprocess_info(String preprocess_info) {
        this.preprocess_info = preprocess_info;
    }

    public String getTrain_info() {
        return train_info;
    }

    public void setTrain_info(String train_info) {
        this.train_info = train_info;
    }

    public String getPredict_info() {
        return predict_info;
    }

    public void setPredict_info(String predict_info) {
        this.predict_info = predict_info;
    }

    public String getNext_task() {
        return next_task;
    }

    public void setNext_task(String next_task) {
        this.next_task = next_task;
    }


    @Override
    public String toString() {
        return "Task{" +
                "task_id='" + task_id + '\'' +
                ", project_id='" + project_id + '\'' +
                ", dataset_id='" + dataset_id + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", failed_reason='" + failed_reason + '\'' +
                ", failed_error='" + failed_error + '\'' +
                ", percentage='" + percentage + '\'' +
                ", duration='" + duration + '\'' +
                ", stages=" + stages +
                ", dataset_info='" + dataset_info + '\'' +
                ", preprocess_info='" + preprocess_info + '\'' +
                ", train_info='" + train_info + '\'' +
                ", predict_info='" + predict_info + '\'' +
                ", next_task='" + next_task + '\'' +
                '}';
    }
}
