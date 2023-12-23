package com.ruzmetov.hotelprojectapp.domain.entity;

import com.ruzmetov.hotelprojectapp.domain.interfaces.Administrator;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Table
@Entity

public class CommonAdministrator implements Administrator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "administrator_id")
    private UUID administratorId;

    @Column(name = "administrator_first_name")
    private String firstName;

    @Column(name = "administrator_last_name")
    private String lastName;

    @Column(name = "administrator_password")
    private String password;

    @Column(name = "administrator_email")
    private String email;

    @Column(name = "administrator_departament")
    private String departament;

    @Column(name = "administrator_position")
    private String position;

    @Column(name = "administrator_feedback_review")
    private String feedbackReview;

    @Column(name = "administrator_roots_access")
    private String reportAccess;


    public CommonAdministrator() {
        this.administratorId = UUID.randomUUID();

    }


    public CommonAdministrator(String firstName, String lastName, String email, String departament, String position, String feedbackReview, String reportAccess) {
        this.administratorId = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.departament = departament;
        this.position = position;
        this.feedbackReview = feedbackReview;
        this.reportAccess = reportAccess;

    }

    @Override
    public UUID getAdministratorId() {
        return administratorId;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getDepartament() {
        return departament;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public String getFeedbackReview() {
        return feedbackReview;
    }

    @Override
    public String getReportAccess() {
        return reportAccess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonAdministrator that = (CommonAdministrator) o;
        return Objects.equals(administratorId, that.administratorId) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(password, that.password) && Objects.equals(email, that.email) && Objects.equals(departament, that.departament) && Objects.equals(position, that.position) && Objects.equals(feedbackReview, that.feedbackReview) && Objects.equals(reportAccess, that.reportAccess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(administratorId, firstName, lastName, password, email, departament, position, feedbackReview, reportAccess);
    }

    @Override
    public String toString() {
        return "CommonAdministrator{" +
                "administratorId=" + administratorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", departament='" + departament + '\'' +
                ", position='" + position + '\'' +
                ", feedbackReview='" + feedbackReview + '\'' +
                ", reportAccess='" + reportAccess + '\'' +
                '}';
    }
}
