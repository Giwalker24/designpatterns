package com.sda.designpatterns.behavioral.observer;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}