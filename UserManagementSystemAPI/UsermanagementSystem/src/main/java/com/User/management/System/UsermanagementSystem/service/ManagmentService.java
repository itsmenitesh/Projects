package com.User.management.System.UsermanagementSystem.service;

import com.User.management.System.UsermanagementSystem.repository.ManagmentDao;
import com.User.management.System.UsermanagementSystem.module.Managment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagmentService {
    @Autowired
    ManagmentDao managmentDao;

    public List<Managment> getAllUser(){
        return managmentDao.getUserFromDataSources();
    }
    public String addUser(Managment managment){
        boolean insertionStatus = managmentDao.save(managment);
        if(insertionStatus){
            return "User details added Successfully...!!!";
        }else {
            return "Failed!!!... not able to find User..!!!";
        }
    }
    public Managment getUserBasedOnId(String UsedId){
        List<Managment> userListRightNow = managmentDao.getUserFromDataSources();
        for(Managment managment : userListRightNow){
            if(managment.getUserId().equals(UsedId)){
                return managment;
            }
        }
        return null;
    }
    public  String removeUserById(String id) {

        boolean deleteResponse = false;
        String status;
        if (id != null) {
            List<Managment> UserListRightNow = managmentDao.getUserFromDataSources();

            for (Managment managment : UserListRightNow) {
                if (managment.getUserId().equals(id)) {
                    deleteResponse = managmentDao.remove(managment);
                    if (deleteResponse) {
                        status = "User with Id " + id + " was deleted!!!!";
                    } else {
                        status = "User with id " + id + " Database error!!!";
                    }
                    return status;
                }
            }
            return "User with id " + id + "does not exist!!!";
        } else {
            return "Invalid id.... Cannot accept null";
        }
    }
    public String updateUserStatusById(String id, boolean status) {
        boolean updateStatus = managmentDao.update(id, status);
        if(updateStatus) {
            return "Management with id: " + id + " was updated!!!";
        } else {
            return "Management with id: " + id + " does not exist!!!";
        }
    }
}
