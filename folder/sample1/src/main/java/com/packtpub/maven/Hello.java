package com.packtpub.maven;

import java.util.ResourceBundle;

/**
 * Hello world!
 */
public class Hello {

    public static void main(String... args) {
        ResourceBundle bundle = ResourceBundle.getBundle("com.packtpub.maven.HelloStrings");
        System.out.println(bundle.getString("hello"));
    }
}
