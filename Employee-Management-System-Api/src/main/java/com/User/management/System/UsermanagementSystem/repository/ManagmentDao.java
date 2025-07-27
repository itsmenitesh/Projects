package com.User.management.System.UsermanagementSystem.repository;

import com.User.management.System.UsermanagementSystem.module.Managment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ManagmentDao {
    private List<Managment> managmentList;
    private ManagmentDao(){
        managmentList =new ArrayList<>();


    }
        public List<Managment> getUserFromDataSources(){
        return managmentList;
    }
    public boolean save(Managment managment){
        managmentList.add(managment);
        return true;
    }
    public boolean remove(Managment managment){
        managmentList.remove(managment);
        return true;
    }
    public boolean update(String id, boolean status) {
        for(Managment management : managmentList) {
            if(management.getUserId().equals(id)) {
                management.setStatus(status);
                return true;
            }
        }
        return false;
    }
}
