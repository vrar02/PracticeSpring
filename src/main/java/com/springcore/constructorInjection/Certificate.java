package com.springcore.constructorInjection;

public class Certificate {

    private  String certificateName;

    public Certificate(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateName() {
        return certificateName;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "certificateName='" + certificateName + '\'' +
                '}';
    }
}
