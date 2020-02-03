#include <stdio.h>

int main()
{
	//welcome lines
	printf("Welcome to the Pinocchio lines learning program!\n");
	printf("Please log in: \(autolog\) Badger\n logging in...\nlogin succesful!\n");
	printf("to login with another character, please edit code\n");
	printf("loading lines...\n lines loaded succesful!\n");
	
	//lines
	int n = 0;
	for(n = 0;n <= 10;n++);
	{
		int line;
		printf("please pick a number 1-9: ");
		scanf("%d\nthe number you pick is the number of line you say in show. Its in order!",&line);
		
		switch (line)
		{
			case 1:
				printf("line before: \(song\)\nline: \"So, what's the job?\"\n");
				break;
				
			case 2:
				printf("line before: \"Off to the Puppet Theatre to catch up with an old assosiate in illegalities.\"\nline: \"Okay...\"\n");
				break;
				
			case 3:
				printf("line before: \"Consider it done, daddy-o.\"\nline: \"One new puppet on the way.\"\n");
				break;
				
			case 4:
				printf("line before: \"Stop where you are! Why, just look at him. The grace, the poise, the statuosity! Incredulous, yes?\"\nline: \"Yeah, Grace.\"\n");
				break;
				
			case 5:
				printf("line before: \"Or, like a thousand-fold.\"\nline: \"Or even more!\"\n");
				break;
				
			case 6:
				printf("line before: \(first line on entrance\)\nline: \"Well, Well.\"\n");
				break;
				
			case 7:
				printf("line before: \"What are you doing here?\"\nline: \"Just workin' a little on-the-side gig of our own.\"\n");
				break;
				
			case 8:
				printf("line before: \"And you get a piece of the action.\"\nline: \"Kapish?\"\n");
				break;
				
			case 9:
				printf("line before: \"Now, if you excuse me, I've got some vermon to take care of.\"\nline: \(ad-lib \"I didnt do it!\"...\"I was framed!\"...etc.\)\n");
				break;
				
			default:
				printf("invalid");
				break;
		}
		
	}
	printf("exiting...");
	return 0;
}