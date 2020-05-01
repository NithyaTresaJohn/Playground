#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int x1=3,y1=4,x,y,sqr;
 double power,power1,power2;
 std::cin>>x>>y; 
 power1=pow((x-x1),2);
 power2=pow((y-y1),2);
 power=power1+power2;
 sqr=sqrt(power);
 std::cout<<sqr;
}