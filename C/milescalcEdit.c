#include <stdio.h>

// This is an edited version: 8/16/2016
int main()
{
	printf("Mile Calculator v7.9\n\n\n");
	printf("Mode \"1\": feet to miles\n");
	printf("Mode \"2\": miles to feet\n");
	printf("Mode \"3\": miles to inches\n");
	printf("Mode \"4\": inches to miles\n");
	printf("Mode \"5\": Miles to time\n");
	printf("Mode \"6\": Time to Miles\n");
	printf("Mode \"7\": Miles to Time w/mph input\n\n");
	
	int mode;
	{
		printf("please select a mode: ");
		scanf("%d",&mode);
		printf("\n\n");
	}
	
	switch(mode)
	{
		case 1:
		{	
			int ft;
			{	
				printf("enter the value for feet: ");
				scanf("%d",&ft);
			}
	
			float mi = ft / 5280.0;
	
			printf("%d feet = %d miles", ft, mi);
			break;
		}
		
		case 2:
		{
			int mi2;
			{
				printf("enter the value for Miles: ");
				scanf("%d",&mi2);
			}
			
			int ft2 = mi2 * 5280;
			
			printf("%d miles = %d feet", mi2, ft2);
			break;
		}
		
		case 3:
		{
			int mi3;
			{
				printf("enter the value for Miles: ");
				scanf("%d",&mi3);
			}
			
			int in3 = mi3 * 5280 * 12;
			
			printf("%d miles = %d inches", mi3, in3);
			break;
		}
		
		case 4:
		{
			int in4;
			{
				printf("enter the value for inches: ");
				scanf("%d",&in4);
			}
			
			int mi4 = in4 / 63360;
			
			printf("%d inches = %d Miles", in4, mi4);
			break;
		}
		
		case 5:
		{
			printf("Note: all times are rounded down\n");
			
			int mi5;
			{
				printf("enter the value for miles: ");
				scanf("%d",&mi5);
			}
			
			int h60r5 = mi5 / 60;
			int h60n5 = mi5 * 1;
			int m60n5 = h60n5 - (h60r5 * 60);
			
			int h70r5 = mi5 / 70.0;
			int h70n5 = mi5 / 70.0 * 60.0;
			int m70n5 = h70n5 - (h70r5 * 60.0);
			
			int h75r5 = mi5 / 75.0;
			int h75n5 = mi5 / 75.0 * 60.0;
			int m75n5 = h75n5 - (h75r5 * 60.0);
			
			printf("%d Miles is:\n\nhh:mm\n%.2d:%.2d highway \(60mph)\n\n%.2d:%.2d Interstate \(70mph)\n\n%.2d:%.2d Dad on Interstate \(75mph)", mi5, h60r5, m60n5, h70r5, m70n5, h75r5, m75n5);
			break;
		}
		
		case 6:
		{
			int hr6;
			{
				printf("enter the value for Hours: ");
				scanf("%d",&hr6);
			}
			
			int mn6;
			{
				printf("enter the value for Minutes: ");
				scanf("%d",&mn6);
			}
			
			int m60i6 = ((mn6 / 60) + hr6) * 60;
			int m70i6 = ((mn6 / 60) + hr6) * 70;
			int m75i6 = ((mn6 / 60) + hr6) * 75;
			
			printf("%.2d:%.2d is:\n\n%d Miles Highway \(60mph)\n\n%d Miles Interstate \(70mph)\n\n%d Miles Dad on Interstate \(75mph)", hr6, mn6, m60i6, m70i6, m75i6);
			break;
		}
		
		
		
		case 7:
		{
			int mi7;
			{
				printf("enter the value for miles: ");
				scanf("%d",&mi7);
			}
			
			float mph7;
			{
				printf("enter the speed of travel \(mph): ");
				scanf("%f",&mph7);
			}
			
			float hr7 = mi7 / mph7;
			float mr7 = mi7 / (mph7 * 60.0);

			float mn7 = mr7 - (hr7 * 60);
			printf("%d Miles going %d mph will take %f:%f", mi7, mph7, hr7, mn7);
			break;
		}
		
		default:
		{
			printf("That mode is invalid Willis!");
			break;
		}
	}
	return 0;
}