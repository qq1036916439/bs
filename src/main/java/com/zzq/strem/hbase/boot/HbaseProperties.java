package com.zzq.strem.hbase.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * JThink@JThink
 *
 * @author JThink
 * @version 0.0.1
 * date： 2016-11-16 14:51:42
 */
@ConfigurationProperties(prefix = "spring.data.hbase")
public class HbaseProperties {

    public void setQuorum(String quorum) {
        this.quorum = quorum;
    }

    public void setMaxsize(String maxsize) {
        this.maxsize = maxsize;
    }

    private String quorum;
    private  String maxsize;

    public String getQuorum() {
        return quorum;
    }

    public String getMaxsize() {
        return maxsize;
    }
}
