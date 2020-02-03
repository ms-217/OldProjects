#include <stdio.h>

//Used proportion: 1440/20 = 72 (mins in real day/real day mins in minecraft day = 72

int main()
{
	//start up
	printf("Minecraft Time Calculator\nVersion 1.0.1\n");
	printf("Scale: 20 mins = 1 Minecraft day\n");
	printf("NOTE: current version only computes real time to Minecraft time\n");
	
	int userhrs;
	printf("hrs: ");
	scanf("%d",&userhrs);
	
	int usermin;
	printf("mins: ");
	scanf("%d",&usermin);
	
	int usersec;
	printf("sec: ");
	scanf("%d",&usersec);
	
	int prohrs = (("%d", userhrs) * 72) * 60;
	int promin = ("%d", usermin) * 72;
	int prosec = (("%.4d", usersec) * 72) / 60.0;
	int protime = ("%d", prohrs) + ("%d", promin) + ("%.4d", prosec);
	
	printf("%d Mincraft Minutes\n", protime);
	
	int acthrs = ("%d", protime) / 60.0
	int actday = ("%d", acthrs) / 24.0
	int actmin = ("%d", act
	
	return 0;
}
