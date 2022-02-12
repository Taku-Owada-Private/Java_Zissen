package rensyu_mondai;


import java.util.*;

public class Book  implements Comparable<Book>, Cloneable{

	private String title;
	private Date publisherDate;
	private String comment;
	
	
	public String  getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Date  getPublisherDate() {
		return this.publisherDate;
	}
	
	public void setPublisherDate(Date publisherDate) {
		this.publisherDate = publisherDate;
	}
	
	public String  getComment() {
		return this.comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public Book() {
		this.title = "初期設定値";
		this.publisherDate = new Date();
		this.comment = "初期設定値";
	}
	
	public boolean equals(Object o) {
		if(o == this) {return true ;}
		if(o == null) {return false ;}
		if(!(o instanceof Book) ) {return false ;}
		Book b = (Book) o ;
		if(!(this.title == b.title)) {return false;}
		if(!(this.publisherDate == b.publisherDate)) {return false;}
		return true;
	}
	
	public int hashCode() {
		return Objects.hash(this.title , this.publisherDate , this.comment);
	}
	
	public int compareTo (Book b) {
		return this.publisherDate.compareTo(b.publisherDate) ;
	}
	
	public Book clone() {
		Book result = new Book();
		result.title = this.title;
		result.publisherDate = (Date) this.publisherDate.clone();
		result.comment = this.comment;
		return result;
	}
	
	public String toString () {
		return this.title+"/"+ this.publisherDate +"/"+ this.comment;
	}
	
	
	
	
}
