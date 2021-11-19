package lab_7;

import java.util.ArrayList;
import java.util.Scanner;


public class Starter {

	public static void main(String[] args) {

		BookStorage lib = new BookStorage();
		Scanner sc = new Scanner(System.in);
			
		System.out.println("1 - поиск книг");
		System.out.println("2 - добавить книгу");
		System.out.println("3 - удалить книгу");
		System.out.println("0 - выход");
		System.out.print("Выберите команду > ");
		int command = sc.nextInt();
		
		switch (command) {
		case 1: {
			System.out.print("\nВведите жанр > ");
			String genre = sc.next();

			ArrayList<BookInfo> books = lib.getBooks(new AuthorizeBook(genre));
			
			if(books != null) {
				for(int i = 0; i < books.size(); i++) 
					System.out.println(books.get(i).toString());
			}
			else
				System.out.println("Книг такого жанра нет");
			break;
		}
		
		case 2: {
			System.out.print("Введите жанр добавляемой книги > ");
			String genre = sc.next();
			
			ArrayList<BookInfo> books = lib.getBooks(new AuthorizeBook(genre));
			if(books == null) {
				lib.AddNewGenre(genre);
				books = lib.getBooks(new AuthorizeBook(genre));
			}
			System.out.print("Введите название добавляемой книги > ");
			String title = sc.next();
			System.out.print("Введите автора добавляемой книги > ");
			String author = sc.next();
			books.add(new BookInfo(author, title));
			System.out.println("Книга успешно добавлена!");
			
			System.out.print("\nВведите жанр > ");
			genre = sc.next();

			books = lib.getBooks(new AuthorizeBook(genre));
			
			if(books != null) {
				for(int i = 0; i < books.size(); i++) 
					System.out.println(books.get(i).toString());
			}
			else
				System.out.println("Книг такого жанра нет");
			break;
		}
		
		case 3: {
			System.out.print("Введите жанр удаляемой книги > ");
			String genre = sc.next();
			
			ArrayList<BookInfo> books = lib.getBooks(new AuthorizeBook(genre));
			if(books == null) {
				System.out.println("Книг такого жанра нет!");
			}
			System.out.print("Введите название удаляемой книги > ");
			String title = sc.next();
			System.out.print("Введите автора удаляемой книги > ");
			String author = sc.next();
			books.remove(new BookInfo(author, title));
			System.out.print("Книга успешно удалена!");
			
			break;
		}
		
		case 0: {
			break;
		}
		default:
			break;
		}
		
		

	}
	
	

}
