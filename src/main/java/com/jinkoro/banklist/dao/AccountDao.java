package com.jinkoro.banklist.dao;

import java.util.List;

public interface AccountDao<T> {
    public abstract List<T> findAllAccounts();
    public abstract List max();
    public abstract List sum();
}