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
        String query = "INSERT INTO students VALUES(" + sID + ",'" + name + "','" + contact + "','" + address + "','" + email + "','" + gender + "','" + yrlvl + "')";
        try {
            a.st.executeUpdate(query);
            System.out.println("Insert Success");
        } catch (Exception ex) {
            System.out.println("Failed to Insert: " + ex.getMessage());
        }
    }

    public void DeleteRecord(int sID){
        VillejoEnrollmentSystem a = new VillejoEnrollmentSystem();
        a.DBConnect();
        String query = "DELETE FROM students WHERE studID = " + sID;
        try {
            a.st.executeUpdate(query);
            System.out.println("Delete Success");
        } catch (Exception ex) {
            System.out.println("Failed to Delete: " + ex.getMessage());
        }
    }

    public void UpdateRecord(int sID, String name, String contact, String address, String email, String gender, String yrlvl){
        VillejoEnrollmentSystem a = new VillejoEnrollmentSystem();
        a.DBConnect();
        String query = "UPDATE students SET "
                     + "studname='" + name + "', "
                     + "studcontact='" + contact + "', "
                     + "studaddress='" + address + "', "
                     + "studEmail='" + email + "', "
                     + "studgender='" + gender + "', "
                     + "studyrlvl='" + yrlvl + "' "
                     + "WHERE studID=" + sID;
        try {
            a.st.executeUpdate(query);
            System.out.println("Update Success");
        } catch (Exception ex) {
            System.out.println("Failed to Update: " + ex.getMessage());
        }
    }

    public void LoadRecord(){
        System.out.println("Load Clicked");
    }
}
