#include <stdio.h>
#include <stdlib.h>

int main()
{
	printf("Passwords version 1.0\n");
	
	FILE *keys_in = fopen("KEYS.txt", "r");
	FILE *keys_out = fopen("KEYS.txt", "w");
	
	//test for files
	if (keys_in == NULL || keys_out == NULL)
		{
			printf("Terminal Error! KEYS file does not exist and/or cannot be found\n");
			exit(-1);
		}
	
	/*TESTING ONLY*/
	
	int integer;
	
	fprintf(keys_in, "this is a test %d\n", integer);
	
	fprintf(stdout, "this is a test %d\n", integer);
	//printf("this is a test %d\n", integer);
	
	//TEST SUCESSFUL! NOTABLE: to create the KEYS file,
	//you must run the program once.
	
	//printf("
	
	fclose(keys_in);
	fclose(keys_out);

return 0;
}