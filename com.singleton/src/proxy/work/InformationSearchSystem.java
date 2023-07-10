package proxy.work;

public interface InformationSearchSystem {
    void search();
    void log();
}


class InformationSearchSystemImpl implements InformationSearchSystem {

    @Override
    public void search() {
        System.out.println("进行商务信息查询");
        this.log();
    }

    @Override
    public void log() {
    }
}