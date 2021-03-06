package com.reactnativesunmieid.bean;

import java.io.Serializable;

public class Result implements Serializable {

  /**
   * 返回码
   */
  public int code;
  /**
   * 结果信息
   */
  public String msg = "";
  /**
   * 结果的实体
   */
  public Data data;

  public static class Data {
    public String info = "";

    @Override
    public String toString() {
      return "Data{" +
        "info='" + info + '\'' +
        '}';
    }
  }

  @Override
  public String toString() {
    return "Result{" +
      "code=" + code +
      ", msg='" + msg + '\'' +
      ", data=" + (data == null ? "null" : data.toString()) +
      '}';
  }
}
