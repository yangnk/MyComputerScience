package designPattaren.Prototype.DeepCloneDemo;

import java.io.*;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-16 下午3:16
 **/
public class PersionInfo implements Cloneable, Serializable{
    String name = null;
    int age;
    Address address = null;

    public PersionInfo(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    public PersionInfo clone() {
        try {
            //将流写入
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            //将流读出
            ByteArrayInputStream byteInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteInputStream);
            return (PersionInfo) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
