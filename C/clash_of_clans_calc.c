#include <stdio.h>
#include <stdlib.h>

int main()
{
	printf("Clash of Clans Calculator v1.0 BETA\n\n\n\n");
	
	FILE *local_in = fopen("local.txt", "r");
	FILE *local_out = fopen("local.txt", "w");
	
	//int md = 0;
	
	int mode;
	{
		printf("Mode 1: Upgrading\n\n");
		
		printf("Please select a mode: ");
		scanf("%d",&mode);
	}
	
	switch(mode)
	{
		case 1:
		{
			FILE *up = fopen("upgrade.txt", "r");
			printf("\n\n Upgrading:\n\n");
			printf("\t1: Walls\n\n");
			
			int upmode
			{
				printf("What are you upgrading: ");
				scanf("%d",&upmode);
			}
			
			switch(upmode)
			{
				case 1:
				{
					printf("Walls");
				}
			}
			break;
		}
	}
}