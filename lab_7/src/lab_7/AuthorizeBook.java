package lab_7;

public class AuthorizeBook{
	private String genre;

	public AuthorizeBook(String pGenre) {
		genre = pGenre;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(!(ob instanceof AuthorizeBook))
			return false;
		AuthorizeBook a = (AuthorizeBook)ob;
		if((this.genre.equals(a.genre)))
			return true;
		return false;			
	}
	
	@Override
	public int hashCode() {
		int res = 1;
		res = res * 79 + genre.length();
		return res;
	}

}
