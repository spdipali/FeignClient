package com.example.FirebaseDemo.dto;

public class SignupDTO {

        private String signupId;
        private String signupName;
        private String signupUname;
        private String signupRole;

    @Override
    public String toString() {
        return "SignupDTO{" +
                "signupId='" + signupId + '\'' +
                ", signupName='" + signupName + '\'' +
                ", signupUname='" + signupUname + '\'' +
                ", signupRole='" + signupRole + '\'' +
                '}';
    }

    public String getSignupRole() {
        return signupRole;
    }

    public void setSignupRole(String signupRole) {
        this.signupRole = signupRole;
    }

    public String getSignupId() {
            return signupId;
        }

        public void setSignupId(String signupId) {
            this.signupId = signupId;
        }

        public String getSignupName() {
            return signupName;
        }

        public void setSignupName(String signupName) {
            this.signupName = signupName;
        }

        public String getSignupUname() {
            return signupUname;
        }

        public void setSignupUname(String signupUname) {
            this.signupUname = signupUname;
        }


}
