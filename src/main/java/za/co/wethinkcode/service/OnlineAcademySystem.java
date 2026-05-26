package za.co.wethinkcode.service;

import za.co.wethinkcode.model.Student;

public class OnlineAcademySystem extends AcademySystem {

    // TODO: implement constructor:
    public OnlineAcademySystem(String academyName) {
        super(academyName);
    }
    // OnlineAcademySystem(String academyName)
    // - call super(academyName)

    // =========================
    // REGISTRATION RULES
    // =========================

    // TODO: implement processRegistration(Student student)
    public void processRegistration(Student student) {
        System.out.println("Online registration processed for Student: " + student.getId());
    }
    //
    // Rules:
    // - online registrations process instantly
    // - print:
    //   "Online registration processed for Student <id>"
}