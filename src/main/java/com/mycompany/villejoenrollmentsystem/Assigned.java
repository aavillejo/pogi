/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.villejoenrollmentsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aaron
 */
public class Assigned extends VillejoEnrollmentSystem {
    private VillejoEnrollmentSystem db;

    public Assigned() {
        db = new VillejoEnrollmentSystem();
        db.DBConnect();
    }

    public List<Object[]> getAssignedSubjects(int teacherId) {
        List<Object[]> assignedSubjects = new ArrayList<>();

        try {
            String query = "SELECT s.subjID, s.subjcode, s.subjdesc, s.subjunits, s.subjsched " +
                           "FROM subjects s " +
                           "JOIN Assign a ON s.subjID = a.subjID " +
                           "WHERE a.tID = " + teacherId;
            db.rs = db.st.executeQuery(query);

            while (db.rs.next()) {
                assignedSubjects.add(new Object[]{
                    db.rs.getString("subjID"),
                    db.rs.getString("subjcode"),
                    db.rs.getString("subjdesc"),
                    db.rs.getString("subjunits"),
                    db.rs.getString("subjsched")
                });
            }
        } catch (Exception ex) {
            System.out.println("Error loading assigned subjects: " + ex.getMessage());
        }

        return assignedSubjects;
    }

    public boolean assignTeacher(int teacherId, int subjectId) {
        try {
            String checkSql = "SELECT * FROM Assign WHERE tID = " + teacherId + " AND subjID = " + subjectId;
            db.rs = db.st.executeQuery(checkSql);

            if (db.rs.next()) {
                return false; // Already assigned
            }

            String assignSql = "INSERT INTO Assign (tID, subjID) VALUES (" + teacherId + ", " + subjectId + ")";
            int rowsInserted = db.st.executeUpdate(assignSql);

            return rowsInserted > 0;
        } catch (Exception e) {
            System.out.println("Assignment error: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteAssignment(int teacherId, int subjectId) {
        try {
            String sql = "DELETE FROM Assign WHERE tID = " + teacherId + " AND subjID = " + subjectId;
            int rowsAffected = db.st.executeUpdate(sql);

            return rowsAffected > 0;
        } catch (Exception e) {
            System.out.println("Delete error: " + e.getMessage());
            return false;
        }
    }
}
