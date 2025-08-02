package com.mycompany.villejoenrollmentsystem;

public class Teachers {
    public void SaveRecord(int tID, String tname, String tcontact, String taddress, String temail, String tdepartment) {
        VillejoEnrollmentSystem a = new VillejoEnrollmentSystem();
        a.DBConnect();
        String query = "INSERT INTO teachers VALUES(" + tID + ",'" + tname + "','" + tcontact + "','" + taddress + "','" + temail + "','" + tdepartment + "')";
        try {
            a.st.executeUpdate(query);
            System.out.println("Teacher Insert Success");
        } catch (Exception ex) {
            System.out.println("Failed to Insert: " + ex.getMessage());
        }
    }

    public void DeleteRecord(int tID) {
        VillejoEnrollmentSystem a = new VillejoEnrollmentSystem();
        a.DBConnect();
        String query = "DELETE FROM teachers WHERE tID = " + tID;
        try {
            a.st.executeUpdate(query);
            System.out.println("Teacher Delete Success");
        } catch (Exception ex) {
            System.out.println("Failed to Delete: " + ex.getMessage());
        }
    }

    public void UpdateRecord(int tID, String tname, String tcontact, String taddress, String temail, String tdepartment) {
        VillejoEnrollmentSystem a = new VillejoEnrollmentSystem();
        a.DBConnect();
        String query = "UPDATE teachers SET "
                     + "tname='" + tname + "', "
                     + "tcontact='" + tcontact + "', "
                     + "taddress='" + taddress + "', "
                     + "temail='" + temail + "', "
                     + "tdepartment='" + tdepartment + "' "
                     + "WHERE tID=" + tID;
        try {
            a.st.executeUpdate(query);
            System.out.println("Teacher Update Success");
        } catch (Exception ex) {
            System.out.println("Failed to Update: " + ex.getMessage());
        }
    }
}
