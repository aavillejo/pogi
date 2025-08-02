package com.mycompany.villejoenrollmentsystem;

public class Subjects {
    public void SaveRecord(int subjid, String subjcode, String subjdesc, int subjunits, String subjsched) {
        VillejoEnrollmentSystem a = new VillejoEnrollmentSystem();
        a.DBConnect();
        String query = "INSERT INTO subjects VALUES(" + subjid + ",'" + subjcode + "','" + subjdesc + "'," + subjunits + ",'" + subjunits + "')";
        try {
            a.st.executeUpdate(query);
            System.out.println("Subject Insert Success");
        } catch (Exception ex) {
            System.out.println("Failed to Insert: " + ex.getMessage());
        }
    }

    public void DeleteRecord(int subjID) {
    VillejoEnrollmentSystem a = new VillejoEnrollmentSystem();
    a.DBConnect();
    String query = "DELETE FROM subjects WHERE subjID = " + subjID;
    try {
        a.st.executeUpdate(query);
        System.out.println("Subject Delete Success");
    } catch (Exception ex) {
        System.out.println("Failed to Delete: " + ex.getMessage());
    }
}

    public void UpdateRecord(int subjid, String subjcode, String subjdesc, int subjunits, String subjsched) {
        VillejoEnrollmentSystem a = new VillejoEnrollmentSystem();
        a.DBConnect();
        String query = "UPDATE subjects SET "
                     + "subcode='" + subjcode + "', "
                     + "subdesc='" + subjdesc + "', "
                     + "units=" + subjunits + ", "
                     + "schedule='" + subjsched + "' "
                     + "WHERE id=" + subjid;
        try {
            a.st.executeUpdate(query);
            System.out.println("Subject Update Success");
        } catch (Exception ex) {
            System.out.println("Failed to Update: " + ex.getMessage());
        }
    }
}
