#include<iostream>
using namespace std;
int main()
{
  int num,i;
  float dis,a=1.0;
  std::cin>>num;
  for(i=1;i<=num;i++)
  {
    dis=a/2;
    printf("%.1f ",dis);
    a=a*3;
  }
}