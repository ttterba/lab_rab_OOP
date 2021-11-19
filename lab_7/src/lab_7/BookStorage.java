package lab_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class BookStorage {

	public BookStorage() {
		
		data = new Hashtable<AuthorizeBook, ArrayList<BookInfo>>();
		
		data.put(new AuthorizeBook("Детектив"), new ArrayList<>(Arrays.asList(
						new BookInfo("Дафна дю Морье", "Ребекка"), 
						new BookInfo("Борис Акунин", "Азазель"))));
		data.put(new AuthorizeBook("Роман"), new ArrayList<>(Arrays.asList(
				new BookInfo("Федор Достоевский", "Идиот"), 
				new BookInfo("Федор Достоевский", "Игрок"))));
		data.put(new AuthorizeBook("Роман"), new ArrayList<>(Arrays.asList(
				new BookInfo("Александр Пушкин", "Капитанская дочка"), 
				new BookInfo("Лев Толстой", "Война и мир"))));
		data.put(new AuthorizeBook("Фантастика"), new ArrayList<>(Arrays.asList(
				new BookInfo("Фрэнк Герберт", "Дюна"), 
				new BookInfo("Энди Уир", "Марсианин"))));
		data.put(new AuthorizeBook("Наука"), new ArrayList<>(Arrays.asList(
				new BookInfo("Стивен Хокинг", "Краткая история времени"), 
				new BookInfo("Карл Саган", "Космос"))));
	}
	
	private Hashtable<AuthorizeBook, ArrayList<BookInfo>> data;
	
	public ArrayList<BookInfo> getBooks(AuthorizeBook ab) {
		if (data.containsKey(ab))
			return data.get(ab);
		else return null;
	}
	
	public void AddNewGenre(String pGenre) {
		data.put(new AuthorizeBook(pGenre), new ArrayList<BookInfo>());
	}
	
	
}
