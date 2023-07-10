package proxy.work;

import proxy.house2.ProxyUtil;

public class Client {
    public static void main(String[] args) {
        InformationSearchSystem proxyObject = (InformationSearchSystem) ProxyUtils
                .getProxyObject(new InformationSearchSystemImpl());
        try {
            proxyObject.search();
            proxyObject.log();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

