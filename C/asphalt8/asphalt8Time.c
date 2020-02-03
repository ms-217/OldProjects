#include <stdio.h>

int main()
{
	//Start-up Lines
	printf("Asphalt 8 Time Statistics Program vALPHA_1.0_DEV\n\n\n");
	printf("NOTE: This version is for developer use and is unfinished\n\n");
	
	//Mode Selection
	int startMode;
	{
		printf("Please select a mode: ");
		scanf("%d",&startMode);
	}
	//printf("Mode 1: Race Recorder\n");
	
	//Mode Code
	

	switch (startMode)
	{
		case 1:
		{
			printf("Mode is valid Mr. Dev");
			break;
		}
		
		default:
		{
			printf("no one likes that mode");
			break;
		}
	}
}