#include <stdio.h>
#include <stdlib.h>

int main()
{
	printf("Clash of Clans Calculator SET-UP v1.0\n\n");
	
	FILE *local_in = fopen("local.txt", "r");
	FILE *local_out = fopen("local.txt", "w");
	
	if (local_in == NULL || local_out == NULL)
		{
			printf("File creation started! To continue setup, Re-run program\n");
			exit(-1);
		}
}