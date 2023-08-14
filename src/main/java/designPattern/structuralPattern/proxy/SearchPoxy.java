package designPattern.structuralPattern.proxy;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 下午5:53
 **/
public class SearchPoxy implements Search {
    Validator validator = new Validator();
    Logger logger = new Logger();
    RealSearch realSearch = new RealSearch();

    @Override
    public void search(String s) {
        Boolean aBoolean = validate(s);
        if (aBoolean == true) {
            realSearch.search(s);
            dolog(s);
        } else {
            System.out.println("permission denied.");
        }
    }

    private void dolog(String s) {
        logger.log(s);
    }

    private Boolean validate(String s) {
        return validator.validate(s);
    }
}
