package org.smart4j.framework;

/**
 * 提供相关配置项常量
 *
 * @author huangyong
 * @since 1.0.0
 */
//体系管理是用final class来写常量，这里是用接口
public interface ConfigConstant {

    /**这里写的都是配置文件中的key，就是说我这个框架都哪些可配的东西，然后我代码里面会直接用它们对应的value，然后对外发布文档，
    说明我的框架有哪些key，有哪些value，每个value都是做什么的**/
    String CONFIG_FILE = "smart.properties";

    String JDBC_DRIVER = "smart.framework.jdbc.driver";
    String JDBC_URL = "smart.framework.jdbc.url";
    String JDBC_USERNAME = "smart.framework.jdbc.username";
    String JDBC_PASSWORD = "smart.framework.jdbc.password";

    String APP_BASE_PACKAGE = "smart.framework.app.base_package";
    String APP_JSP_PATH = "smart.framework.app.jsp_path";
    String APP_ASSET_PATH = "smart.framework.app.asset_path";
    String APP_UPLOAD_LIMIT = "smart.framework.app.upload_limit";
}
