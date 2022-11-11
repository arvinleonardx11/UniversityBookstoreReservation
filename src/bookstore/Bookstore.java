/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

/**
 *
 * @author Dell
 */
public class Bookstore {
    public int booknumber;
    public String booktitle;
    public String bookauthor;
    public String course;
    public int stocks;
    
    public Bookstore (int booknumber, String booktitle, String bookauthor, String course, int stocks){
        this.booknumber = booknumber;
        this.booktitle = booktitle;
        this.bookauthor = bookauthor;
        this.course = course;
        this.stocks = stocks;
    }
    public int getbooknumber(){
        return booknumber;
    }
    public String getbooktitle(){
        return booktitle;
    }
    public String getbookauthor(){
        return bookauthor;
    }
    public String getcourse(){
        return course;
    }
    public int getstocks(){
        return stocks;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
