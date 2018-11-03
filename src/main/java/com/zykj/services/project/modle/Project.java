package com.zykj.services.project.modle;


/**

 {
 "project": {
 "project_id": "133",
 "user_id": "11",
 "name": "test20181030_4",
 "desc": null,
 "created_at": "1540871689",
 "train_dataset_name": null,
 "train_dataset_size": null
  }
 }


 */
public class Project {



    String  projectId;
    String userId;
    String name;
    String desc;
    String createdAt;
    String trainDatasetName;
    String trainDatasetSize;


    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getTrainDatasetName() {
        return trainDatasetName;
    }

    public void setTrainDatasetName(String trainDatasetName) {
        this.trainDatasetName = trainDatasetName;
    }

    public String getTrainDatasetSize() {
        return trainDatasetSize;
    }

    public void setTrainDatasetSize(String trainDatasetSize) {
        this.trainDatasetSize = trainDatasetSize;
    }


    @Override
    public String toString() {
        return "Project{" +
                "projectId='" + projectId + '\'' +
                ", userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", trainDatasetName='" + trainDatasetName + '\'' +
                ", trainDatasetSize='" + trainDatasetSize + '\'' +
                '}';
    }

}
