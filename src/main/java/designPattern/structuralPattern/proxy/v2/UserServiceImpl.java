package designPattern.structuralPattern.proxy.v2;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/13 23:59
 **/
public class UserServiceImpl implements UserService{
    @Override
    public void insertUser(String userName) {
        System.out.println("insert userName: " + userName);
    }

    @Override
    public void selectUser() {
        System.out.println("select user success.");
    }
}