package com.giyeon.data_structure.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    Deque<String> stack = new ArrayDeque<>();
    String currentPage = null;

    public void visitPage(String url) {
        if(currentPage != null) {
            stack.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문: " + url);
    }

    public String goBack() {
        if (!stack.isEmpty()) {
            currentPage = stack.pop();
            System.out.println(currentPage);
            return currentPage;
        }
        return null;
    }
}
