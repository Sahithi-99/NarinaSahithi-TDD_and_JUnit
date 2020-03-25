package com.epam1.TDDandJUnit;

public class Erase_A {

	public String removeA(String string) {
		// TODO Auto-generated method stub
		String result="";
		int length=string.length();
		if(length==1)
		{
			if(string.charAt(0)!='A')
				result=string;
		}
		else
		{
			char firstchar=string.charAt(0);
		    char secondchar=string.charAt(1);
		    if(string.contains("A") && (firstchar=='A' || secondchar=='A'))
			{
				String rest_of_string=string.substring(2, length);
				if(firstchar=='A' && secondchar=='A')
				{
					result=rest_of_string;
				}
				else 
				{
					if(firstchar=='A')
					{
						result=secondchar+rest_of_string;
					}
					else if(secondchar=='A')
					{
						result=firstchar+rest_of_string;
					}
				}
			}
			else
				result=string;
		}
		return result;
	}

}
