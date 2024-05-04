package Exercise8;

public class Main {

	public static void main(String[] args) {
		Document document = new Document("This is a sample document.");
		System.out.println("Document contains keyword 'sample' : " + document.search("sample"));
		
		WebPage webPage = new WebPage("https://www.w3resource.com", "This is a sample webpage.");
		System.out.println("Webpage contains keyword 'sun' : " + webPage.search("sun"));
		
	}

}
