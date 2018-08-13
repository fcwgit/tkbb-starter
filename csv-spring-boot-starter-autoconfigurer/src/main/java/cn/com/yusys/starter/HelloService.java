package cn.com.yusys.starter;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloService {

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    HelloProperties helloProperties ;

    public String sayHelloCSV(String name){
        return helloProperties.getPrefix() + "-" + name + "-" + helloProperties.getSuffix();
    }
}
