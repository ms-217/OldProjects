#include <stdio.h>
#include <stdlib.h>

int main()
{
	printf("Correlation Quiz BETA v1.0\n\n\n\n");
	
	int score = 0;
	
	int start;
	{
		printf("Enter 1 to Start: ");
		scanf("%d",&start);
	}
	
	int gameplay;
	{
		int question1;
		{
			printf("\n\n1. The sky is falling!\n");
			printf("\t1:Go lick a cow\n");
			printf("\t2:YOLO\n");
			printf("\t3:Fly to Switzerland\n\n");
		}
		int ans1;
		printf("Answer: ");
		scanf("%d",&ans1);
		
		switch (ans1)
		{
			case 3:
			{
				"%d" + 1, score;
				printf("\nCorrect!\nScore: %d", score);
			}	
			
			case 2: case 1:
			{
				printf("\nFAILURE!!!\nFinal Score: %d", score);
				exit(-1);
			}
		}
	}
	return 0;
}
