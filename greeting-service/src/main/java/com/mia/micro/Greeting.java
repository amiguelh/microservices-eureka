package com.mia.micro;

import java.io.Serializable;

/**
 * @author amiguel
 */
public class Greeting implements Serializable {

    private static final long serialVersionUID = 1L;
    private final String content;

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
