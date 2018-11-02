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



    String  project_id;
    String user_id;
    String name;
    String desc;
    String created_at;
    String train_dataset_name;
    String train_dataset_size;

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
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

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getTrain_dataset_name() {
        return train_dataset_name;
    }

    public void setTrain_dataset_name(String train_dataset_name) {
        this.train_dataset_name = train_dataset_name;
    }

    public String getTrain_dataset_size() {
        return train_dataset_size;
    }

    public void setTrain_dataset_size(String train_dataset_size) {
        this.train_dataset_size = train_dataset_size;
    }



    @Override
    public String toString() {
        return "Project{" +
                "project_id='" + project_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", created_at='" + created_at + '\'' +
                ", train_dataset_name='" + train_dataset_name + '\'' +
                ", train_dataset_size='" + train_dataset_size + '\'' +
                '}';
    }
}
