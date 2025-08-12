package com.mycompany.villejoenrollmentsystem;

public class Subjects extends VillejoEnrollmentSystem {
    public void SaveRecord(String subjcode, String subjdesc, int subjunits, String subjsched) {
        VillejoEnrollmentSystem a = new VillejoEnrollmentSystem();
    a.DBConnect();

    int newID = 2000; 

    try {
        String getMaxIdQuery = "SELECT MAX(subjid) FROM subjects";
         rs = a.st.executeQuery(getMaxIdQuery);

        if (rs.next() && rs.getInt(1) != 0) {
            newID = rs.getInt(1) + 1; 
        }

        String query = "INSERT INTO subjects (subjid, subjcode, subjdesc, subjunits, subjsched) VALUES (" +
                newID + ",'" + subjcode + "','" + subjdesc + "'," + subjunits + ",'" + subjsched + "')";
        a.st.executeUpdate(query);
        System.out.println("Subject Insert Success with ID: " + newID);

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
