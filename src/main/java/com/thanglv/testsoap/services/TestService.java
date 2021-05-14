package com.thanglv.testsoap.services;

import org.springframework.stereotype.Service;

import java.util.Hashtable;
import java.util.UUID;

/**
 * @author thanglv on 5/14/2021
 * @project test-soap
 */
@Service
public class TestService {
    private Hashtable<String, Long> sessionList = new Hashtable<>();
    public static  final int maxSession = 30;

    public synchronized boolean isSessionValid(String sessionId) {
        long now = System.currentTimeMillis();
        if (now - sessionList.get(sessionId) > 120000) {
            sessionList.remove(sessionId);
            return false;
        } else
            return true;
    }

    public String genSession() {
        String session = UUID.randomUUID().toString();
        sessionList.put(session, System.currentTimeMillis());
        return session;
    }

    public Hashtable<String, Long> getSessionList() {
        return sessionList;
    }

    public void setSessionList(Hashtable<String, Long> sessionList) {
        this.sessionList = sessionList;
    }

    public synchronized boolean keepAliveSession(String sessionIdKeep) {
        long now = System.currentTimeMillis();
        if (now - sessionList.get(sessionIdKeep) > 120000) {
            return false;
        } else {
            sessionList.put(sessionIdKeep, now);
            return true;
        }
    }
}
