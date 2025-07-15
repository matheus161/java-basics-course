package com.matheus161.javabasics.class46;

public interface SqlDDL {

    void create(String query);
    void alter(String query);
    void drop(String query);
}
