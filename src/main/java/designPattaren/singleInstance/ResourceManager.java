package designPattaren.singleInstance;

import com.sun.org.apache.regexp.internal.RE;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-15 下午10:35
 **/
public class ResourceManager {
    public static ResourceManager resourceManager = null;//1.静态成员变量

    private ResourceManager() {}

    public static ResourceManager getResourceManagerInstance() {//2、静态成员方法
        if (resourceManager == null) {
            resourceManager = new ResourceManager();
        }
        return resourceManager;
    }

    public static void main(String[] args) {
        ResourceManager resourceManager = ResourceManager.getResourceManagerInstance();
    }
}
