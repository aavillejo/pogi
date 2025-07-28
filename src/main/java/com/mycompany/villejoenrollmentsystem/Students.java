/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.villejoenrollmentsystem;

/**
 *
 * @author aaron
 */
public class Students {
    int studID;
    String studname, studaddress, studcontact, studEmail, studgender, studyrlvl;
    
    public void SaveRecord(int sID, String name, String contact, String address, String email, String gender, String yrlvl){
        VillejoEnrollmentSystem a = new VillejoEnrollmentSystem();
        a.DBConnect();
        String query = "insert into students values(" + sID + ",'" + name + "','" + contact + "','" + address + "','" + email + "','" + gender + "','" + yrlvl + "')";
        try{
            a.st.executeUpdate(query);
            System.out.println("Insert Success");
        }catch (Exception ex){
            System.out.println("Failed to Insert");
        }
    }
    public void DeleteRecord(){
        System.out.println("Delete Clicked");
    }
    public void UpdateRecord(){
        System.out.println("Update Clicked");
    }
    public void LoadRecord(){
        System.out.println("Load Clicked");
    }
}
