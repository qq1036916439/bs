package com.zzq.strem;

import com.zzq.strem.hbase.HBaseService;
import org.apache.hadoop.hbase.HBaseConfiguration;


import java.util.List;

public class testMain {


    public static void main(String[] args) {
        org.apache.hadoop.conf.Configuration conf = HBaseConfiguration.create();
        conf.set("hbase.zookeeper.quorum","120.78.195.231" );
        conf.set("hbase.client.keyvalue.maxsize","500000");
        conf.set("hbase.zookeeper.property.clientPort", "2181");
        HBaseService hBaseService = new HBaseService(conf);
        List<String> allTableNames = hBaseService.getAllTableNames();
        String[] columns={"姓名","学号"};
        String[] values={"123","43123"};
        hBaseService.putData("student","2","姓名",columns,values);

    }
}
