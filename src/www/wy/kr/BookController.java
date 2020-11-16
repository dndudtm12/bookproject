package www.wy.kr;

import java.util.ArrayList;
import java.util.List;

public class BookController {
 public List<Book> selectBooks(){
	 List<Book> Books = new ArrayList<Book>();
	 
	 Book book0 = new Book();
	 book0.setTitle("해리포터");
	 book0.setWriter("조앤 롤링");
	 book0.setImage0("https://image.aladin.co.kr/product/38/56/cover500/898392067x_3.jpg");
	 books.add(book0);
	 
	 Book book1 = new Book();
	 book1.setTitle("반지의제왕");
	 book1.setWriter("톨킨");
	 book1.setImage0("http://image.kyobobook.co.kr/images/book/xlarge/181/x9788956372181.jpg");
	 books.add(book1);
	 
	 return books;
 }
}
