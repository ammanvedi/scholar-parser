package main;

public class article {
	
	private String article_title;
	private String article_abstract;
	private String article_link;
	private String article_citations;
	private String article_link_related;
	
	public article(String article_title, String article_abstract, 
						String article_link, String article_citations, String article_link_related){
		
		this.setArticle_abstract(article_abstract);
		this.setArticle_title(article_title);
		this.setArticle_citations(article_citations);
		this.setArticle_link(article_link);
		this.setArticle_link_related(article_link_related);

	}
	
	@Override
	public String toString(){
		String dta = "Title: " + this.article_title + "\n" + 
				"Link: " + this.article_link + "\n" + 
				"Abstract: " + this.article_abstract + "\n" + 
				"Citations: " + this.article_citations + "\n" + 
				"related: " + this.article_link_related + "\n\n" ;
		
		return dta;
	}

	public String getArticle_title() {
		return article_title;
	}

	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}

	public String getArticle_abstract() {
		return article_abstract;
	}

	public void setArticle_abstract(String article_abstract) {
		this.article_abstract = article_abstract;
	}

	public String getArticle_link() {
		return article_link;
	}

	public void setArticle_link(String article_link) {
		this.article_link = article_link;
	}

	public String getArticle_citations() {
		return article_citations;
	}

	public void setArticle_citations(String article_citations) {
		this.article_citations = article_citations;
	}

	public String getArticle_link_related() {
		return article_link_related;
	}

	public void setArticle_link_related(String article_link_related) {
		this.article_link_related = article_link_related;
	}
	
	

}
