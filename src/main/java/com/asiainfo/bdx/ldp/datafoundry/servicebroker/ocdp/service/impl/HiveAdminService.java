package com.asiainfo.bdx.ldp.datafoundry.servicebroker.ocdp.service.impl;

import org.springframework.stereotype.Service;
import com.asiainfo.bdx.ldp.datafoundry.servicebroker.ocdp.service.OCDPAdminService;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by baikai on 5/19/16.
 */
public class HiveAdminService implements OCDPAdminService {
    @Override
    public void authentication(){ System.out.println("Hive auth successful."); }

    @Override
    public String provisionResources(String serviceInstanceId){
        System.out.println("Create hive table successful.");
        String resourceName = "";
        return resourceName;
    }

    @Override
    public String assignPermissionToResources(String policyName, String resourceName, List<String> groupList,
                                              List<String> userList, List<String> permList){
        System.out.println("Assign read/write/execute permission to hive table.");
        String rangerPolicyId = "";
        return rangerPolicyId;
    }

    @Override
    public boolean deprovisionResources(String serviceInstanceResuorceName){
        System.out.println("Delete hive table successful");
        return false;
    }

    @Override
    public void unassignPermissionFromResources(String policyId){
        System.out.println("Unassign read/write/execute permission to hive table.");
    }

    @Override
    public Map<String, Object> generateCredentials(){
       return Collections.singletonMap("uri", new Object());
    }
}