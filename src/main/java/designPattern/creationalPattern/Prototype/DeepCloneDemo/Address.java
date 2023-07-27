package designPattern.creationalPattern.Prototype.DeepCloneDemo;

import java.io.*;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-16 下午3:33
 **/
public class Address implements Serializable, Cloneable {
    String country = null;
    String privince = null;
    String detail = null;

    public Address(String country, String privince, String detail) {
        this.country = country;
        this.privince = privince;
        this.detail = detail;
    }
}
