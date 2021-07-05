package com.FSDTraining.q7;

import java.util.StringTokenizer;

public class EmailValidation {

	public static void main(String[] args) {

		String input = "test@mail.com";

		boolean b = validate(input);

		if (b == true)

			System.out.println("The input " + input + " is a valid mail id");

		else

			System.out.println("The input " + input + "is not valid mail id");

	}

	public static boolean validate(String ip) {

		// int i = 0;

		boolean b = false;

		StringTokenizer t = new StringTokenizer(ip, "@");

		String username = t.nextToken();

		System.out.println("User Name:" + username);
		String domainname = t.nextToken();
		System.out.println("domainname:" + domainname);
		StringTokenizer domain = new StringTokenizer(domainname, ".");
		String domain_name = domain.nextToken();
		// System.out.println(domain_name);
		String ext = domain.nextToken();
		// System.out.println(ext);
		if (ip.contains("@") && ip.contains("."))

//			i++;
//
//		if (i == 1)

			if (domain_name.length() == 4)

				if (username.length() >= 3)

					if (ext.equals("com"))

						b = true;

		return b;
	}
}