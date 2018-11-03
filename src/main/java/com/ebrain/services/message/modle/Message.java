package com.ebrain.services.message.modle;

public class Message {

  String projectId;
  String Status;
  Parameter parameter;

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public String getStatus() {
    return Status;
  }

  public void setStatus(String status) {
    Status = status;
  }

  public Parameter getParameter() {
    return parameter;
  }

  public void setParameter(Parameter parameter) {
    this.parameter = parameter;
  }

  @Override
  public String toString() {
    return "Message{"
        + "projectId='"
        + projectId
        + '\''
        + ", Status='"
        + Status
        + '\''
        + ", parameter="
        + parameter
        + '}';
  }
}
