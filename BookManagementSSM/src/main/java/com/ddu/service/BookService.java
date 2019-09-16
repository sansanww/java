package com.ddu.service;

import com.ddu.dto.AppointExecution;
import com.ddu.entity.Book;

import java.util.List;

public interface BookService {
    Book getById(long bookId);
    List<Book> getList();
    AppointExecution appoint(long bookId,long studentId);
}
