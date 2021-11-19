package lab_7;

public class BookInfo {

	public BookInfo(String pAuthor, String pTitle) {
		author = pAuthor;
		title = pTitle;
	}
	
	public String author;
	public String title;
	
	@Override
	public String toString() {
		return "\"" + title + "\", " + author;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof BookInfo))
			return false;
		BookInfo b = (BookInfo)obj;
		return b.title.equals(this.title);
	}
	
}
