/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.villejoenrollmentsystem;

/**
 *
 * @author aaron
 */
public class Students extends VillejoEnrollmentSystem{
    int studID;
    String studname, studaddress, studcontact, studEmail, studgender, studyrlvl;

    public void SaveRecord(String name, String contact, String address, String email, String gender, String yrlvl){
        DBConnect(); // connect for THIS object

    try {
        int sID = 1001;
        rs = st.executeQuery("SELECT MAX(studID) AS maxID FROM students");
        if (rs.next()) {
        int maxID = rs.getInt("maxID");
        if (rs.wasNull()) {
        sID = 1000; 
    }   else {
        sID = maxID + 1;
    }
}
        String query = "INSERT INTO students VALUES(" + sID + ",'" + name + "','" + contact + "','" + address + "','" + email + "','" + gender + "','" + yrlvl + "')";
        st.executeUpdate(query);
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
