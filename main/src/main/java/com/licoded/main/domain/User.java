package com.licoded.main.domain;

public class User {
    private String testUsername;

    private String testPassword;

    public String getTestUsername() {
        return testUsername;
    }

    public void setTestUsername(String testUsername) {
        this.testUsername = testUsername;
    }

    public String getTestPassword() {
        return testPassword;
    }

    public void setTestPassword(String testPassword) {
        this.testPassword = testPassword;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", testUsername=").append(testUsername);
        sb.append(", testPassword=").append(testPassword);
        sb.append("]");
        return sb.toString();
    }
}