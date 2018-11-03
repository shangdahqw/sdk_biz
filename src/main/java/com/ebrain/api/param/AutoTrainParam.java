package com.ebrain.api.param;

public class AutoTrainParam {

    // fs.default参数配置的 hdfs://namenode:8020
    private String hdfsHost;
    // fs.default参数配置的 8020
    private String hdfsPort;
    // 路径
    private String hdfsPath;
    // 路径代表 训练集 还是 预测集 PathTypeEnum
    private int pathType;

    // 文件类型 FileTypeEnum
    private int fileType;
    // 文件编码 EncodingEnum
    private int encodingType;
    // 分隔符（支持单个或多个字符）
    // 不可见字符支持使用首尾均为`的字符串进行设置，例如 `\x01\x02`
    private String seperator;
    // 缺失值占位符，用`|`分隔
    private String nullString;
    // 文本识别符号 QuoteEnum
    private int quoteType;
    // 表头类型 HeaderEnum
    private int headerType;
    // 大小写是否敏感
    private boolean caseSensitive;

    // 目标列名称
    private String targetName;
    // 目标列的位置
    private int targetIdx;

    // 验证方法 SplitMethodEnum
    private int splitMethodType;
    // 交叉验证折数
    private int crossValidFold;
    // 测试集百分比
    private int test_ratio;



}
