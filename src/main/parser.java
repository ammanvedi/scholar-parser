package main;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class parser {
	
	private ArrayList<article> articles = new ArrayList<article>();
	private Document html_doc;
	

	public parser(String parseurl) throws IOException{
		
		html_doc = Jsoup.connect(parseurl).userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
			      .referrer("http://www.google.com").get();
		Elements gs_article_results = html_doc.select("#gs_ccl .gs_r .gs_ri .gs_rt a");
		
		System.out.println(gs_article_results.get(0).attr("href"));
		
	}

}
