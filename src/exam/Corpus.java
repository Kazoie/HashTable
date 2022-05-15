package exam;

import java.util.HashMap;

public class Corpus extends HashMap<String, Journal>{

	public String returnAuthor(String JournalName, int articleID) {
		String res = " ";
		if (this.containsKey(JournalName)) {
			res = this.get(JournalName).get(articleID).author;
		}
		return res;
	}
	
	public void printAuthorList(String journalName ) {
		if (this.containsKey(journalName)) {
			for (int i = 0; i < this.get(journalName).size(); i++  ) {
				System.out.println(this.get(journalName).get(i).author);
			}
		}
	}
	
	public void removeAuthor(String author) {
		for (int i = 0; i < this.size(); i++) {
			for (int y = 0; y < this.get(i).size(); y++) {
					this.get(i).remove(this.get(i).get(y).author);
			}
		}
	}
	
	public void mergeCorpora(Corpus corpus) throws Exception {
		for (int i = 0 ; i < corpus.size(); i++) {
		//	this.put(corpus.get(i),); jsp
		}
	}
	
	public String lessWidelyPublishingAuthor(String author1,String author2) {
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < this.size(); i++) {
			for (int y = 0; y < this.get(i).size(); y++) {
				if (this.get(i).get(y).author == author1) {
					count1++;
				} else if (this.get(i).get(y).author == author2){
					count2++;
				}
			}
		}
		if (count1 > count2) {
			return author1;
		} else return author2;
	}
	
	
	
}
