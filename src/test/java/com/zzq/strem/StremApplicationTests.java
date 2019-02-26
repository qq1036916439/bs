package com.zzq.strem;

import com.zzq.strem.hbase.HBaseService;
import com.zzq.strem.hbase.api.HbaseTemplate;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StremApplicationTests {
    @Autowired
    HBaseService hBaseService;

    @Autowired
    private  HbaseTemplate hbaseTemplate;

    @Test
    public void contextLoads() throws IOException {
        Admin admin = hbaseTemplate.getConnection().getAdmin();
        System.out.println(admin);
    }



}
