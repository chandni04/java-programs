class String3 {
	
	
	public static void main(String[] args) {
		
		//String text = "abcdefghijklmn     opqrstuvwxyz             12345678";
		String text = "java";
		String vovels[] = {"a", "e", "i", "o", "u"};
		
		for(int j = 0 ; j < vovels.length ; j++) {
			String vovel = vovels[j];
			String newText = text;
			text = text.replace(vovel, "");
			int occurences = newText.length() - text.length();
			if(occurences > 0) {
				System.out.println(vovel + " " + occurences);
			}
		}
		
				
	}

}