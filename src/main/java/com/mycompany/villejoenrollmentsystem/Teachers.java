package com.mycompany.villejoenrollmentsystem;

public class Teachers extends VillejoEnrollmentSystem {
    public void SaveRecord(String tname, String tcontact, String taddress, String temail, String tdepartment) {
    VillejoEnrollmentSystem a = new VillejoEnrollmentSystem();
    a.DBConnect();

    try {
        int newID = 3000; // default starting point

        // get max ID
        rs = a.st.executeQuery("SELECT MAX(tid) AS maxID FROM teachers");
        if (rs.next()) {
            int maxID = rs.getInt("maxID");
            if (!rs.wasNull()) {
                newID = maxID + 1;
            }
        }

        String query = "INSERT INTO teachers (tid, tname, tcontact, taddress, temail, tdepartment) " +
                "VALUES(" + newID + ",'" + tname + "','" + tcontact + "','" + taddress + "','" + temail + "','" + tdepartment + "')";

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
