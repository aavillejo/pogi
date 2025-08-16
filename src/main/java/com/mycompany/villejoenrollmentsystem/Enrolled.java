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
public class Enrolled extends VillejoEnrollmentSystem {
    private VillejoEnrollmentSystem db;

    public Enrolled() {
        db = new VillejoEnrollmentSystem();
        db.DBConnect();
    }

    public List<Object[]> getEnrolledSubjects(int studentId) {
        List<Object[]> enrolledSubjects = new ArrayList<>();

        try {
            String query = "SELECT s.subjID, s.subjcode, s.subjdesc, s.subjunits, s.subjsched " +
                           "FROM Enroll e " +
                           "JOIN subjects s ON e.subjID = s.subjID " +
                           "WHERE e.studID = " + studentId;
            db.rs = db.st.executeQuery(query);

            while (db.rs.next()) {
                enrolledSubjects.add(new Object[]{
                    db.rs.getString("subjID"),
                    db.rs.getString("subjcode"),
                    db.rs.getString("subjdesc"),
                    db.rs.getString("subjunits"),
                    db.rs.getString("subjsched")
                });
            }
        } catch (Exception ex) {
            System.out.println("Error loading enrolled subjects: " + ex.getMessage());
        }

        return enrolledSubjects;
    }

    public boolean enrollStudent(int studentId, int subjectId) {
        try {
            String checkSql = "SELECT * FROM Enroll WHERE studID = " + studentId + " AND subjID = " + subjectId;
            db.rs = db.st.executeQuery(checkSql);

            if (db.rs.next()) {
                return false; // Already enrolled
            }

            String enrollSql = "INSERT INTO Enroll (studID, subjID) VALUES (" + studentId + ", " + subjectId + ")";
            int rowsInserted = db.st.executeUpdate(enrollSql);

            return rowsInserted > 0;
        } catch (Exception e) {
            System.out.println("Enrollment error: " + e.getMessage());
            return false;
        }
    }

    public boolean dropStudent(int studentId, int subjectId) {
        try {
            String sql = "DELETE FROM Enroll WHERE studID = " + studentId + " AND subjID = " + subjectId;
            int rowsAffected = db.st.executeUpdate(sql);

            return rowsAffected > 0;
        } catch (Exception e) {
            System.out.println("Drop error: " + e.getMessage());
            return false;
        }
    }
}

