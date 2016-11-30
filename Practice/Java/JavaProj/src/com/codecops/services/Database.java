package com.codecops.services;

import java.util.ArrayList;
import java.util.List;

import com.codecops.lms.Book;
import com.codecops.lms.Member;

public class Database {

    public List<Member> membersList = new ArrayList<Member>();
    public List<Book> booksList = new ArrayList<Book>();

    private int memberId = 105;
    private int bookId = 103;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    
    /*
     * taking the book details for different members
     */

    public Database() {
        // TODO Auto-generated constructor stub
        booksList.add(new Book(101, "book1", "aut", true, 4.5));
        booksList.add(new Book(102, "book2", "aut", true, 3.5));
        booksList.add(new Book(103, "book3", "aut", true, 4));

        membersList.add(new Member(101, "Jack", 3333333333l, "abcd"));
        membersList.add(new Member(102, "John", 1111111111l, "abcd"));
        membersList.add(new Member(103, "Jil", 4545454544l, "abcd"));
        membersList.add(new Member(104, "Eddi", 7878787875l, "abcd"));
        membersList.add(new Member(105, "Gorge", 7878789995l, "abcd"));

    }
}