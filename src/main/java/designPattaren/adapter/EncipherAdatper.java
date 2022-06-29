package designPattaren.adapter;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 下午12:18
 **/
public class EncipherAdatper extends EncipherAdatpee implements Encipher {
    String string = null;
    EncipherAdatpee encipherAdatpee = null;

    public EncipherAdatper(String string) {
        this.string = string;
    }
    @Override
    public String enCode() {
        encipherAdatpee = new EncipherAdatpee();
        String s = encipherAdatpee.getxxEncode(string);
        return s;
    }
}
