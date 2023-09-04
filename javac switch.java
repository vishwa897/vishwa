class Main
{
	public static void main(String[] args) 
	{
	    char ch='P';
	    switch(ch)
    	{
	    case 'a': 
	    case 'e':
	    case 'i':
	    case 'o':
	    case 'u':
	    System.out.println("vowels");
	    break;
	    case 'A':
	    case 'E':
	    case 'I':
	    case 'O':
	    case 'U':
	    System.out.println("VOWELS");
	    break;
	    default:System.out.println("consonants");
	}
	}
}