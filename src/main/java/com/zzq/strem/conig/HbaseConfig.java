package com.zzq.strem.conig;


import com.zzq.strem.hbase.HBaseService;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HbaseConfig {
    @Bean(name = "hBaseService")
    public HBaseService getHbaseService(){
        System.setProperty("hadoop.home.dir", "D:\\hadoop");
        org.apache.hadoop.conf.Configuration conf = HBaseConfiguration.create();
        conf.set("hbase.zookeeper.quorum","120.78.195.231" );
        conf.set("hbase.client.keyvalue.maxsize","500000");
        HBaseService hBaseService = new HBaseService(conf);
        return hBaseService;
    }
}
